/*package com.mohs10.base;

import java.sql.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;  
public class DB_connection{ 
	public WebDriver driver;
	
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("URL");  
 
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("Provide a sql query");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
@BeforeClass
public void beforeClass() {
 //instantiate chrome browser
 WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterClass
public void afterClass() {
 //close chrome browser
 driver.quit();
}
}*/

package com.mohs10.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DB_connection {
	//public WebDriver driver;	
	Connection con;
	Statement stmt = null;
	//public static ResultSet rs;
	
	 @BeforeTest
	 public void createconn() throws SQLException, ClassNotFoundException
	 {
		// load driver
		// Class.forName("com.mysql.jdbc.Driver");
		//Get connection
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","Hailey@700");
		 System.out.println("Connected to MySQL DB");
		 // Statement stmt = con.createStatement();
		 stmt = con.createStatement();
	 }
	 
	/* public void ResultSet(String query) throws SQLException {
		 String sql = "SELECT * FROM customers";
		 ResultSet rs = stmt.executeQuery(sql); 
	 }
	 */
	 @AfterTest
	 public void Closeconn() throws SQLException {
		 stmt.close();
		 System.out.println("Closed Connection to Database!");
	 }
/*	 @BeforeClass
	  public void beforeClass() {
	   //instantiate chrome browser
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	  @AfterClass
	  public void afterClass() {
	   //close chrome browser
	   driver.quit();
	  } */
	
}

