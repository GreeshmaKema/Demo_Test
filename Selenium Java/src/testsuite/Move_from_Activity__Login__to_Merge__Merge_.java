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
	Move_from_Activity__Login__to_Merge__Merge_
*/
public class Move_from_Activity__Login__to_Merge__Merge_ extends PageObjectBase
{

	public Move_from_Activity__Login__to_Merge__Merge_()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_URL_FIELD,final String Step_2_Register_HYPERLINK_Status,final String Step_2_Log_in_HYPERLINK_Status,final String Step_2_Shopping_cart_HYPERLINK_Status,final String Step_2_log_out_HYPERLINK_Status,final String Step_4_email_TEXTBOX_Status,final String Step_4_email_TEXTBOX_Verification,final String Step_4_password_TEXTBOX_Status,final String Step_4_password_TEXTBOX_Verification,final String Step_4_forgot_password_HYPERLINK_Status,final String Step_4_login_BUTTON_Status,final String Step_5_email_TEXTBOX,final String Step_5_password_TEXTBOX,final String Step_7_Register_HYPERLINK_Status,final String Step_7_Log_in_HYPERLINK_Status,final String Step_7_Shopping_cart_HYPERLINK_Status,final String Step_7_log_out_HYPERLINK_Status,final String Step_9_Criteria_FIELD,final String Step_9_Value_FIELD,final String Step_10_130_00_LABEL_Status,final String Step_10_Qty_TEXTBOX_Status,final String Step_10_Qty_TEXTBOX_Verification,final String Step_10_Add_to_Cart_BUTTON_Status,final String Step_11_Qty_TEXTBOX,final String Step_13_shopping_cart_HYPERLINK_Status,final String Step_15_Checkout_BUTTON_Status,final String Step_15_I_Agree_CHECKBOX_Status,final String Step_15_I_Agree_CHECKBOX_Verification,final String Step_16_I_Agree_CHECKBOX,final String Step_18_Billing_Address_TEXTBOX_Status,final String Step_18_Billing_Address_TEXTBOX_Verification,final String Step_18_Shipping_Addres_TEXTBOX_Status,final String Step_18_Shipping_Addres_TEXTBOX_Verification,final String Step_18_options_RADIOBUTTONGROUP_Verification,final String Step_18_Ground_RADIOBUTTON_Status,final String Step_18_Next_Day_Air_RADIOBUTTON_Status,final String Step_18_2nd_Day_Air_RADIOBUTTON_Status,final String Step_18_options_RADIOBUTTONGROUP_Verification,final String Step_18_COD_RADIOBUTTON_Status,final String Step_18_Credit_Card_RADIOBUTTON_Status,final String Step_18_Check_RADIOBUTTON_Status,final String Step_18_PO_RADIOBUTTON_Status,final String Step_18_Back_HYPERLINK_Status,final String Step_18_Continue_BUTTON_Status,final String Step_18_Confirm_BUTTON_Status,final String Step_19_Billing_Address_TEXTBOX,final String Step_21_Shipping_Addres_TEXTBOX,final String Step_23_options_RADIOBUTTONGROUP,final String Step_25_options_RADIOBUTTONGROUP,final String Step_29_Thank_you__Your_Order_has_been_received_LABEL_Status,final String Step_29_Click_to_Know_about_order_details_HYPERLINK_Status,final String Step_29_Continue_BUTTON_Status) throws Exception

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

	testReport.generateGeneralInfo(overallTestData, "Move_from_Activity__Login__to_Merge__Merge_", "TC_Move_from_Activity__Login__to_Merge__Merge_", "",ne);

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

	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_2");

	Reporter.log("Step - 3- click Log in hyperlink Main screen");

	testReport.fillTableStep("Step 3", "click Log in hyperlink Main screen");

	main_page_init.click_Log_in();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_3");

	Reporter.log("Step - 4- verify Login screen");

	testReport.fillTableStep("Step 4", "verify Login screen");

	login_page_init.verify_email_Status(Step_4_email_TEXTBOX_Status);

	login_page_init.verify_email(Step_4_email_TEXTBOX_Verification);
	login_page_init.verify_password_Status(Step_4_password_TEXTBOX_Status);

	login_page_init.verify_password(Step_4_password_TEXTBOX_Verification);
	login_page_init.verify_forgot_password_Status(Step_4_forgot_password_HYPERLINK_Status);

	login_page_init.verify_login_Status(Step_4_login_BUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_4");

	Reporter.log("Step - 5- Fill Customer details form Login screen");

	testReport.fillTableStep("Step 5", "Fill Customer details form Login screen");

	login_page_init.set_email(Step_5_email_TEXTBOX);
	login_page_init.set_password(Step_5_password_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_5");

	Reporter.log("Step - 6- click login button Login screen");

	testReport.fillTableStep("Step 6", "click login button Login screen");

	login_page_init.click_login();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_6");

	Reporter.log("Step - 7- verify Main screen");

	testReport.fillTableStep("Step 7", "verify Main screen");

	main_page_init.verify_Register_Status(Step_7_Register_HYPERLINK_Status);

	main_page_init.verify_Log_in_Status(Step_7_Log_in_HYPERLINK_Status);

	main_page_init.verify_Shopping_cart_Status(Step_7_Shopping_cart_HYPERLINK_Status);

	main_page_init.verify_log_out_Status(Step_7_log_out_HYPERLINK_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_7");

	Reporter.log("Step - 8- Select Click clickchoice Main screen items menubar Jewelry menu");

	testReport.fillTableStep("Step 8", "Select Click clickchoice Main screen items menubar Jewelry menu");

	main_page_init.click_Click();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_8");

	Reporter.log("Step - 9- Perform Selecting an Item  Filters   Action");

	testReport.fillTableStep("Step 9", "Perform Selecting an Item  Filters   Action");

	selecting_an_item__filters___page_init.enter_Criteria(Step_9_Criteria_FIELD);

	selecting_an_item__filters___page_init.enter_Value(Step_9_Value_FIELD);


	Reporter.log("Step - 10- verify Product  screen");

	testReport.fillTableStep("Step 10", "verify Product  screen");

	product__page_init.verify_130_00_Status(Step_10_130_00_LABEL_Status);

	product__page_init.verify_Qty_Status(Step_10_Qty_TEXTBOX_Status);

	product__page_init.verify_Qty(Step_10_Qty_TEXTBOX_Verification);
	product__page_init.verify_Add_to_Cart_Status(Step_10_Add_to_Cart_BUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_10");

	Reporter.log("Step - 11- Fill Product details form Product  screen");

	testReport.fillTableStep("Step 11", "Fill Product details form Product  screen");

	product__page_init.set_Qty(Step_11_Qty_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_11");

	Reporter.log("Step - 12- click Add to Cart button Product  screen Product details form");

	testReport.fillTableStep("Step 12", "click Add to Cart button Product  screen Product details form");

	product__page_init.click_Add_to_Cart();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_12");

	Reporter.log("Step - 13- verify Add Cart message popup");

	testReport.fillTableStep("Step 13", "verify Add Cart message popup");

	add_cart_message_page_init.verify_Text("[Don't Care]");
	add_cart_message_page_init.verify_shopping_cart_Status(Step_13_shopping_cart_HYPERLINK_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_13");

	Reporter.log("Step - 14- click shopping cart hyperlink Add Cart message popup");

	testReport.fillTableStep("Step 14", "click shopping cart hyperlink Add Cart message popup");

	add_cart_message_page_init.click_shopping_cart();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_14");

	Reporter.log("Step - 15- verify Shopping Cart  screen");

	testReport.fillTableStep("Step 15", "verify Shopping Cart  screen");

	shopping_cart__page_init.verify_Checkout_Status(Step_15_Checkout_BUTTON_Status);

	shopping_cart__page_init.verify_I_Agree_Status(Step_15_I_Agree_CHECKBOX_Status);

	shopping_cart__page_init.verify_I_Agree(Step_15_I_Agree_CHECKBOX_Verification);
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_15");

	Reporter.log("Step - 16- Fill Item List form Shopping Cart  screen");

	testReport.fillTableStep("Step 16", "Fill Item List form Shopping Cart  screen");

	shopping_cart__page_init.select_I_Agree(Step_16_I_Agree_CHECKBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_16");

	Reporter.log("Step - 17- click Checkout button Shopping Cart  screen");

	testReport.fillTableStep("Step 17", "click Checkout button Shopping Cart  screen");

	shopping_cart__page_init.click_Checkout();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_17");

	Reporter.log("Step - 18- verify Checkout Page screen");

	testReport.fillTableStep("Step 18", "verify Checkout Page screen");

	checkout_page_page_init.verify_Billing_Address_Status(Step_18_Billing_Address_TEXTBOX_Status);

	checkout_page_page_init.verify_Billing_Address(Step_18_Billing_Address_TEXTBOX_Verification);
	checkout_page_page_init.verify_Shipping_Addres_Status(Step_18_Shipping_Addres_TEXTBOX_Status);

	checkout_page_page_init.verify_Shipping_Addres(Step_18_Shipping_Addres_TEXTBOX_Verification);
	checkout_page_page_init.verify_options(Step_18_options_RADIOBUTTONGROUP_Verification);

	checkout_page_page_init.verify_options_Ground_Status(Step_18_Ground_RADIOBUTTON_Status);

	checkout_page_page_init.verify_options_Next_Day_Air_Status(Step_18_Next_Day_Air_RADIOBUTTON_Status);

	checkout_page_page_init.verify_options_2nd_Day_Air_Status(Step_18_2nd_Day_Air_RADIOBUTTON_Status);

	checkout_page_page_init.verify_options(Step_18_options_RADIOBUTTONGROUP_Verification);

	checkout_page_page_init.verify_options_COD_Status(Step_18_COD_RADIOBUTTON_Status);

	checkout_page_page_init.verify_options_Credit_Card_Status(Step_18_Credit_Card_RADIOBUTTON_Status);

	checkout_page_page_init.verify_options_Check_Status(Step_18_Check_RADIOBUTTON_Status);

	checkout_page_page_init.verify_options_PO_Status(Step_18_PO_RADIOBUTTON_Status);

	checkout_page_page_init.verify_Back_Status(Step_18_Back_HYPERLINK_Status);

	checkout_page_page_init.verify_Continue_Status(Step_18_Continue_BUTTON_Status);

	checkout_page_page_init.verify_Confirm_Status(Step_18_Confirm_BUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_18");

	Reporter.log("Step - 19- Fill Billing Addressdetails form Checkout Page screen");

	testReport.fillTableStep("Step 19", "Fill Billing Addressdetails form Checkout Page screen");

	checkout_page_page_init.set_Billing_Address(Step_19_Billing_Address_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_19");

	Reporter.log("Step - 20- click Continue button Checkout Page screen");

	testReport.fillTableStep("Step 20", "click Continue button Checkout Page screen");

	checkout_page_page_init.click_Continue();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_20");

	Reporter.log("Step - 21- Fill Shipping Address details form Checkout Page screen");

	testReport.fillTableStep("Step 21", "Fill Shipping Address details form Checkout Page screen");

	checkout_page_page_init.set_Shipping_Addres(Step_21_Shipping_Addres_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_21");

	Reporter.log("Step - 22- click Continue button Checkout Page screen");

	testReport.fillTableStep("Step 22", "click Continue button Checkout Page screen");

	checkout_page_page_init.click_Continue();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_22");

	Reporter.log("Step - 23- Fill Shipping Method  form Checkout Page screen");

	testReport.fillTableStep("Step 23", "Fill Shipping Method  form Checkout Page screen");

	checkout_page_page_init.select_options_Step_23_options_RADIOBUTTONGROUP);

	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_23");

	Reporter.log("Step - 24- click Continue button Checkout Page screen");

	testReport.fillTableStep("Step 24", "click Continue button Checkout Page screen");

	checkout_page_page_init.click_Continue();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_24");

	Reporter.log("Step - 25- Fill Payment method details form Checkout Page screen");

	testReport.fillTableStep("Step 25", "Fill Payment method details form Checkout Page screen");

	checkout_page_page_init.select_options_Step_25_options_RADIOBUTTONGROUP);

	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_25");

	Reporter.log("Step - 26- click Continue button Checkout Page screen");

	testReport.fillTableStep("Step 26", "click Continue button Checkout Page screen");

	checkout_page_page_init.click_Continue();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_26");

	Reporter.log("Step - 27- click Continue button Checkout Page screen");

	testReport.fillTableStep("Step 27", "click Continue button Checkout Page screen");

	checkout_page_page_init.click_Continue();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_27");

	Reporter.log("Step - 28- click Confirm button Checkout Page screen");

	testReport.fillTableStep("Step 28", "click Confirm button Checkout Page screen");

	checkout_page_page_init.click_Confirm();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_28");

	Reporter.log("Step - 29- verify Confirmation  screen");

	testReport.fillTableStep("Step 29", "verify Confirmation  screen");

	confirmation__page_init.verify_Thank_you__Your_Order_has_been_received_Status(Step_29_Thank_you__Your_Order_has_been_received_LABEL_Status);

	confirmation__page_init.verify_Click_to_Know_about_order_details_Status(Step_29_Click_to_Know_about_order_details_HYPERLINK_Status);

	confirmation__page_init.verify_Continue_Status(Step_29_Continue_BUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_29");

	Reporter.log("Step - 30- click Click to Know about order details hyperlink Confirmation  screen");

	testReport.fillTableStep("Step 30", "click Click to Know about order details hyperlink Confirmation  screen");

	confirmation__page_init.click_Click_to_Know_about_order_details();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_30");

	Reporter.log("Step - 31- click Continue button Confirmation  screen");

	testReport.fillTableStep("Step 31", "click Continue button Confirmation  screen");

	confirmation__page_init.click_Continue();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_31");

	Reporter.log("Step - 32- click log out hyperlink Main screen");

	testReport.fillTableStep("Step 32", "click log out hyperlink Main screen");

	main_page_init.click_log_out();
	getScreenshot(driver,Configurations.screenshotLocation , "Move_from_Activity__Login__to_Merge__Merge_","Step_32");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_2");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Move_from_Activity__Login__to_Merge__Merge_");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
