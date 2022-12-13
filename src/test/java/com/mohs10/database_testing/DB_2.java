package com.mohs10.database_testing;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	public class DB_2 {

	    public static void main(String args[]) {
	        Connection conn = null;
	        Statement stmt = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels", "root", "Hailey@700");
	            System.out.println("DB CONNECTED!");
	            stmt=conn.createStatement();
	           
	            String sql = "SELECT * FROM customers";
	            ResultSet rs = stmt.executeQuery(sql);
	            while (rs.next()) {
	                System.out.println("I am " + rs.getString("customerName") + " and i live in " + rs.getString("country"));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            // System.out.println("Error: " + e.toString());
	        }
	    }
	}

