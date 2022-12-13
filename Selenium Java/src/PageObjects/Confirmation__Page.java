package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Confirmation_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Billing_Address")
	public static WebElement Billing_Address;

public void click_Billing_Address(){
		Billing_Address.click();
}

@FindBy(how= How.ID, using = "Billing_address")
	public static WebElement Billing_address;

public void verify_Billing_address(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Billing_address.getAttribute("value"),data);
	}

}

public void verify_Billing_address_Status(String data){
		//Verifies the Status of the Billing_address
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Billing_address.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Billing_address.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Billing_address.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Billing_address.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Billing_address(String data){
		Billing_address.clear();
		Billing_address.sendKeys(data);
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

@FindBy(how= How.ID, using = "Thank_you__Your_Order_has_been_received")
	public static WebElement Thank_you__Your_Order_has_been_received;

public void verify_Thank_you__Your_Order_has_been_received(String data){
		Assert.assertEquals(Thank_you__Your_Order_has_been_received,Thank_you__Your_Order_has_been_received);
}

public void verify_Thank_you__Your_Order_has_been_received_Status(String data){
		//Verifies the Status of the Thank_you__Your_Order_has_been_received
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Thank_you__Your_Order_has_been_received.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Thank_you__Your_Order_has_been_received.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Thank_you__Your_Order_has_been_received.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Thank_you__Your_Order_has_been_received.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Click_to_Know_about_order_details")
	public static WebElement Click_to_Know_about_order_details;

public void verify_Click_to_Know_about_order_details_Status(String data){
		//Verifies the Status of the Click_to_Know_about_order_details
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Click_to_Know_about_order_details.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Click_to_Know_about_order_details.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Click_to_Know_about_order_details.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Click_to_Know_about_order_details.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Click_to_Know_about_order_details(){
		Click_to_Know_about_order_details.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Gender")
	public WebElement Billing_Address_Gender;

public void verify_Billing_Address_Gender_Status(String data){
		//Verifies the Status of the Billing_Address_Gender
		Assert.assertEquals(Billing_Address_Gender,Billing_Address_Gender);
}

public void select_Billing_Address_Gender(){
		Billing_Address_Gender.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Male")
	public WebElement Billing_Address_Male;

public void verify_Billing_Address_Male_Status(String data){
		//Verifies the Status of the Billing_Address_Male
		Assert.assertEquals(Billing_Address_Male,Billing_Address_Male);
}

public void select_Billing_Address_Male(){
		Billing_Address_Male.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Female")
	public WebElement Billing_Address_Female;

public void verify_Billing_Address_Female_Status(String data){
		//Verifies the Status of the Billing_Address_Female
		Assert.assertEquals(Billing_Address_Female,Billing_Address_Female);
}

public void select_Billing_Address_Female(){
		Billing_Address_Female.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Login")
	public WebElement Billing_Address_Login;

public void verify_Billing_Address_Login_Status(String data){
		//Verifies the Status of the Billing_Address_Login
		Assert.assertEquals(Billing_Address_Login,Billing_Address_Login);
}

public void select_Billing_Address_Login(){
		Billing_Address_Login.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Shipping_options")
	public WebElement Billing_Address_Shipping_options;

public void verify_Billing_Address_Shipping_options_Status(String data){
		//Verifies the Status of the Billing_Address_Shipping_options
		Assert.assertEquals(Billing_Address_Shipping_options,Billing_Address_Shipping_options);
}

public void select_Billing_Address_Shipping_options(){
		Billing_Address_Shipping_options.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Ground")
	public WebElement Billing_Address_Ground;

public void verify_Billing_Address_Ground_Status(String data){
		//Verifies the Status of the Billing_Address_Ground
		Assert.assertEquals(Billing_Address_Ground,Billing_Address_Ground);
}

public void select_Billing_Address_Ground(){
		Billing_Address_Ground.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Next_Day_Air")
	public WebElement Billing_Address_Next_Day_Air;

public void verify_Billing_Address_Next_Day_Air_Status(String data){
		//Verifies the Status of the Billing_Address_Next_Day_Air
		Assert.assertEquals(Billing_Address_Next_Day_Air,Billing_Address_Next_Day_Air);
}

public void select_Billing_Address_Next_Day_Air(){
		Billing_Address_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "Billing_Address_2nd_Day_Air")
	public WebElement Billing_Address_2nd_Day_Air;

public void verify_Billing_Address_2nd_Day_Air_Status(String data){
		//Verifies the Status of the Billing_Address_2nd_Day_Air
		Assert.assertEquals(Billing_Address_2nd_Day_Air,Billing_Address_2nd_Day_Air);
}

public void select_Billing_Address_2nd_Day_Air(){
		Billing_Address_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "Billing_Address_payment_options")
	public WebElement Billing_Address_payment_options;

public void verify_Billing_Address_payment_options_Status(String data){
		//Verifies the Status of the Billing_Address_payment_options
		Assert.assertEquals(Billing_Address_payment_options,Billing_Address_payment_options);
}

public void select_Billing_Address_payment_options(){
		Billing_Address_payment_options.click();
}

@FindBy(how= How.ID, using = "Billing_Address_COD")
	public WebElement Billing_Address_COD;

public void verify_Billing_Address_COD_Status(String data){
		//Verifies the Status of the Billing_Address_COD
		Assert.assertEquals(Billing_Address_COD,Billing_Address_COD);
}

public void select_Billing_Address_COD(){
		Billing_Address_COD.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Credit_Card")
	public WebElement Billing_Address_Credit_Card;

public void verify_Billing_Address_Credit_Card_Status(String data){
		//Verifies the Status of the Billing_Address_Credit_Card
		Assert.assertEquals(Billing_Address_Credit_Card,Billing_Address_Credit_Card);
}

public void select_Billing_Address_Credit_Card(){
		Billing_Address_Credit_Card.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Check")
	public WebElement Billing_Address_Check;

public void verify_Billing_Address_Check_Status(String data){
		//Verifies the Status of the Billing_Address_Check
		Assert.assertEquals(Billing_Address_Check,Billing_Address_Check);
}

public void select_Billing_Address_Check(){
		Billing_Address_Check.click();
}

@FindBy(how= How.ID, using = "Billing_Address_PO")
	public WebElement Billing_Address_PO;

public void verify_Billing_Address_PO_Status(String data){
		//Verifies the Status of the Billing_Address_PO
		Assert.assertEquals(Billing_Address_PO,Billing_Address_PO);
}

public void select_Billing_Address_PO(){
		Billing_Address_PO.click();
}

@FindBy(how= How.ID, using = "Billing_Address_COnfirmation")
	public WebElement Billing_Address_COnfirmation;

public void verify_Billing_Address_COnfirmation_Status(String data){
		//Verifies the Status of the Billing_Address_COnfirmation
		Assert.assertEquals(Billing_Address_COnfirmation,Billing_Address_COnfirmation);
}

public void select_Billing_Address_COnfirmation(){
		Billing_Address_COnfirmation.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Gender")
	public WebElement Billing_Address_Gender;

public void verify_Billing_Address_Gender_Status(String data){
		//Verifies the Status of the Billing_Address_Gender
		Assert.assertEquals(Billing_Address_Gender,Billing_Address_Gender);
}

public void select_Billing_Address_Gender(){
		Billing_Address_Gender.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Male")
	public WebElement Billing_Address_Male;

public void verify_Billing_Address_Male_Status(String data){
		//Verifies the Status of the Billing_Address_Male
		Assert.assertEquals(Billing_Address_Male,Billing_Address_Male);
}

public void select_Billing_Address_Male(){
		Billing_Address_Male.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Female")
	public WebElement Billing_Address_Female;

public void verify_Billing_Address_Female_Status(String data){
		//Verifies the Status of the Billing_Address_Female
		Assert.assertEquals(Billing_Address_Female,Billing_Address_Female);
}

public void select_Billing_Address_Female(){
		Billing_Address_Female.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Login")
	public WebElement Billing_Address_Login;

public void verify_Billing_Address_Login_Status(String data){
		//Verifies the Status of the Billing_Address_Login
		Assert.assertEquals(Billing_Address_Login,Billing_Address_Login);
}

public void select_Billing_Address_Login(){
		Billing_Address_Login.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Shipping_options")
	public WebElement Billing_Address_Shipping_options;

public void verify_Billing_Address_Shipping_options_Status(String data){
		//Verifies the Status of the Billing_Address_Shipping_options
		Assert.assertEquals(Billing_Address_Shipping_options,Billing_Address_Shipping_options);
}

public void select_Billing_Address_Shipping_options(){
		Billing_Address_Shipping_options.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Ground")
	public WebElement Billing_Address_Ground;

public void verify_Billing_Address_Ground_Status(String data){
		//Verifies the Status of the Billing_Address_Ground
		Assert.assertEquals(Billing_Address_Ground,Billing_Address_Ground);
}

public void select_Billing_Address_Ground(){
		Billing_Address_Ground.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Next_Day_Air")
	public WebElement Billing_Address_Next_Day_Air;

public void verify_Billing_Address_Next_Day_Air_Status(String data){
		//Verifies the Status of the Billing_Address_Next_Day_Air
		Assert.assertEquals(Billing_Address_Next_Day_Air,Billing_Address_Next_Day_Air);
}

public void select_Billing_Address_Next_Day_Air(){
		Billing_Address_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "Billing_Address_2nd_Day_Air")
	public WebElement Billing_Address_2nd_Day_Air;

public void verify_Billing_Address_2nd_Day_Air_Status(String data){
		//Verifies the Status of the Billing_Address_2nd_Day_Air
		Assert.assertEquals(Billing_Address_2nd_Day_Air,Billing_Address_2nd_Day_Air);
}

public void select_Billing_Address_2nd_Day_Air(){
		Billing_Address_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "Billing_Address_payment_options")
	public WebElement Billing_Address_payment_options;

public void verify_Billing_Address_payment_options_Status(String data){
		//Verifies the Status of the Billing_Address_payment_options
		Assert.assertEquals(Billing_Address_payment_options,Billing_Address_payment_options);
}

public void select_Billing_Address_payment_options(){
		Billing_Address_payment_options.click();
}

@FindBy(how= How.ID, using = "Billing_Address_COD")
	public WebElement Billing_Address_COD;

public void verify_Billing_Address_COD_Status(String data){
		//Verifies the Status of the Billing_Address_COD
		Assert.assertEquals(Billing_Address_COD,Billing_Address_COD);
}

public void select_Billing_Address_COD(){
		Billing_Address_COD.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Credit_Card")
	public WebElement Billing_Address_Credit_Card;

public void verify_Billing_Address_Credit_Card_Status(String data){
		//Verifies the Status of the Billing_Address_Credit_Card
		Assert.assertEquals(Billing_Address_Credit_Card,Billing_Address_Credit_Card);
}

public void select_Billing_Address_Credit_Card(){
		Billing_Address_Credit_Card.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Check")
	public WebElement Billing_Address_Check;

public void verify_Billing_Address_Check_Status(String data){
		//Verifies the Status of the Billing_Address_Check
		Assert.assertEquals(Billing_Address_Check,Billing_Address_Check);
}

public void select_Billing_Address_Check(){
		Billing_Address_Check.click();
}

@FindBy(how= How.ID, using = "Billing_Address_PO")
	public WebElement Billing_Address_PO;

public void verify_Billing_Address_PO_Status(String data){
		//Verifies the Status of the Billing_Address_PO
		Assert.assertEquals(Billing_Address_PO,Billing_Address_PO);
}

public void select_Billing_Address_PO(){
		Billing_Address_PO.click();
}

@FindBy(how= How.ID, using = "Billing_Address_COnfirmation")
	public WebElement Billing_Address_COnfirmation;

public void verify_Billing_Address_COnfirmation_Status(String data){
		//Verifies the Status of the Billing_Address_COnfirmation
		Assert.assertEquals(Billing_Address_COnfirmation,Billing_Address_COnfirmation);
}

public void select_Billing_Address_COnfirmation(){
		Billing_Address_COnfirmation.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Gender")
	public WebElement Billing_Address_Gender;

public void verify_Billing_Address_Gender_Status(String data){
		//Verifies the Status of the Billing_Address_Gender
		Assert.assertEquals(Billing_Address_Gender,Billing_Address_Gender);
}

public void select_Billing_Address_Gender(){
		Billing_Address_Gender.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Male")
	public WebElement Billing_Address_Male;

public void verify_Billing_Address_Male_Status(String data){
		//Verifies the Status of the Billing_Address_Male
		Assert.assertEquals(Billing_Address_Male,Billing_Address_Male);
}

public void select_Billing_Address_Male(){
		Billing_Address_Male.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Female")
	public WebElement Billing_Address_Female;

public void verify_Billing_Address_Female_Status(String data){
		//Verifies the Status of the Billing_Address_Female
		Assert.assertEquals(Billing_Address_Female,Billing_Address_Female);
}

public void select_Billing_Address_Female(){
		Billing_Address_Female.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Login")
	public WebElement Billing_Address_Login;

public void verify_Billing_Address_Login_Status(String data){
		//Verifies the Status of the Billing_Address_Login
		Assert.assertEquals(Billing_Address_Login,Billing_Address_Login);
}

public void select_Billing_Address_Login(){
		Billing_Address_Login.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Shipping_options")
	public WebElement Billing_Address_Shipping_options;

public void verify_Billing_Address_Shipping_options_Status(String data){
		//Verifies the Status of the Billing_Address_Shipping_options
		Assert.assertEquals(Billing_Address_Shipping_options,Billing_Address_Shipping_options);
}

public void select_Billing_Address_Shipping_options(){
		Billing_Address_Shipping_options.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Ground")
	public WebElement Billing_Address_Ground;

public void verify_Billing_Address_Ground_Status(String data){
		//Verifies the Status of the Billing_Address_Ground
		Assert.assertEquals(Billing_Address_Ground,Billing_Address_Ground);
}

public void select_Billing_Address_Ground(){
		Billing_Address_Ground.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Next_Day_Air")
	public WebElement Billing_Address_Next_Day_Air;

public void verify_Billing_Address_Next_Day_Air_Status(String data){
		//Verifies the Status of the Billing_Address_Next_Day_Air
		Assert.assertEquals(Billing_Address_Next_Day_Air,Billing_Address_Next_Day_Air);
}

public void select_Billing_Address_Next_Day_Air(){
		Billing_Address_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "Billing_Address_2nd_Day_Air")
	public WebElement Billing_Address_2nd_Day_Air;

public void verify_Billing_Address_2nd_Day_Air_Status(String data){
		//Verifies the Status of the Billing_Address_2nd_Day_Air
		Assert.assertEquals(Billing_Address_2nd_Day_Air,Billing_Address_2nd_Day_Air);
}

public void select_Billing_Address_2nd_Day_Air(){
		Billing_Address_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "Billing_Address_payment_options")
	public WebElement Billing_Address_payment_options;

public void verify_Billing_Address_payment_options_Status(String data){
		//Verifies the Status of the Billing_Address_payment_options
		Assert.assertEquals(Billing_Address_payment_options,Billing_Address_payment_options);
}

public void select_Billing_Address_payment_options(){
		Billing_Address_payment_options.click();
}

@FindBy(how= How.ID, using = "Billing_Address_COD")
	public WebElement Billing_Address_COD;

public void verify_Billing_Address_COD_Status(String data){
		//Verifies the Status of the Billing_Address_COD
		Assert.assertEquals(Billing_Address_COD,Billing_Address_COD);
}

public void select_Billing_Address_COD(){
		Billing_Address_COD.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Credit_Card")
	public WebElement Billing_Address_Credit_Card;

public void verify_Billing_Address_Credit_Card_Status(String data){
		//Verifies the Status of the Billing_Address_Credit_Card
		Assert.assertEquals(Billing_Address_Credit_Card,Billing_Address_Credit_Card);
}

public void select_Billing_Address_Credit_Card(){
		Billing_Address_Credit_Card.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Check")
	public WebElement Billing_Address_Check;

public void verify_Billing_Address_Check_Status(String data){
		//Verifies the Status of the Billing_Address_Check
		Assert.assertEquals(Billing_Address_Check,Billing_Address_Check);
}

public void select_Billing_Address_Check(){
		Billing_Address_Check.click();
}

@FindBy(how= How.ID, using = "Billing_Address_PO")
	public WebElement Billing_Address_PO;

public void verify_Billing_Address_PO_Status(String data){
		//Verifies the Status of the Billing_Address_PO
		Assert.assertEquals(Billing_Address_PO,Billing_Address_PO);
}

public void select_Billing_Address_PO(){
		Billing_Address_PO.click();
}

@FindBy(how= How.ID, using = "Billing_Address_COnfirmation")
	public WebElement Billing_Address_COnfirmation;

public void verify_Billing_Address_COnfirmation_Status(String data){
		//Verifies the Status of the Billing_Address_COnfirmation
		Assert.assertEquals(Billing_Address_COnfirmation,Billing_Address_COnfirmation);
}

public void select_Billing_Address_COnfirmation(){
		Billing_Address_COnfirmation.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Gender")
	public WebElement Billing_Address_Gender;

public void verify_Billing_Address_Gender_Status(String data){
		//Verifies the Status of the Billing_Address_Gender
		Assert.assertEquals(Billing_Address_Gender,Billing_Address_Gender);
}

public void select_Billing_Address_Gender(){
		Billing_Address_Gender.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Male")
	public WebElement Billing_Address_Male;

public void verify_Billing_Address_Male_Status(String data){
		//Verifies the Status of the Billing_Address_Male
		Assert.assertEquals(Billing_Address_Male,Billing_Address_Male);
}

public void select_Billing_Address_Male(){
		Billing_Address_Male.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Female")
	public WebElement Billing_Address_Female;

public void verify_Billing_Address_Female_Status(String data){
		//Verifies the Status of the Billing_Address_Female
		Assert.assertEquals(Billing_Address_Female,Billing_Address_Female);
}

public void select_Billing_Address_Female(){
		Billing_Address_Female.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Login")
	public WebElement Billing_Address_Login;

public void verify_Billing_Address_Login_Status(String data){
		//Verifies the Status of the Billing_Address_Login
		Assert.assertEquals(Billing_Address_Login,Billing_Address_Login);
}

public void select_Billing_Address_Login(){
		Billing_Address_Login.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Shipping_options")
	public WebElement Billing_Address_Shipping_options;

public void verify_Billing_Address_Shipping_options_Status(String data){
		//Verifies the Status of the Billing_Address_Shipping_options
		Assert.assertEquals(Billing_Address_Shipping_options,Billing_Address_Shipping_options);
}

public void select_Billing_Address_Shipping_options(){
		Billing_Address_Shipping_options.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Ground")
	public WebElement Billing_Address_Ground;

public void verify_Billing_Address_Ground_Status(String data){
		//Verifies the Status of the Billing_Address_Ground
		Assert.assertEquals(Billing_Address_Ground,Billing_Address_Ground);
}

public void select_Billing_Address_Ground(){
		Billing_Address_Ground.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Next_Day_Air")
	public WebElement Billing_Address_Next_Day_Air;

public void verify_Billing_Address_Next_Day_Air_Status(String data){
		//Verifies the Status of the Billing_Address_Next_Day_Air
		Assert.assertEquals(Billing_Address_Next_Day_Air,Billing_Address_Next_Day_Air);
}

public void select_Billing_Address_Next_Day_Air(){
		Billing_Address_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "Billing_Address_2nd_Day_Air")
	public WebElement Billing_Address_2nd_Day_Air;

public void verify_Billing_Address_2nd_Day_Air_Status(String data){
		//Verifies the Status of the Billing_Address_2nd_Day_Air
		Assert.assertEquals(Billing_Address_2nd_Day_Air,Billing_Address_2nd_Day_Air);
}

public void select_Billing_Address_2nd_Day_Air(){
		Billing_Address_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "Billing_Address_payment_options")
	public WebElement Billing_Address_payment_options;

public void verify_Billing_Address_payment_options_Status(String data){
		//Verifies the Status of the Billing_Address_payment_options
		Assert.assertEquals(Billing_Address_payment_options,Billing_Address_payment_options);
}

public void select_Billing_Address_payment_options(){
		Billing_Address_payment_options.click();
}

@FindBy(how= How.ID, using = "Billing_Address_COD")
	public WebElement Billing_Address_COD;

public void verify_Billing_Address_COD_Status(String data){
		//Verifies the Status of the Billing_Address_COD
		Assert.assertEquals(Billing_Address_COD,Billing_Address_COD);
}

public void select_Billing_Address_COD(){
		Billing_Address_COD.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Credit_Card")
	public WebElement Billing_Address_Credit_Card;

public void verify_Billing_Address_Credit_Card_Status(String data){
		//Verifies the Status of the Billing_Address_Credit_Card
		Assert.assertEquals(Billing_Address_Credit_Card,Billing_Address_Credit_Card);
}

public void select_Billing_Address_Credit_Card(){
		Billing_Address_Credit_Card.click();
}

@FindBy(how= How.ID, using = "Billing_Address_Check")
	public WebElement Billing_Address_Check;

public void verify_Billing_Address_Check_Status(String data){
		//Verifies the Status of the Billing_Address_Check
		Assert.assertEquals(Billing_Address_Check,Billing_Address_Check);
}

public void select_Billing_Address_Check(){
		Billing_Address_Check.click();
}

@FindBy(how= How.ID, using = "Billing_Address_PO")
	public WebElement Billing_Address_PO;

public void verify_Billing_Address_PO_Status(String data){
		//Verifies the Status of the Billing_Address_PO
		Assert.assertEquals(Billing_Address_PO,Billing_Address_PO);
}

public void select_Billing_Address_PO(){
		Billing_Address_PO.click();
}

@FindBy(how= How.ID, using = "Billing_Address_COnfirmation")
	public WebElement Billing_Address_COnfirmation;

public void verify_Billing_Address_COnfirmation_Status(String data){
		//Verifies the Status of the Billing_Address_COnfirmation
		Assert.assertEquals(Billing_Address_COnfirmation,Billing_Address_COnfirmation);
}

public void select_Billing_Address_COnfirmation(){
		Billing_Address_COnfirmation.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}