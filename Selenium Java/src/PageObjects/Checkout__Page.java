package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Checkout_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Billing_Address")
	public static WebElement Billing_Address;

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
public void click_Billing_Address(){
		Billing_Address.click();
}

@FindBy(how= How.ID, using = "Shiiping_details")
	public static WebElement Shiiping_details;

public void verify_Shiiping_details_Status(String data){
		//Verifies the Status of the Shiiping_details
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Shiiping_details.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Shiiping_details.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Shiiping_details.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Shiiping_details.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Shiiping_details(){
		Shiiping_details.click();
}

@FindBy(how= How.ID, using = "Shipping_method")
	public static WebElement Shipping_method;

public void verify_Shipping_method_Status(String data){
		//Verifies the Status of the Shipping_method
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Shipping_method.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Shipping_method.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Shipping_method.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Shipping_method.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Shipping_method(){
		Shipping_method.click();
}

@FindBy(how= How.ID, using = "Payment_method")
	public static WebElement Payment_method;

public void verify_Payment_method_Status(String data){
		//Verifies the Status of the Payment_method
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Payment_method.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Payment_method.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Payment_method.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Payment_method.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Payment_method(){
		Payment_method.click();
}

@FindBy(how= How.ID, using = "Payment_INformation")
	public static WebElement Payment_INformation;

public void verify_Payment_INformation_Status(String data){
		//Verifies the Status of the Payment_INformation
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Payment_INformation.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Payment_INformation.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Payment_INformation.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Payment_INformation.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Payment_INformation(){
		Payment_INformation.click();
}

@FindBy(how= How.ID, using = "Confirm_order")
	public static WebElement Confirm_order;

public void verify_Confirm_order_Status(String data){
		//Verifies the Status of the Confirm_order
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Confirm_order.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Confirm_order.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Confirm_order.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Confirm_order.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Confirm_order(){
		Confirm_order.click();
}

@FindBy(how= How.ID, using = "Confirm_order")
	public static WebElement Confirm_order;

public void verify_Confirm_order_Status(String data){
		//Verifies the Status of the Confirm_order
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Confirm_order.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Confirm_order.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Confirm_order.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Confirm_order.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Confirm_order(){
		Confirm_order.click();
}

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

@FindBy(how= How.ID, using = "Continue__1_")
	public static WebElement Continue__1_;

public void verify_Continue__1__Status(String data){
		//Verifies the Status of the Continue__1_
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Continue__1_.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Continue__1_.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Continue__1_.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Continue__1_.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Continue__1_(){
		Continue__1_.click();
}

@FindBy(how= How.ID, using = "Billing_Address__1_")
	public static WebElement Billing_Address__1_;

public void click_Billing_Address__1_(){
		Billing_Address__1_.click();
}

@FindBy(how= How.ID, using = "Shipping_Address")
	public static WebElement Shipping_Address;

public void click_Shipping_Address(){
		Shipping_Address.click();
}

@FindBy(how= How.ID, using = "Shipping_address")
	public static WebElement Shipping_address;

public void verify_Shipping_address(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Shipping_address.getAttribute("value"),data);
	}

}

public void verify_Shipping_address_Status(String data){
		//Verifies the Status of the Shipping_address
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Shipping_address.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Shipping_address.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Shipping_address.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Shipping_address.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Shipping_address(String data){
		Shipping_address.clear();
		Shipping_address.sendKeys(data);
}

@FindBy(how= How.ID, using = "back")
	public static WebElement back;

public void verify_back_Status(String data){
		//Verifies the Status of the back
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(back.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(back.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!back.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!back.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_back(){
		back.click();
}

@FindBy(how= How.ID, using = "continue")
	public static WebElement continue;

public void verify_continue_Status(String data){
		//Verifies the Status of the continue
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(continue.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(continue.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!continue.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!continue.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_continue(){
		continue.click();
}

@FindBy(how= How.ID, using = "Shipping_Method")
	public static WebElement Shipping_Method;

public void click_Shipping_Method(){
		Shipping_Method.click();
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
@FindBy(how= How.ID, using = "Payment_Method")
	public static WebElement Payment_Method;

public void click_Payment_Method(){
		Payment_Method.click();
}

@FindBy(how= How.ID, using = "Payment_Info")
	public static WebElement Payment_Info;

public void click_Payment_Info(){
		Payment_Info.click();
}

@FindBy(how= How.ID, using = "Confirm_Order")
	public static WebElement Confirm_Order;

public void click_Confirm_Order(){
		Confirm_Order.click();
}

@FindBy(how= How.ID, using = "confirm")
	public static WebElement confirm;

public void verify_confirm_Status(String data){
		//Verifies the Status of the confirm
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(confirm.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(confirm.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!confirm.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!confirm.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_confirm(){
		confirm.click();
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

@FindBy(how= How.ID, using = "back_Gender")
	public WebElement back_Gender;

public void verify_back_Gender_Status(String data){
		//Verifies the Status of the back_Gender
		Assert.assertEquals(back_Gender,back_Gender);
}

public void select_back_Gender(){
		back_Gender.click();
}

@FindBy(how= How.ID, using = "back_Male")
	public WebElement back_Male;

public void verify_back_Male_Status(String data){
		//Verifies the Status of the back_Male
		Assert.assertEquals(back_Male,back_Male);
}

public void select_back_Male(){
		back_Male.click();
}

@FindBy(how= How.ID, using = "back_Female")
	public WebElement back_Female;

public void verify_back_Female_Status(String data){
		//Verifies the Status of the back_Female
		Assert.assertEquals(back_Female,back_Female);
}

public void select_back_Female(){
		back_Female.click();
}

@FindBy(how= How.ID, using = "back_Login")
	public WebElement back_Login;

public void verify_back_Login_Status(String data){
		//Verifies the Status of the back_Login
		Assert.assertEquals(back_Login,back_Login);
}

public void select_back_Login(){
		back_Login.click();
}

@FindBy(how= How.ID, using = "back_Shipping_options")
	public WebElement back_Shipping_options;

public void verify_back_Shipping_options_Status(String data){
		//Verifies the Status of the back_Shipping_options
		Assert.assertEquals(back_Shipping_options,back_Shipping_options);
}

public void select_back_Shipping_options(){
		back_Shipping_options.click();
}

@FindBy(how= How.ID, using = "back_Ground")
	public WebElement back_Ground;

public void verify_back_Ground_Status(String data){
		//Verifies the Status of the back_Ground
		Assert.assertEquals(back_Ground,back_Ground);
}

public void select_back_Ground(){
		back_Ground.click();
}

@FindBy(how= How.ID, using = "back_Next_Day_Air")
	public WebElement back_Next_Day_Air;

public void verify_back_Next_Day_Air_Status(String data){
		//Verifies the Status of the back_Next_Day_Air
		Assert.assertEquals(back_Next_Day_Air,back_Next_Day_Air);
}

public void select_back_Next_Day_Air(){
		back_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "back_2nd_Day_Air")
	public WebElement back_2nd_Day_Air;

public void verify_back_2nd_Day_Air_Status(String data){
		//Verifies the Status of the back_2nd_Day_Air
		Assert.assertEquals(back_2nd_Day_Air,back_2nd_Day_Air);
}

public void select_back_2nd_Day_Air(){
		back_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "back_payment_options")
	public WebElement back_payment_options;

public void verify_back_payment_options_Status(String data){
		//Verifies the Status of the back_payment_options
		Assert.assertEquals(back_payment_options,back_payment_options);
}

public void select_back_payment_options(){
		back_payment_options.click();
}

@FindBy(how= How.ID, using = "back_COD")
	public WebElement back_COD;

public void verify_back_COD_Status(String data){
		//Verifies the Status of the back_COD
		Assert.assertEquals(back_COD,back_COD);
}

public void select_back_COD(){
		back_COD.click();
}

@FindBy(how= How.ID, using = "back_Credit_Card")
	public WebElement back_Credit_Card;

public void verify_back_Credit_Card_Status(String data){
		//Verifies the Status of the back_Credit_Card
		Assert.assertEquals(back_Credit_Card,back_Credit_Card);
}

public void select_back_Credit_Card(){
		back_Credit_Card.click();
}

@FindBy(how= How.ID, using = "back_Check")
	public WebElement back_Check;

public void verify_back_Check_Status(String data){
		//Verifies the Status of the back_Check
		Assert.assertEquals(back_Check,back_Check);
}

public void select_back_Check(){
		back_Check.click();
}

@FindBy(how= How.ID, using = "back_PO")
	public WebElement back_PO;

public void verify_back_PO_Status(String data){
		//Verifies the Status of the back_PO
		Assert.assertEquals(back_PO,back_PO);
}

public void select_back_PO(){
		back_PO.click();
}

@FindBy(how= How.ID, using = "back_COnfirmation")
	public WebElement back_COnfirmation;

public void verify_back_COnfirmation_Status(String data){
		//Verifies the Status of the back_COnfirmation
		Assert.assertEquals(back_COnfirmation,back_COnfirmation);
}

public void select_back_COnfirmation(){
		back_COnfirmation.click();
}

@FindBy(how= How.ID, using = "back_Gender")
	public WebElement back_Gender;

public void verify_back_Gender_Status(String data){
		//Verifies the Status of the back_Gender
		Assert.assertEquals(back_Gender,back_Gender);
}

public void select_back_Gender(){
		back_Gender.click();
}

@FindBy(how= How.ID, using = "back_Male")
	public WebElement back_Male;

public void verify_back_Male_Status(String data){
		//Verifies the Status of the back_Male
		Assert.assertEquals(back_Male,back_Male);
}

public void select_back_Male(){
		back_Male.click();
}

@FindBy(how= How.ID, using = "back_Female")
	public WebElement back_Female;

public void verify_back_Female_Status(String data){
		//Verifies the Status of the back_Female
		Assert.assertEquals(back_Female,back_Female);
}

public void select_back_Female(){
		back_Female.click();
}

@FindBy(how= How.ID, using = "back_Login")
	public WebElement back_Login;

public void verify_back_Login_Status(String data){
		//Verifies the Status of the back_Login
		Assert.assertEquals(back_Login,back_Login);
}

public void select_back_Login(){
		back_Login.click();
}

@FindBy(how= How.ID, using = "back_Shipping_options")
	public WebElement back_Shipping_options;

public void verify_back_Shipping_options_Status(String data){
		//Verifies the Status of the back_Shipping_options
		Assert.assertEquals(back_Shipping_options,back_Shipping_options);
}

public void select_back_Shipping_options(){
		back_Shipping_options.click();
}

@FindBy(how= How.ID, using = "back_Ground")
	public WebElement back_Ground;

public void verify_back_Ground_Status(String data){
		//Verifies the Status of the back_Ground
		Assert.assertEquals(back_Ground,back_Ground);
}

public void select_back_Ground(){
		back_Ground.click();
}

@FindBy(how= How.ID, using = "back_Next_Day_Air")
	public WebElement back_Next_Day_Air;

public void verify_back_Next_Day_Air_Status(String data){
		//Verifies the Status of the back_Next_Day_Air
		Assert.assertEquals(back_Next_Day_Air,back_Next_Day_Air);
}

public void select_back_Next_Day_Air(){
		back_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "back_2nd_Day_Air")
	public WebElement back_2nd_Day_Air;

public void verify_back_2nd_Day_Air_Status(String data){
		//Verifies the Status of the back_2nd_Day_Air
		Assert.assertEquals(back_2nd_Day_Air,back_2nd_Day_Air);
}

public void select_back_2nd_Day_Air(){
		back_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "back_payment_options")
	public WebElement back_payment_options;

public void verify_back_payment_options_Status(String data){
		//Verifies the Status of the back_payment_options
		Assert.assertEquals(back_payment_options,back_payment_options);
}

public void select_back_payment_options(){
		back_payment_options.click();
}

@FindBy(how= How.ID, using = "back_COD")
	public WebElement back_COD;

public void verify_back_COD_Status(String data){
		//Verifies the Status of the back_COD
		Assert.assertEquals(back_COD,back_COD);
}

public void select_back_COD(){
		back_COD.click();
}

@FindBy(how= How.ID, using = "back_Credit_Card")
	public WebElement back_Credit_Card;

public void verify_back_Credit_Card_Status(String data){
		//Verifies the Status of the back_Credit_Card
		Assert.assertEquals(back_Credit_Card,back_Credit_Card);
}

public void select_back_Credit_Card(){
		back_Credit_Card.click();
}

@FindBy(how= How.ID, using = "back_Check")
	public WebElement back_Check;

public void verify_back_Check_Status(String data){
		//Verifies the Status of the back_Check
		Assert.assertEquals(back_Check,back_Check);
}

public void select_back_Check(){
		back_Check.click();
}

@FindBy(how= How.ID, using = "back_PO")
	public WebElement back_PO;

public void verify_back_PO_Status(String data){
		//Verifies the Status of the back_PO
		Assert.assertEquals(back_PO,back_PO);
}

public void select_back_PO(){
		back_PO.click();
}

@FindBy(how= How.ID, using = "back_COnfirmation")
	public WebElement back_COnfirmation;

public void verify_back_COnfirmation_Status(String data){
		//Verifies the Status of the back_COnfirmation
		Assert.assertEquals(back_COnfirmation,back_COnfirmation);
}

public void select_back_COnfirmation(){
		back_COnfirmation.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}