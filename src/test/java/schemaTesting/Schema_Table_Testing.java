package schemaTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Schema_Table_Testing {
	
	Connection con=null;
	Statement stmt=null;
	ResultSet rs;

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
	
	//To Check number of columns in a particular table
	@Test(priority=0)
   void test_table_NumOfCol() throws SQLException
	{
		stmt=con.createStatement();
		//after executing, returns the result set
		rs=stmt.executeQuery("SELECT count(*) as NumberOfColumns from information_schema.columns where table_name ='customers'");
		rs.next();
		{
		String NumberOfColumns =rs.getString("NumberOfColumns");
		System.out.println(":Database record is numberofcolumns:"+NumberOfColumns);
		}
}
	
	// Checks & displays all column names in table
	@Test(priority=1)
	void test_table_ColNames() throws SQLException
	{
		stmt=con.createStatement();
		//after executing, returns the result set
		rs=stmt.executeQuery("select column_name from information_schema.columns where table_name =N'customers'");
		while(rs.next());
		{
		String column_name =rs.getString("column_name");
		System.out.println(":Database record is ListOfColumnNames:"+column_name);
		
		  }
		}
	
		
	//Check datatype of column names in table
		
		@Test(priority=2)
		void test_table_ColNames_Datatype() throws SQLException
		{
			stmt=con.createStatement();
			//after executing, returns the result set
			rs=stmt.executeQuery("select column_name, data_type from information_schema.columns where table_name ='customers'");
			rs.next();
			{
			String column_name =rs.getString("column_name");
			System.out.println(":Database record is ListOfColumnName:"+column_name);
			
			String data_type =rs.getString("data_type");
			System.out.println(":Database record is ListOfColumnNameAndDataTypes:"+data_type);
			}
		}
			
		//	Check size of the column names in a  table
			
			@Test(priority=3)
			void test_table_SizeOfColNames() throws SQLException
			{
				stmt=con.createStatement();
				//after executing, returns the result set
				rs=stmt.executeQuery("select column_name, column_type from information_schema.columns where table_name ='customers'");
				rs.next();
				{
				String column_name =rs.getString("column_name");
				System.out.println(":Database record is ListOfColumnName:"+column_name);
				
				String column_type =rs.getString("column_type");
				System.out.println(":Database record is ListOfColumnNameAndColumnType:"+column_type);
				}
			}
				
		//Check null fields in a table		
				
				@Test(priority=4)
				void test_table_nullFields() throws SQLException
				{
					stmt=con.createStatement();
					//after executing, returns the result set
					rs=stmt.executeQuery("select column_name, is_nullable from information_schema.columns where table_name ='customers'");
					rs.next();
					{
					String column_name =rs.getString("column_name");
					System.out.println(":Database record is ListOfColumnName:"+column_name);
					
					String is_nullable =rs.getString("is_nullable");
					System.out.println(":Database record is ListOfColumnNameAndNullFields:"+is_nullable);
					}
} 
				
	//check column keys in a table
	@Test(priority=5)
	void test_table_columnkeys() throws SQLException
	{
		stmt=con.createStatement();
		//after executing, returns the result set
		rs=stmt.executeQuery("select column_name, column_key from information_schema.columns where table_name ='customers'");
		rs.next();
		{
		String column_name =rs.getString("column_name");
		System.out.println(":Database record is ListOfColumnName:"+column_name);
		
		String column_key =rs.getString("column_key");
		System.out.println(":Database record is ListOfColumnNameAndColumnKey:"+column_key);
		}
}
	
	//shows all table names & maps to which table_schema that tablename belongs to.
	@Test(priority=6)
	void test_tablename_tableschema() throws SQLException
	{
		stmt=con.createStatement();
		//after executing, returns the result set
		rs=stmt.executeQuery("SELECT table_name, table_schema\r\n"
				+ "FROM information_schema.tables\r\n"
				+ "WHERE table_type = 'BASE TABLE'\r\n"
				+ "ORDER BY table_name ASC;");
		rs.next();
		{
			String table_name =rs.getString("table_name");
			System.out.println(":Database record is ListOfTableName:"+table_name);
			
			String table_schema =rs.getString("table_schema");
			System.out.println(":Database record is ListOftable_schema:"+table_schema);
			}
	}
}
	
	
