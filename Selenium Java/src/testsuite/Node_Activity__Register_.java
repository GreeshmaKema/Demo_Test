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
	Node_Activity__Register_
*/
public class Node_Activity__Register_ extends PageObjectBase
{

	public Node_Activity__Register_()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_URL_FIELD,final String Step_2_Register_HYPERLINK_Status,final String Step_2_Log_in_HYPERLINK_Status,final String Step_2_Shopping_cart_HYPERLINK_Status,final String Step_2_log_out_HYPERLINK_Status,final String Step_4_First_name_TEXTBOX_Status,final String Step_4_First_name_TEXTBOX_Verification,final String Step_4_Last_name_TEXTBOX_Status,final String Step_4_Last_name_TEXTBOX_Verification,final String Step_4_Email_TEXTBOX_Status,final String Step_4_Email_TEXTBOX_Verification,final String Step_4_Gender_RADIOBUTTONGROUP_Verification,final String Step_4_Male_RADIOBUTTON_Status,final String Step_4_Female_RADIOBUTTON_Status,final String Step_4_Password_TEXTBOX_Status,final String Step_4_Password_TEXTBOX_Verification,final String Step_4_Confirm_Password_TEXTBOX_Status,final String Step_4_Confirm_Password_TEXTBOX_Verification,final String Step_4_Register_BUTTON_Status,final String Step_5_First_name_TEXTBOX,final String Step_5_Last_name_TEXTBOX,final String Step_5_Email_TEXTBOX,final String Step_5_Gender_RADIOBUTTONGROUP,final String Step_6_Password_TEXTBOX,final String Step_6_Confirm_Password_TEXTBOX,final String Step_8_Register_HYPERLINK_Status,final String Step_8_Log_in_HYPERLINK_Status,final String Step_8_Shopping_cart_HYPERLINK_Status,final String Step_8_log_out_HYPERLINK_Status,final String Step_10_Criteria_FIELD,final String Step_10_Value_FIELD,final String Step_11_130_00_LABEL_Status,final String Step_11_Qty_TEXTBOX_Status,final String Step_11_Qty_TEXTBOX_Verification,final String Step_11_Add_to_Cart_BUTTON_Status,final String Step_12_Qty_TEXTBOX,final String Step_14_shopping_cart_HYPERLINK_Status,final String Step_16_Checkout_BUTTON_Status,final String Step_16_I_Agree_CHECKBOX_Status,final String Step_16_I_Agree_CHECKBOX_Verification,final String Step_17_I_Agree_CHECKBOX,final String Step_19_Billing_Address_TEXTBOX_Status,final String Step_19_Billing_Address_TEXTBOX_Verification,final String Step_19_Shipping_Addres_TEXTBOX_Status,final String Step_19_Shipping_Addres_TEXTBOX_Verification,final String Step_19_options_RADIOBUTTONGROUP_Verification,final String Step_19_Ground_RADIOBUTTON_Status,final String Step_19_Next_Day_Air_RADIOBUTTON_Status,final String Step_19_2nd_Day_Air_RADIOBUTTON_Status,final String Step_19_options_RADIOBUTTONGROUP_Verification,final String Step_19_COD_RADIOBUTTON_Status,final String Step_19_Credit_Card_RADIOBUTTON_Status,final String Step_19_Check_RADIOBUTTON_Status,final String Step_19_PO_RADIOBUTTON_Status,final String Step_19_Back_HYPERLINK_Status,final String Step_19_Continue_BUTTON_Status,final String Step_19_Confirm_BUTTON_Status,final String Step_20_Billing_Address_TEXTBOX,final String Step_22_Shipping_Addres_TEXTBOX,final String Step_24_options_RADIOBUTTONGROUP,final String Step_26_options_RADIOBUTTONGROUP,final String Step_30_Thank_you__Your_Order_has_been_received_LABEL_Status,final String Step_30_Click_to_Know_about_order_details_HYPERLINK_Status,final String Step_30_Continue_BUTTON_Status) throws Exception

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

	testReport.generateGeneralInfo(overallTestData, "Node_Activity__Register_", "TC_Node_Activity__Register_", "",ne);

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

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_2");

	Reporter.log("Step - 3- click Register hyperlink Main screen");

	testReport.fillTableStep("Step 3", "click Register hyperlink Main screen");

	main_page_init.click_Register();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_3");

	Reporter.log("Step - 4- verify Register screen");

	testReport.fillTableStep("Step 4", "verify Register screen");

	register_page_init.verify_First_name_Status(Step_4_First_name_TEXTBOX_Status);

	register_page_init.verify_First_name(Step_4_First_name_TEXTBOX_Verification);
	register_page_init.verify_Last_name_Status(Step_4_Last_name_TEXTBOX_Status);

	register_page_init.verify_Last_name(Step_4_Last_name_TEXTBOX_Verification);
	register_page_init.verify_Email_Status(Step_4_Email_TEXTBOX_Status);

	register_page_init.verify_Email(Step_4_Email_TEXTBOX_Verification);
	register_page_init.verify_Gender(Step_4_Gender_RADIOBUTTONGROUP_Verification);

	register_page_init.verify_Gender_Male_Status(Step_4_Male_RADIOBUTTON_Status);

	register_page_init.verify_Gender_Female_Status(Step_4_Female_RADIOBUTTON_Status);

	register_page_init.verify_Password_Status(Step_4_Password_TEXTBOX_Status);

	register_page_init.verify_Password(Step_4_Password_TEXTBOX_Verification);
	register_page_init.verify_Confirm_Password_Status(Step_4_Confirm_Password_TEXTBOX_Status);

	register_page_init.verify_Confirm_Password(Step_4_Confirm_Password_TEXTBOX_Verification);
	register_page_init.verify_Register_Status(Step_4_Register_BUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_4");

	Reporter.log("Step - 5- Fill Personal details form Register screen");

	testReport.fillTableStep("Step 5", "Fill Personal details form Register screen");

	register_page_init.set_First_name(Step_5_First_name_TEXTBOX);
	register_page_init.set_Last_name(Step_5_Last_name_TEXTBOX);
	register_page_init.set_Email(Step_5_Email_TEXTBOX);
	register_page_init.select_Gender_Step_5_Gender_RADIOBUTTONGROUP);

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_5");

	Reporter.log("Step - 6- Fill Your Password form Register screen");

	testReport.fillTableStep("Step 6", "Fill Your Password form Register screen");

	register_page_init.set_Password(Step_6_Password_TEXTBOX);
	register_page_init.set_Confirm_Password(Step_6_Confirm_Password_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_6");

	Reporter.log("Step - 7- click Register button Register screen");

	testReport.fillTableStep("Step 7", "click Register button Register screen");

	register_page_init.click_Register();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_7");

	Reporter.log("Step - 8- verify Main screen");

	testReport.fillTableStep("Step 8", "verify Main screen");

	main_page_init.verify_Register_Status(Step_8_Register_HYPERLINK_Status);

	main_page_init.verify_Log_in_Status(Step_8_Log_in_HYPERLINK_Status);

	main_page_init.verify_Shopping_cart_Status(Step_8_Shopping_cart_HYPERLINK_Status);

	main_page_init.verify_log_out_Status(Step_8_log_out_HYPERLINK_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_8");

	Reporter.log("Step - 9- Select Click clickchoice Main screen items menubar Jewelry menu");

	testReport.fillTableStep("Step 9", "Select Click clickchoice Main screen items menubar Jewelry menu");

	main_page_init.click_Click();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_9");

	Reporter.log("Step - 10- Perform Selecting an Item  Filters   Action");

	testReport.fillTableStep("Step 10", "Perform Selecting an Item  Filters   Action");

	selecting_an_item__filters___page_init.enter_Criteria(Step_10_Criteria_FIELD);

	selecting_an_item__filters___page_init.enter_Value(Step_10_Value_FIELD);


	Reporter.log("Step - 11- verify Product  screen");

	testReport.fillTableStep("Step 11", "verify Product  screen");

	product__page_init.verify_130_00_Status(Step_11_130_00_LABEL_Status);

	product__page_init.verify_Qty_Status(Step_11_Qty_TEXTBOX_Status);

	product__page_init.verify_Qty(Step_11_Qty_TEXTBOX_Verification);
	product__page_init.verify_Add_to_Cart_Status(Step_11_Add_to_Cart_BUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_11");

	Reporter.log("Step - 12- Fill Product details form Product  screen");

	testReport.fillTableStep("Step 12", "Fill Product details form Product  screen");

	product__page_init.set_Qty(Step_12_Qty_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_12");

	Reporter.log("Step - 13- click Add to Cart button Product  screen Product details form");

	testReport.fillTableStep("Step 13", "click Add to Cart button Product  screen Product details form");

	product__page_init.click_Add_to_Cart();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_13");

	Reporter.log("Step - 14- verify Add Cart message popup");

	testReport.fillTableStep("Step 14", "verify Add Cart message popup");

	add_cart_message_page_init.verify_Text("[Don't Care]");
	add_cart_message_page_init.verify_shopping_cart_Status(Step_14_shopping_cart_HYPERLINK_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_14");

	Reporter.log("Step - 15- click shopping cart hyperlink Add Cart message popup");

	testReport.fillTableStep("Step 15", "click shopping cart hyperlink Add Cart message popup");

	add_cart_message_page_init.click_shopping_cart();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_15");

	Reporter.log("Step - 16- verify Shopping Cart  screen");

	testReport.fillTableStep("Step 16", "verify Shopping Cart  screen");

	shopping_cart__page_init.verify_Checkout_Status(Step_16_Checkout_BUTTON_Status);

	shopping_cart__page_init.verify_I_Agree_Status(Step_16_I_Agree_CHECKBOX_Status);

	shopping_cart__page_init.verify_I_Agree(Step_16_I_Agree_CHECKBOX_Verification);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_16");

	Reporter.log("Step - 17- Fill Item List form Shopping Cart  screen");

	testReport.fillTableStep("Step 17", "Fill Item List form Shopping Cart  screen");

	shopping_cart__page_init.select_I_Agree(Step_17_I_Agree_CHECKBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_17");

	Reporter.log("Step - 18- click Checkout button Shopping Cart  screen");

	testReport.fillTableStep("Step 18", "click Checkout button Shopping Cart  screen");

	shopping_cart__page_init.click_Checkout();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_18");

	Reporter.log("Step - 19- verify Checkout Page screen");

	testReport.fillTableStep("Step 19", "verify Checkout Page screen");

	checkout_page_page_init.verify_Billing_Address_Status(Step_19_Billing_Address_TEXTBOX_Status);

	checkout_page_page_init.verify_Billing_Address(Step_19_Billing_Address_TEXTBOX_Verification);
	checkout_page_page_init.verify_Shipping_Addres_Status(Step_19_Shipping_Addres_TEXTBOX_Status);

	checkout_page_page_init.verify_Shipping_Addres(Step_19_Shipping_Addres_TEXTBOX_Verification);
	checkout_page_page_init.verify_options(Step_19_options_RADIOBUTTONGROUP_Verification);

	checkout_page_page_init.verify_options_Ground_Status(Step_19_Ground_RADIOBUTTON_Status);

	checkout_page_page_init.verify_options_Next_Day_Air_Status(Step_19_Next_Day_Air_RADIOBUTTON_Status);

	checkout_page_page_init.verify_options_2nd_Day_Air_Status(Step_19_2nd_Day_Air_RADIOBUTTON_Status);

	checkout_page_page_init.verify_options(Step_19_options_RADIOBUTTONGROUP_Verification);

	checkout_page_page_init.verify_options_COD_Status(Step_19_COD_RADIOBUTTON_Status);

	checkout_page_page_init.verify_options_Credit_Card_Status(Step_19_Credit_Card_RADIOBUTTON_Status);

	checkout_page_page_init.verify_options_Check_Status(Step_19_Check_RADIOBUTTON_Status);

	checkout_page_page_init.verify_options_PO_Status(Step_19_PO_RADIOBUTTON_Status);

	checkout_page_page_init.verify_Back_Status(Step_19_Back_HYPERLINK_Status);

	checkout_page_page_init.verify_Continue_Status(Step_19_Continue_BUTTON_Status);

	checkout_page_page_init.verify_Confirm_Status(Step_19_Confirm_BUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_19");

	Reporter.log("Step - 20- Fill Billing Addressdetails form Checkout Page screen");

	testReport.fillTableStep("Step 20", "Fill Billing Addressdetails form Checkout Page screen");

	checkout_page_page_init.set_Billing_Address(Step_20_Billing_Address_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_20");

	Reporter.log("Step - 21- click Continue button Checkout Page screen");

	testReport.fillTableStep("Step 21", "click Continue button Checkout Page screen");

	checkout_page_page_init.click_Continue();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_21");

	Reporter.log("Step - 22- Fill Shipping Address details form Checkout Page screen");

	testReport.fillTableStep("Step 22", "Fill Shipping Address details form Checkout Page screen");

	checkout_page_page_init.set_Shipping_Addres(Step_22_Shipping_Addres_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_22");

	Reporter.log("Step - 23- click Continue button Checkout Page screen");

	testReport.fillTableStep("Step 23", "click Continue button Checkout Page screen");

	checkout_page_page_init.click_Continue();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_23");

	Reporter.log("Step - 24- Fill Shipping Method  form Checkout Page screen");

	testReport.fillTableStep("Step 24", "Fill Shipping Method  form Checkout Page screen");

	checkout_page_page_init.select_options_Step_24_options_RADIOBUTTONGROUP);

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_24");

	Reporter.log("Step - 25- click Continue button Checkout Page screen");

	testReport.fillTableStep("Step 25", "click Continue button Checkout Page screen");

	checkout_page_page_init.click_Continue();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_25");

	Reporter.log("Step - 26- Fill Payment method details form Checkout Page screen");

	testReport.fillTableStep("Step 26", "Fill Payment method details form Checkout Page screen");

	checkout_page_page_init.select_options_Step_26_options_RADIOBUTTONGROUP);

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_26");

	Reporter.log("Step - 27- click Continue button Checkout Page screen");

	testReport.fillTableStep("Step 27", "click Continue button Checkout Page screen");

	checkout_page_page_init.click_Continue();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_27");

	Reporter.log("Step - 28- click Continue button Checkout Page screen");

	testReport.fillTableStep("Step 28", "click Continue button Checkout Page screen");

	checkout_page_page_init.click_Continue();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_28");

	Reporter.log("Step - 29- click Confirm button Checkout Page screen");

	testReport.fillTableStep("Step 29", "click Confirm button Checkout Page screen");

	checkout_page_page_init.click_Confirm();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_29");

	Reporter.log("Step - 30- verify Confirmation  screen");

	testReport.fillTableStep("Step 30", "verify Confirmation  screen");

	confirmation__page_init.verify_Thank_you__Your_Order_has_been_received_Status(Step_30_Thank_you__Your_Order_has_been_received_LABEL_Status);

	confirmation__page_init.verify_Click_to_Know_about_order_details_Status(Step_30_Click_to_Know_about_order_details_HYPERLINK_Status);

	confirmation__page_init.verify_Continue_Status(Step_30_Continue_BUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_30");

	Reporter.log("Step - 31- click Click to Know about order details hyperlink Confirmation  screen");

	testReport.fillTableStep("Step 31", "click Click to Know about order details hyperlink Confirmation  screen");

	confirmation__page_init.click_Click_to_Know_about_order_details();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_31");

	Reporter.log("Step - 32- click Continue button Confirmation  screen");

	testReport.fillTableStep("Step 32", "click Continue button Confirmation  screen");

	confirmation__page_init.click_Continue();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_32");

	Reporter.log("Step - 33- click log out hyperlink Main screen");

	testReport.fillTableStep("Step 33", "click log out hyperlink Main screen");

	main_page_init.click_log_out();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Register_","Step_33");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_3");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Node_Activity__Register_");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
