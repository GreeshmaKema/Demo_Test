package com.mohs10.database_testing;

import java.sql.SQLException;

import org.testng.annotations.Test;

import com.mohs10.base.DB_connection;

public class DB_1 extends DB_connection {
	
	@Test(priority=0)
	public void Test1() throws ClassNotFoundException, SQLException, Exception {
		
		DB_Fetching fetch = new DB_Fetching();	
		fetch.ResultSets("query");   
		fetch.ResultSets("query1");
		}		
		}
		
