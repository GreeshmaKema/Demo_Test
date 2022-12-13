package com.mohs10.database_testing;

import java.util.Scanner;

public class Demo {
	//public class main {

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
	      Demo mn = new Demo();
	      try{
	          System.out.println("Enter your option");
	          System.out.println("select * from customers");
	          System.out.println("2) insert data");
	          System.out.println("3) delete data");
	          System.out.println("\n /////////////////////////// \n");
	          int a = sc.nextInt();
	          switch(a)
	          {
	              case 1 :
	                  mn.fetchData();
	                  break;
	        /*      case 2 :
	                  mn.takeDetails();
	                  break; */
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

	/*  public void takeDetails() throws Exception
	  {
	     System.out.println("Enter name");
	     String name = sc.next();
	     System.out.println("Enter age");
	     int age = sc.nextInt();
	     d.insertData(name, age);
	  }*/

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





//}
