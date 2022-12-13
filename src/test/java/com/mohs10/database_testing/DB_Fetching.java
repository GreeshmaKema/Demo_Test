package com.mohs10.database_testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mohs10.base.DB_connection;

public class DB_Fetching extends DB_connection {
	Statement stmt;
	ResultSet rs;
	void Resultsets() {
		
	}
	//To get any specific column records
	public void ResultSets(String Alldata) throws SQLException {
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","Hailey@700");
		    Statement stmt	= con.createStatement();
		   // String query = "SELECT * FROM customers  where city='London'";
		    String query = "SELECT customerName, city FROM customers";
	    ResultSet rs = stmt.executeQuery(query);
        while(rs.next())
		    {
		        //gives only specified column names with all records
		        String customerName =rs.getString("customerName");
		    	System.out.println("customerName:"+customerName);
		    	
		    	String city=rs.getString("city");
		    	System.out.println("city:"+city);  
		    	System.out.println("");
		    }
        //to get specific column records using where command
        String query1 = "SELECT customerNumber FROM customers  where city='London'";
	    ResultSet rs1 = stmt.executeQuery(query1);
        while(rs1.next())
        
        {
		    	// displays 1st row
		   	System.out.println("customerNumber: " +rs1.getString(1)); //or rs.getString("column name");
		    	//System.out.print("customerNumber: " +rs.getInt(2));
		    	//System.out.println("customerName: " + rs.getString(2));
		    	//System.out.println("contactLastName: " + rs.getString(3));
		    	//System.out.println("contactFirstName: " + rs.getString(4)); 
		   
		    		}
		    	
		    	 
/*	  while(rs.next());
	     {
	           System.out.println("customerName : "+rs.getString("customerName"));
	            System.out.println("city : "+rs.getInt("city"));
	        } */

}
	
/*	public ResultSet select1(String sql) {
	    try {
	        this.stmt = con.prepareStatement(sql); // Prepares the Statement.
	      //  stmt.setInt();
	       return this.stmt.executeQuery(sql);  // calls Statement#executeQuery
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return null;
	    }
	}*/
	
}