package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;
import com.mohs10.reuse.Table;

	public class BD extends StartBrowser{
	
	//Clicking on Categories links #4
	@Test
	public void TableData_Test() throws Exception {
		Table tb = new Table();
		tb.passed();
		tb.failed();
		tb.skipped();	    
		Thread.sleep(5000);
	}
	
	
		}
