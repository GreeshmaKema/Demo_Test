package com.mohs10.database_testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	
	    Connection conObj;
	    Statement stObj;

	    public Database() throws SQLException , ClassNotFoundException {
	        Class.forName("com.mysql.jdbc.Driver"); /*Loading Driver class for JDBC*/

	 conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","Hailey@700"); /*Creating Connection class's Object which consist of database url , username and password*/

	stObj = conObj.createStatement();/*Creating Statement Class's object which is responsible for performing all db tasks*/
	    }

	    public void fetchData() throws Exception
	    {
	        String query = "select * from customers";
	        ResultSet rs = stObj.executeQuery(query);

	        while(rs.next())
	        {
	            System.out.println("Name : "+rs.getString("customerName"));
	            System.out.println("age : "+rs.getInt("city"));
	        }
	    }

/*	    public void insertData(String name, int age) throws SQLException 
	    {
	        if(name!=null &amp;&amp; age!=0)
	        {
	            String query = "insert into user values(\""+name+"\","+age+")";
	            int a = stObj.executeUpdate(query);

	            if(a == 1)
	            {
	                System.out.println("Update Successful");
	            }
	            else
	            {
	                System.out.println("Update Failed");
	            }
	        }
	    }*/

	    void deleteData() {
	    }

	    void deleteData(String name) throws Exception 
	    {
	        String query = "delete from user where name = \""+name+"\"";
	        int a = stObj.executeUpdate(query);

	        if(a == 1)
	        {
	                System.out.println("delete Successful");
	        }
	        else
	        {
	                System.out.println("deletion Failed");
	        }
	    }
	}

	/*public class main {

	    public static Database d;
	    public static Scanner sc;

	    static 
	    {
	        try{
	            sc = new Scanner(System.in); 
	            d = new Database();
	        }
	        catch(Exception e)
	        {
	            throw new RuntimeException(e);
	        }
	    }

	  public static void main(String... q)
	  {
	      main mn = new main();
	      try{
	          System.out.println("Enter your option");
	          System.out.println("1) fetch data");
	          System.out.println("2) insert data");
	          System.out.println("3) delete data");
	          System.out.println("\n /////////////////////////// \n");
	          int a = sc.nextInt();
	          switch(a)
	          {
	              case 1 :
	                  mn.fetchData();
	                  break;
	              case 2 :
	                  mn.takeDetails();
	                  break;
	              case 3 :
	                  mn.deleteData();
	                  break;
	              default:
	                  System.out.println("Try Again");
	                  break;
	          }
	      }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	      }
	  }

	  public void takeDetails() throws Exception
	  {
	     System.out.println("Enter name");
	     String name = sc.next();
	     System.out.println("Enter age");
	     int age = sc.nextInt();
	     d.insertData(name, age);
	  }

	  public void fetchData() throws Exception
	  {
	      d.fetchData();
	  }

	  private void deleteData() throws Exception {
	        System.out.println("Enter name of the user whose record is to be deleted");
	        String name = sc.next();
	        d.deleteData(name);
	    }
	} 
	*/




