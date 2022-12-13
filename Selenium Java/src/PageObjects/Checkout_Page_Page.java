package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Checkout_Page_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Checkout")
	public static WebElement Checkout;

public void click_Checkout(){
		Checkout.click();
}

@FindBy(how= How.ID, using = "Billing_Address")
	public static WebElement Billing_Address;

public void click_Billing_Address(){
		Billing_Address.click();
}

@FindBy(how= How.ID, using = "Click_BA")
	public static WebElement Click_BA;

public void click_Click_BA(){
		Click_BA.click();
}

@FindBy(how= How.ID, using = "Shipping_Address")
	public static WebElement Shipping_Address;

public void click_Shipping_Address(){
		Shipping_Address.click();
}

@FindBy(how= How.ID, using = "Click_SA")
	public static WebElement Click_SA;

public void click_Click_SA(){
		Click_SA.click();
}

@FindBy(how= How.ID, using = "Shipping_method")
	public static WebElement Shipping_method;

public void click_Shipping_method(){
		Shipping_method.click();
}

@FindBy(how= How.ID, using = "Click_SM")
	public static WebElement Click_SM;

public void click_Click_SM(){
		Click_SM.click();
}

@FindBy(how= How.ID, using = "Payment_method")
	public static WebElement Payment_method;

public void click_Payment_method(){
		Payment_method.click();
}

@FindBy(how= How.ID, using = "Click_PM")
	public static WebElement Click_PM;

public void click_Click_PM(){
		Click_PM.click();
}

@FindBy(how= How.ID, using = "Payment_info")
	public static WebElement Payment_info;

public void click_Payment_info(){
		Payment_info.click();
}

@FindBy(how= How.ID, using = "Click___PI")
	public static WebElement Click___PI;

public void click_Click___PI(){
		Click___PI.click();
}

@FindBy(how= How.ID, using = "Confirm_Order")
	public static WebElement Confirm_Order;

public void click_Confirm_Order(){
		Confirm_Order.click();
}

@FindBy(how= How.ID, using = "Click___CO")
	public static WebElement Click___CO;

public void click_Click___CO(){
		Click___CO.click();
}

@FindBy(how= How.ID, using = "Billing_Address")
	public static WebElement Billing_Address;

public void verify_Billing_Address(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Billing_Address.getAttribute("value"),data);
	}

}

public void verify_Billing_Address_Status(String data){
		//Verifies the Status of the Billing_Address
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Billing_Address.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Billing_Address.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Billing_Address.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Billing_Address.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Billing_Address(String data){
		Billing_Address.clear();
		Billing_Address.sendKeys(data);
}

@FindBy(how= How.ID, using = "Shipping_Address_details")
	public static WebElement Shipping_Address_details;

public void verify_Shipping_Address_details(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Shipping_Address_details.getAttribute("value"),data);
	}

}

public void verify_Shipping_Address_details_Status(String data){
		//Verifies the Status of the Shipping_Address_details
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Shipping_Address_details.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Shipping_Address_details.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Shipping_Address_details.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Shipping_Address_details.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Shipping_Address_details(String data){
		Shipping_Address_details.clear();
		Shipping_Address_details.sendKeys(data);
}

@FindBy(how= How.ID, using = "Shipping_Addres")
	public static WebElement Shipping_Addres;

public void verify_Shipping_Addres(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Shipping_Addres.getAttribute("value"),data);
	}

}

public void verify_Shipping_Addres_Status(String data){
		//Verifies the Status of the Shipping_Addres
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Shipping_Addres.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Shipping_Addres.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Shipping_Addres.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Shipping_Addres.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Shipping_Addres(String data){
		Shipping_Addres.clear();
		Shipping_Addres.sendKeys(data);
}

@FindBy(how= How.ID, using = "options")
	public static WebElement options;

public void verify_options(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(options.getAttribute("name"),data);
	}

}

public void verify_options_Status(String data){
		//Verifies the Status of the options
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(options.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(options.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!options.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!options.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Back")
	public static WebElement Back;

public void verify_Back_Status(String data){
		//Verifies the Status of the Back
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Back.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Back.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Back.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Back.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Back(){
		Back.click();
}

@FindBy(how= How.ID, using = "Continue")
	public static WebElement Continue;

public void verify_Continue_Status(String data){
		//Verifies the Status of the Continue
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Continue.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Continue.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Continue.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Continue.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Continue(){
		Continue.click();
}

@FindBy(how= How.ID, using = "Confirm")
	public static WebElement Confirm;

public void verify_Confirm_Status(String data){
		//Verifies the Status of the Confirm
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Confirm.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Confirm.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Confirm.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Confirm.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Confirm(){
		Confirm.click();
}

@FindBy(how= How.ID, using = "Checkout_Gender")
	public WebElement Checkout_Gender;

public void verify_Checkout_Gender_Status(String data){
		//Verifies the Status of the Checkout_Gender
		Assert.assertEquals(Checkout_Gender,Checkout_Gender);
}

public void select_Checkout_Gender(){
		Checkout_Gender.click();
}

@FindBy(how= How.ID, using = "Checkout_Male")
	public WebElement Checkout_Male;

public void verify_Checkout_Male_Status(String data){
		//Verifies the Status of the Checkout_Male
		Assert.assertEquals(Checkout_Male,Checkout_Male);
}

public void select_Checkout_Male(){
		Checkout_Male.click();
}

@FindBy(how= How.ID, using = "Checkout_Female")
	public WebElement Checkout_Female;

public void verify_Checkout_Female_Status(String data){
		//Verifies the Status of the Checkout_Female
		Assert.assertEquals(Checkout_Female,Checkout_Female);
}

public void select_Checkout_Female(){
		Checkout_Female.click();
}

@FindBy(how= How.ID, using = "Checkout_Login")
	public WebElement Checkout_Login;

public void verify_Checkout_Login_Status(String data){
		//Verifies the Status of the Checkout_Login
		Assert.assertEquals(Checkout_Login,Checkout_Login);
}

public void select_Checkout_Login(){
		Checkout_Login.click();
}

@FindBy(how= How.ID, using = "Checkout_Shipping_options")
	public WebElement Checkout_Shipping_options;

public void verify_Checkout_Shipping_options_Status(String data){
		//Verifies the Status of the Checkout_Shipping_options
		Assert.assertEquals(Checkout_Shipping_options,Checkout_Shipping_options);
}

public void select_Checkout_Shipping_options(){
		Checkout_Shipping_options.click();
}

@FindBy(how= How.ID, using = "Checkout_Ground")
	public WebElement Checkout_Ground;

public void verify_Checkout_Ground_Status(String data){
		//Verifies the Status of the Checkout_Ground
		Assert.assertEquals(Checkout_Ground,Checkout_Ground);
}

public void select_Checkout_Ground(){
		Checkout_Ground.click();
}

@FindBy(how= How.ID, using = "Checkout_Next_Day_Air")
	public WebElement Checkout_Next_Day_Air;

public void verify_Checkout_Next_Day_Air_Status(String data){
		//Verifies the Status of the Checkout_Next_Day_Air
		Assert.assertEquals(Checkout_Next_Day_Air,Checkout_Next_Day_Air);
}

public void select_Checkout_Next_Day_Air(){
		Checkout_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "Checkout_2nd_Day_Air")
	public WebElement Checkout_2nd_Day_Air;

public void verify_Checkout_2nd_Day_Air_Status(String data){
		//Verifies the Status of the Checkout_2nd_Day_Air
		Assert.assertEquals(Checkout_2nd_Day_Air,Checkout_2nd_Day_Air);
}

public void select_Checkout_2nd_Day_Air(){
		Checkout_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "Checkout_payment_options")
	public WebElement Checkout_payment_options;

public void verify_Checkout_payment_options_Status(String data){
		//Verifies the Status of the Checkout_payment_options
		Assert.assertEquals(Checkout_payment_options,Checkout_payment_options);
}

public void select_Checkout_payment_options(){
		Checkout_payment_options.click();
}

@FindBy(how= How.ID, using = "Checkout_COD")
	public WebElement Checkout_COD;

public void verify_Checkout_COD_Status(String data){
		//Verifies the Status of the Checkout_COD
		Assert.assertEquals(Checkout_COD,Checkout_COD);
}

public void select_Checkout_COD(){
		Checkout_COD.click();
}

@FindBy(how= How.ID, using = "Checkout_Credit_Card")
	public WebElement Checkout_Credit_Card;

public void verify_Checkout_Credit_Card_Status(String data){
		//Verifies the Status of the Checkout_Credit_Card
		Assert.assertEquals(Checkout_Credit_Card,Checkout_Credit_Card);
}

public void select_Checkout_Credit_Card(){
		Checkout_Credit_Card.click();
}

@FindBy(how= How.ID, using = "Checkout_Check")
	public WebElement Checkout_Check;

public void verify_Checkout_Check_Status(String data){
		//Verifies the Status of the Checkout_Check
		Assert.assertEquals(Checkout_Check,Checkout_Check);
}

public void select_Checkout_Check(){
		Checkout_Check.click();
}

@FindBy(how= How.ID, using = "Checkout_PO")
	public WebElement Checkout_PO;

public void verify_Checkout_PO_Status(String data){
		//Verifies the Status of the Checkout_PO
		Assert.assertEquals(Checkout_PO,Checkout_PO);
}

public void select_Checkout_PO(){
		Checkout_PO.click();
}

@FindBy(how= How.ID, using = "Checkout_COnfirmation")
	public WebElement Checkout_COnfirmation;

public void verify_Checkout_COnfirmation_Status(String data){
		//Verifies the Status of the Checkout_COnfirmation
		Assert.assertEquals(Checkout_COnfirmation,Checkout_COnfirmation);
}

public void select_Checkout_COnfirmation(){
		Checkout_COnfirmation.click();
}

@FindBy(how= How.ID, using = "Checkout_Gender")
	public WebElement Checkout_Gender;

public void verify_Checkout_Gender_Status(String data){
		//Verifies the Status of the Checkout_Gender
		Assert.assertEquals(Checkout_Gender,Checkout_Gender);
}

public void select_Checkout_Gender(){
		Checkout_Gender.click();
}

@FindBy(how= How.ID, using = "Checkout_Male")
	public WebElement Checkout_Male;

public void verify_Checkout_Male_Status(String data){
		//Verifies the Status of the Checkout_Male
		Assert.assertEquals(Checkout_Male,Checkout_Male);
}

public void select_Checkout_Male(){
		Checkout_Male.click();
}

@FindBy(how= How.ID, using = "Checkout_Female")
	public WebElement Checkout_Female;

public void verify_Checkout_Female_Status(String data){
		//Verifies the Status of the Checkout_Female
		Assert.assertEquals(Checkout_Female,Checkout_Female);
}

public void select_Checkout_Female(){
		Checkout_Female.click();
}

@FindBy(how= How.ID, using = "Checkout_Login")
	public WebElement Checkout_Login;

public void verify_Checkout_Login_Status(String data){
		//Verifies the Status of the Checkout_Login
		Assert.assertEquals(Checkout_Login,Checkout_Login);
}

public void select_Checkout_Login(){
		Checkout_Login.click();
}

@FindBy(how= How.ID, using = "Checkout_Shipping_options")
	public WebElement Checkout_Shipping_options;

public void verify_Checkout_Shipping_options_Status(String data){
		//Verifies the Status of the Checkout_Shipping_options
		Assert.assertEquals(Checkout_Shipping_options,Checkout_Shipping_options);
}

public void select_Checkout_Shipping_options(){
		Checkout_Shipping_options.click();
}

@FindBy(how= How.ID, using = "Checkout_Ground")
	public WebElement Checkout_Ground;

public void verify_Checkout_Ground_Status(String data){
		//Verifies the Status of the Checkout_Ground
		Assert.assertEquals(Checkout_Ground,Checkout_Ground);
}

public void select_Checkout_Ground(){
		Checkout_Ground.click();
}

@FindBy(how= How.ID, using = "Checkout_Next_Day_Air")
	public WebElement Checkout_Next_Day_Air;

public void verify_Checkout_Next_Day_Air_Status(String data){
		//Verifies the Status of the Checkout_Next_Day_Air
		Assert.assertEquals(Checkout_Next_Day_Air,Checkout_Next_Day_Air);
}

public void select_Checkout_Next_Day_Air(){
		Checkout_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "Checkout_2nd_Day_Air")
	public WebElement Checkout_2nd_Day_Air;

public void verify_Checkout_2nd_Day_Air_Status(String data){
		//Verifies the Status of the Checkout_2nd_Day_Air
		Assert.assertEquals(Checkout_2nd_Day_Air,Checkout_2nd_Day_Air);
}

public void select_Checkout_2nd_Day_Air(){
		Checkout_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "Checkout_payment_options")
	public WebElement Checkout_payment_options;

public void verify_Checkout_payment_options_Status(String data){
		//Verifies the Status of the Checkout_payment_options
		Assert.assertEquals(Checkout_payment_options,Checkout_payment_options);
}

public void select_Checkout_payment_options(){
		Checkout_payment_options.click();
}

@FindBy(how= How.ID, using = "Checkout_COD")
	public WebElement Checkout_COD;

public void verify_Checkout_COD_Status(String data){
		//Verifies the Status of the Checkout_COD
		Assert.assertEquals(Checkout_COD,Checkout_COD);
}

public void select_Checkout_COD(){
		Checkout_COD.click();
}

@FindBy(how= How.ID, using = "Checkout_Credit_Card")
	public WebElement Checkout_Credit_Card;

public void verify_Checkout_Credit_Card_Status(String data){
		//Verifies the Status of the Checkout_Credit_Card
		Assert.assertEquals(Checkout_Credit_Card,Checkout_Credit_Card);
}

public void select_Checkout_Credit_Card(){
		Checkout_Credit_Card.click();
}

@FindBy(how= How.ID, using = "Checkout_Check")
	public WebElement Checkout_Check;

public void verify_Checkout_Check_Status(String data){
		//Verifies the Status of the Checkout_Check
		Assert.assertEquals(Checkout_Check,Checkout_Check);
}

public void select_Checkout_Check(){
		Checkout_Check.click();
}

@FindBy(how= How.ID, using = "Checkout_PO")
	public WebElement Checkout_PO;

public void verify_Checkout_PO_Status(String data){
		//Verifies the Status of the Checkout_PO
		Assert.assertEquals(Checkout_PO,Checkout_PO);
}

public void select_Checkout_PO(){
		Checkout_PO.click();
}

@FindBy(how= How.ID, using = "Checkout_COnfirmation")
	public WebElement Checkout_COnfirmation;

public void verify_Checkout_COnfirmation_Status(String data){
		//Verifies the Status of the Checkout_COnfirmation
		Assert.assertEquals(Checkout_COnfirmation,Checkout_COnfirmation);
}

public void select_Checkout_COnfirmation(){
		Checkout_COnfirmation.click();
}

@FindBy(how= How.ID, using = "options_Gender")
	public WebElement options_Gender;

public void verify_options_Gender_Status(String data){
		//Verifies the Status of the options_Gender
		Assert.assertEquals(options_Gender,options_Gender);
}

public void select_options_Gender(){
		options_Gender.click();
}

@FindBy(how= How.ID, using = "options_Male")
	public WebElement options_Male;

public void verify_options_Male_Status(String data){
		//Verifies the Status of the options_Male
		Assert.assertEquals(options_Male,options_Male);
}

public void select_options_Male(){
		options_Male.click();
}

@FindBy(how= How.ID, using = "options_Female")
	public WebElement options_Female;

public void verify_options_Female_Status(String data){
		//Verifies the Status of the options_Female
		Assert.assertEquals(options_Female,options_Female);
}

public void select_options_Female(){
		options_Female.click();
}

@FindBy(how= How.ID, using = "options_Login")
	public WebElement options_Login;

public void verify_options_Login_Status(String data){
		//Verifies the Status of the options_Login
		Assert.assertEquals(options_Login,options_Login);
}

public void select_options_Login(){
		options_Login.click();
}

@FindBy(how= How.ID, using = "options_Ground")
	public WebElement options_Ground;

public void verify_options_Ground_Status(String data){
		//Verifies the Status of the options_Ground
		Assert.assertEquals(options_Ground,options_Ground);
}

public void select_options_Ground(){
		options_Ground.click();
}

@FindBy(how= How.ID, using = "options_Next_Day_Air")
	public WebElement options_Next_Day_Air;

public void verify_options_Next_Day_Air_Status(String data){
		//Verifies the Status of the options_Next_Day_Air
		Assert.assertEquals(options_Next_Day_Air,options_Next_Day_Air);
}

public void select_options_Next_Day_Air(){
		options_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "options_2nd_Day_Air")
	public WebElement options_2nd_Day_Air;

public void verify_options_2nd_Day_Air_Status(String data){
		//Verifies the Status of the options_2nd_Day_Air
		Assert.assertEquals(options_2nd_Day_Air,options_2nd_Day_Air);
}

public void select_options_2nd_Day_Air(){
		options_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "options_payment_options")
	public WebElement options_payment_options;

public void verify_options_payment_options_Status(String data){
		//Verifies the Status of the options_payment_options
		Assert.assertEquals(options_payment_options,options_payment_options);
}

public void select_options_payment_options(){
		options_payment_options.click();
}

@FindBy(how= How.ID, using = "options_COD")
	public WebElement options_COD;

public void verify_options_COD_Status(String data){
		//Verifies the Status of the options_COD
		Assert.assertEquals(options_COD,options_COD);
}

public void select_options_COD(){
		options_COD.click();
}

@FindBy(how= How.ID, using = "options_Credit_Card")
	public WebElement options_Credit_Card;

public void verify_options_Credit_Card_Status(String data){
		//Verifies the Status of the options_Credit_Card
		Assert.assertEquals(options_Credit_Card,options_Credit_Card);
}

public void select_options_Credit_Card(){
		options_Credit_Card.click();
}

@FindBy(how= How.ID, using = "options_Check")
	public WebElement options_Check;

public void verify_options_Check_Status(String data){
		//Verifies the Status of the options_Check
		Assert.assertEquals(options_Check,options_Check);
}

public void select_options_Check(){
		options_Check.click();
}

@FindBy(how= How.ID, using = "options_PO")
	public WebElement options_PO;

public void verify_options_PO_Status(String data){
		//Verifies the Status of the options_PO
		Assert.assertEquals(options_PO,options_PO);
}

public void select_options_PO(){
		options_PO.click();
}

@FindBy(how= How.ID, using = "options_COnfirmation")
	public WebElement options_COnfirmation;

public void verify_options_COnfirmation_Status(String data){
		//Verifies the Status of the options_COnfirmation
		Assert.assertEquals(options_COnfirmation,options_COnfirmation);
}

public void select_options_COnfirmation(){
		options_COnfirmation.click();
}

@FindBy(how= How.ID, using = "options_Gender")
	public WebElement options_Gender;

public void verify_options_Gender_Status(String data){
		//Verifies the Status of the options_Gender
		Assert.assertEquals(options_Gender,options_Gender);
}

public void select_options_Gender(){
		options_Gender.click();
}

@FindBy(how= How.ID, using = "options_Male")
	public WebElement options_Male;

public void verify_options_Male_Status(String data){
		//Verifies the Status of the options_Male
		Assert.assertEquals(options_Male,options_Male);
}

public void select_options_Male(){
		options_Male.click();
}

@FindBy(how= How.ID, using = "options_Female")
	public WebElement options_Female;

public void verify_options_Female_Status(String data){
		//Verifies the Status of the options_Female
		Assert.assertEquals(options_Female,options_Female);
}

public void select_options_Female(){
		options_Female.click();
}

@FindBy(how= How.ID, using = "options_Login")
	public WebElement options_Login;

public void verify_options_Login_Status(String data){
		//Verifies the Status of the options_Login
		Assert.assertEquals(options_Login,options_Login);
}

public void select_options_Login(){
		options_Login.click();
}

@FindBy(how= How.ID, using = "options_Shipping_options")
	public WebElement options_Shipping_options;

public void verify_options_Shipping_options_Status(String data){
		//Verifies the Status of the options_Shipping_options
		Assert.assertEquals(options_Shipping_options,options_Shipping_options);
}

public void select_options_Shipping_options(){
		options_Shipping_options.click();
}

@FindBy(how= How.ID, using = "options_Ground")
	public WebElement options_Ground;

public void verify_options_Ground_Status(String data){
		//Verifies the Status of the options_Ground
		Assert.assertEquals(options_Ground,options_Ground);
}

public void select_options_Ground(){
		options_Ground.click();
}

@FindBy(how= How.ID, using = "options_Next_Day_Air")
	public WebElement options_Next_Day_Air;

public void verify_options_Next_Day_Air_Status(String data){
		//Verifies the Status of the options_Next_Day_Air
		Assert.assertEquals(options_Next_Day_Air,options_Next_Day_Air);
}

public void select_options_Next_Day_Air(){
		options_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "options_2nd_Day_Air")
	public WebElement options_2nd_Day_Air;

public void verify_options_2nd_Day_Air_Status(String data){
		//Verifies the Status of the options_2nd_Day_Air
		Assert.assertEquals(options_2nd_Day_Air,options_2nd_Day_Air);
}

public void select_options_2nd_Day_Air(){
		options_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "options_COD")
	public WebElement options_COD;

public void verify_options_COD_Status(String data){
		//Verifies the Status of the options_COD
		Assert.assertEquals(options_COD,options_COD);
}

public void select_options_COD(){
		options_COD.click();
}

@FindBy(how= How.ID, using = "options_Credit_Card")
	public WebElement options_Credit_Card;

public void verify_options_Credit_Card_Status(String data){
		//Verifies the Status of the options_Credit_Card
		Assert.assertEquals(options_Credit_Card,options_Credit_Card);
}

public void select_options_Credit_Card(){
		options_Credit_Card.click();
}

@FindBy(how= How.ID, using = "options_Check")
	public WebElement options_Check;

public void verify_options_Check_Status(String data){
		//Verifies the Status of the options_Check
		Assert.assertEquals(options_Check,options_Check);
}

public void select_options_Check(){
		options_Check.click();
}

@FindBy(how= How.ID, using = "options_PO")
	public WebElement options_PO;

public void verify_options_PO_Status(String data){
		//Verifies the Status of the options_PO
		Assert.assertEquals(options_PO,options_PO);
}

public void select_options_PO(){
		options_PO.click();
}

@FindBy(how= How.ID, using = "options_COnfirmation")
	public WebElement options_COnfirmation;

public void verify_options_COnfirmation_Status(String data){
		//Verifies the Status of the options_COnfirmation
		Assert.assertEquals(options_COnfirmation,options_COnfirmation);
}

public void select_options_COnfirmation(){
		options_COnfirmation.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}