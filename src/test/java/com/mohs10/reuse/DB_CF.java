package com.mohs10.reuse;

import org.openqa.selenium.WebDriver;

import com.mohs10.ActionDriver.Action;
import com.mohs10.base.StartBrowser;
import com.mohs10.or.HomePage;

public class DB_CF {

	public Action aDriver;
	public WebDriver driver;
	
	public DB_CF()
	{
		aDriver = new Action();
		driver = StartBrowser.driver;
	}
	// Login process
	public void Register(String Firstname, String Lastname, String Email, String Pwd, String ConfirmPwd) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Register in DemoWeb shop");
		aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		aDriver.click(HomePage.lnkRegister, "Register link");
}
}
