package testsuite;
import org.testng.annotations.Test;
import PageObjects.*;
import utilities.PageObjectBase;
import org.openqa.selenium.support.PageFactory;
import utilities.Configurations;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.util.HashMap;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import utilities.TestReport;
import java.io.IOException;
import org.testng.Reporter;
import utilities.DataUtil;


/** Conformiq generated test case
	Node_Activity__Error_
*/
public class Node_Activity__Error_ extends PageObjectBase
{

	public Node_Activity__Error_()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_URL_FIELD,final String Step_2_Register_HYPERLINK_Status,final String Step_2_Log_in_HYPERLINK_Status,final String Step_2_Shopping_cart_HYPERLINK_Status,final String Step_2_log_out_HYPERLINK_Status,final String Step_4_email_TEXTBOX_Status,final String Step_4_email_TEXTBOX_Verification,final String Step_4_password_TEXTBOX_Status,final String Step_4_password_TEXTBOX_Verification,final String Step_4_forgot_password_HYPERLINK_Status,final String Step_4_login_BUTTON_Status,final String Step_5_email_TEXTBOX,final String Step_5_password_TEXTBOX) throws Exception

	{

	Navigation_Page navigation_page_init=PageFactory.initElements(driver, Navigation_Page.class);

	Main_Page main_page_init=PageFactory.initElements(driver, Main_Page.class);

	Register_Page register_page_init=PageFactory.initElements(driver, Register_Page.class);

	Login_Page login_page_init=PageFactory.initElements(driver, Login_Page.class);

	Error_message_Page error_message_page_init=PageFactory.initElements(driver, Error_message_Page.class);

	Product_Page product_page_init=PageFactory.initElements(driver, Product_Page.class);

	Add_Cart_message_Page add_cart_message_page_init=PageFactory.initElements(driver, Add_Cart_message_Page.class);

	Shopping_Cart_Page shopping_cart_page_init=PageFactory.initElements(driver, Shopping_Cart_Page.class);

	Checkout_Page checkout_page_init=PageFactory.initElements(driver, Checkout_Page.class);

	COnfirmation_Page confirmation_page_init=PageFactory.initElements(driver, COnfirmation_Page.class);

	Confirmation_Page confirmation_page_init=PageFactory.initElements(driver, Confirmation_Page.class);

	Selecting_an_Item__Filters__Page selecting_an_item__filters__page_init=PageFactory.initElements(driver, Selecting_an_Item__Filters__Page.class);

	Checkout_Page_Page checkout_page_page_init=PageFactory.initElements(driver, Checkout_Page_Page.class);
	testReport.createTesthtmlHeader(overallTestData);

	testReport.createHead(overallTestData);

	testReport.putLogo(overallTestData);

	float ne = (float) 0.0;

	testReport.generateGeneralInfo(overallTestData, "Node_Activity__Error_", "TC_Node_Activity__Error_", "",ne);

	testReport.createStepHeader();

	//External Circumstances


	Reporter.log("Step - 1- Perform Navigation Action");

	testReport.fillTableStep("Step 1", "Perform Navigation Action");

	navigation_page_init.enter_URL(Step_1_URL_FIELD);


	Reporter.log("Step - 2- verify Main screen");

	testReport.fillTableStep("Step 2", "verify Main screen");

	main_page_init.verify_Register_Status(Step_2_Register_HYPERLINK_Status);

	main_page_init.verify_Log_in_Status(Step_2_Log_in_HYPERLINK_Status);

	main_page_init.verify_Shopping_cart_Status(Step_2_Shopping_cart_HYPERLINK_Status);

	main_page_init.verify_log_out_Status(Step_2_log_out_HYPERLINK_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Error_","Step_2");

	Reporter.log("Step - 3- click Log in hyperlink Main screen");

	testReport.fillTableStep("Step 3", "click Log in hyperlink Main screen");

	main_page_init.click_Log_in();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Error_","Step_3");

	Reporter.log("Step - 4- verify Login screen");

	testReport.fillTableStep("Step 4", "verify Login screen");

	login_page_init.verify_email_Status(Step_4_email_TEXTBOX_Status);

	login_page_init.verify_email(Step_4_email_TEXTBOX_Verification);
	login_page_init.verify_password_Status(Step_4_password_TEXTBOX_Status);

	login_page_init.verify_password(Step_4_password_TEXTBOX_Verification);
	login_page_init.verify_forgot_password_Status(Step_4_forgot_password_HYPERLINK_Status);

	login_page_init.verify_login_Status(Step_4_login_BUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Error_","Step_4");

	Reporter.log("Step - 5- Fill Customer details form Login screen");

	testReport.fillTableStep("Step 5", "Fill Customer details form Login screen");

	login_page_init.set_email(Step_5_email_TEXTBOX);
	login_page_init.set_password(Step_5_password_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Error_","Step_5");

	Reporter.log("Step - 6- click login button Login screen");

	testReport.fillTableStep("Step 6", "click login button Login screen");

	login_page_init.click_login();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Error_","Step_6");

	Reporter.log("Step - 7- verify Error message popup");

	testReport.fillTableStep("Step 7", "verify Error message popup");

	error_message_page_init.verify_Text("Invalid credentials");
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Error_","Step_7");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_1");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Node_Activity__Error_");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
