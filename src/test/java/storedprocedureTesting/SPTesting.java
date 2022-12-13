package storedprocedureTesting;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*Syntax									stores procedures
{ call procedure_name() }			Accept no parameters and return no value
{ call procedure_name(?,?) }		Accept 2 parameters and return no value
{?= call procedure_name() }			Accept no parameter and return value
{?= call procedure_name(?) }		Accept 1 parameters and return value
 */

public class SPTesting {
	
	Connection con=null;
	Statement stmt=null;
	ResultSet rs;
	CallableStatement cStmt;
	ResultSet rs1;
	ResultSet rs2; 
	
	@BeforeClass
	void setup() throws SQLException
	{
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","Hailey@700");
	}
	
	@AfterClass
	void tearDown() throws SQLException
	{
		con.close();
	}
	
	@Test(priority=1)
	void test_storedProcedureExists() throws SQLException
	{
		stmt=con.createStatement();
		//after executing, returns the result set
		rs=stmt.executeQuery("show procedure status where Name='selectAllCustomers'");
		//val:need to test the rs should contain the spname
		rs.next();
		//name of sp is string format,so i'm using getstring.specify clmn name where the spname exists
		//rs.getstring(name) will return the name of spname&that is = to our spname r not
		//so name should=our spname
		Assert.assertEquals(rs.getString("Name"),"selectAllCustomers");
	}

	@Test(priority=2) //no i/p parameter
	void test_SelectAllCustomers() throws SQLException
	{
		//before executing Q, prep a sp call, that will return cStmt&through that cStmt obj  we've to execute Q
		cStmt =con.prepareCall("{CALL SelectAllCustomers()}");
		rs1= cStmt.executeQuery(); //resultset1
		rs2= stmt.executeQuery("select * from customers"); //resultset2
		
		Assert.assertEquals(compareResultSets(rs1,rs2),true);
		}
	
	public boolean compareResultSets(ResultSet resultSet1, ResultSet resultSet2) throws SQLException{
		
		  while(resultSet1.next())
		  {
			  resultSet2.next();
			  int count = resultSet1.getMetaData().getColumnCount();
			  for(int i =1; i <= count; i++)
			  {
				  if(!StringUtils.equals(resultSet1.getString(i), resultSet2.getString(i)))
				  {
					  return false;
				  }
			  }
		  }
		return true;
}
	@Test(priority=3) // 1 i/p parameter
	void test_SelectAllCustomersByCity() throws SQLException
	{
		//before executing Q, prep a sp call, that will return cStmt&through that cStmt obj  we've to execute Q
		cStmt =con.prepareCall("{CALL SelectAllCustomersByCity(?)}");
		cStmt.setString(1, "Singapore");
		rs1= cStmt.executeQuery(); //resultset1
		rs2= stmt.executeQuery("select * from customers where city = 'Singapore'"); //resultset2
		
		Assert.assertEquals(compareResultSets(rs1,rs2),true);
		}
	//here need tto mntn lines 69-84
	
	@Test(priority=4) // 2 i/p parameters
	void test_SelectAllCustomersByCityAndPin() throws SQLException
	{
		//before executing Q, prep a sp call, that will return cStmt&through that cStmt obj  we've to execute Q
		cStmt =con.prepareCall("{CALL SelectAllCustomersByCityAndPin(?,?)}");
		cStmt.setString(1, "Singapore");
		cStmt.setString(2, "079903");
		rs1= cStmt.executeQuery(); //resultset1
		rs2= stmt.executeQuery("select  *  from customers where city = 'Singapore' and postalCode='079903'"); //resultset2
		
		Assert.assertEquals(compareResultSets(rs1,rs2),true);
		} 
	
	@Test(priority=5) // 1 i/p parameter, 4 o/p para
	void test_get_order_by_cust() throws SQLException
	{
		//before executing Q, prep a sp call, that will return cStmt&through that cStmt obj  we've to execute Q
		cStmt =con.prepareCall("{CALL get_order_by_cust(?,?,?,?,?)}");
		cStmt.setInt(1, 141);
		
		cStmt.registerOutParameter(2, Types.INTEGER);
		cStmt.registerOutParameter(3, Types.INTEGER);
		cStmt.registerOutParameter(4, Types.INTEGER);
		cStmt.registerOutParameter(5, Types.INTEGER);
		
		cStmt.executeQuery(); 
		int shipped=cStmt.getInt(2);
		int cancelled=cStmt.getInt(3);
		int resolved=cStmt.getInt(4);
		int disputed=cStmt.getInt(5);
		
	//	System.out.println(shipped+" "+cancelled+" "+resolved+" "+disputed);
		rs=stmt.executeQuery("select (SELECT count(*) as 'shipped' from orders where customerNumber = 141 and status ='shipped') as Shipped,\r\n"
				+ "(SELECT count(*) as 'cancelled' from orders where customerNumber = 141 and status ='cancelled') as Cancelled,\r\n"
				+ "(SELECT count(*) as 'resolved' from orders where customerNumber = 141 and status ='resolved') as resolved,\r\n"
				+ "(SELECT count(*) as 'disputed' from orders where customerNumber = 141 and status ='disputed') as disputed");
		
		rs.next();
		int exp_shipped=rs.getInt("shipped");
		int exp_cancelled=rs.getInt("cancelled");
		int exp_resolved=rs.getInt("resolved");
		int exp_disputed=rs.getInt("disputed");
		
		if(shipped==exp_shipped && cancelled==exp_cancelled && resolved==exp_resolved && disputed==exp_disputed)
		Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		}

	/*@Test(priority=6) // 1 i/p parameter, 1 o/p para
	void test_GetCustomerShipping() throws SQLException
	{
		//before executing Q, prep a sp call, that will return cStmt&through that cStmt obj  we've to execute Q
		cStmt =con.prepareCall("{CALL GetCustomerShipping(?,?)}");
		cStmt.setInt(1, 233);
		
		cStmt.registerOutParameter(2, Types.VARCHAR);
		
		cStmt.executeQuery(); 
		String ShippingTime=cStmt.getString(2);
		
		rs=stmt.executeQuery("SELECT country,\r\n"
				+ "CASE\r\n"
				+ "WHEN country='USA' THEN '2-day Shipping'\r\n"
				+ "WHEN country='Canada' THEN '3-day Shipping'\r\n"
				+ "ELSE '5-day Shipping'\r\n"
				+ "END as ShippingTime\r\n"
				+ "FROM customers WHERE customerNumber=233");
		
		rs.next();
		
	    String exp_ShippingTime=rs.getString("ShippingTime");
	    
	    Assert.assertEquals(ShippingTime, exp_ShippingTime);
	 	
		}*/
	
}






