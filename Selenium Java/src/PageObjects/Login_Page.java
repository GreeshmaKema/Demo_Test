package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Login_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "email")
	public static WebElement email;

public void verify_email(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(email.getAttribute("value"),data);
	}

}

public void verify_email_Status(String data){
		//Verifies the Status of the email
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(email.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(email.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!email.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!email.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_email(String data){
		email.clear();
		email.sendKeys(data);
}

@FindBy(how= How.ID, using = "password")
	public static WebElement password;

public void verify_password(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(password.getAttribute("value"),data);
	}

}

public void verify_password_Status(String data){
		//Verifies the Status of the password
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(password.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(password.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!password.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!password.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_password(String data){
		password.clear();
		password.sendKeys(data);
}

@FindBy(how= How.ID, using = "forgot_password")
	public static WebElement forgot_password;

public void verify_forgot_password_Status(String data){
		//Verifies the Status of the forgot_password
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(forgot_password.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(forgot_password.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!forgot_password.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!forgot_password.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_forgot_password(){
		forgot_password.click();
}

@FindBy(how= How.ID, using = "login")
	public static WebElement login;

public void verify_login_Status(String data){
		//Verifies the Status of the login
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(login.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(login.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!login.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!login.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_login(){
		login.click();
}

@FindBy(how= How.ID, using = "Customer_details_Gender")
	public WebElement Customer_details_Gender;

public void verify_Customer_details_Gender_Status(String data){
		//Verifies the Status of the Customer_details_Gender
		Assert.assertEquals(Customer_details_Gender,Customer_details_Gender);
}

public void select_Customer_details_Gender(){
		Customer_details_Gender.click();
}

@FindBy(how= How.ID, using = "Customer_details_Male")
	public WebElement Customer_details_Male;

public void verify_Customer_details_Male_Status(String data){
		//Verifies the Status of the Customer_details_Male
		Assert.assertEquals(Customer_details_Male,Customer_details_Male);
}

public void select_Customer_details_Male(){
		Customer_details_Male.click();
}

@FindBy(how= How.ID, using = "Customer_details_Female")
	public WebElement Customer_details_Female;

public void verify_Customer_details_Female_Status(String data){
		//Verifies the Status of the Customer_details_Female
		Assert.assertEquals(Customer_details_Female,Customer_details_Female);
}

public void select_Customer_details_Female(){
		Customer_details_Female.click();
}

@FindBy(how= How.ID, using = "Customer_details_Login")
	public WebElement Customer_details_Login;

public void verify_Customer_details_Login_Status(String data){
		//Verifies the Status of the Customer_details_Login
		Assert.assertEquals(Customer_details_Login,Customer_details_Login);
}

public void select_Customer_details_Login(){
		Customer_details_Login.click();
}

@FindBy(how= How.ID, using = "Customer_details_Shipping_options")
	public WebElement Customer_details_Shipping_options;

public void verify_Customer_details_Shipping_options_Status(String data){
		//Verifies the Status of the Customer_details_Shipping_options
		Assert.assertEquals(Customer_details_Shipping_options,Customer_details_Shipping_options);
}

public void select_Customer_details_Shipping_options(){
		Customer_details_Shipping_options.click();
}

@FindBy(how= How.ID, using = "Customer_details_Ground")
	public WebElement Customer_details_Ground;

public void verify_Customer_details_Ground_Status(String data){
		//Verifies the Status of the Customer_details_Ground
		Assert.assertEquals(Customer_details_Ground,Customer_details_Ground);
}

public void select_Customer_details_Ground(){
		Customer_details_Ground.click();
}

@FindBy(how= How.ID, using = "Customer_details_Next_Day_Air")
	public WebElement Customer_details_Next_Day_Air;

public void verify_Customer_details_Next_Day_Air_Status(String data){
		//Verifies the Status of the Customer_details_Next_Day_Air
		Assert.assertEquals(Customer_details_Next_Day_Air,Customer_details_Next_Day_Air);
}

public void select_Customer_details_Next_Day_Air(){
		Customer_details_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "Customer_details_2nd_Day_Air")
	public WebElement Customer_details_2nd_Day_Air;

public void verify_Customer_details_2nd_Day_Air_Status(String data){
		//Verifies the Status of the Customer_details_2nd_Day_Air
		Assert.assertEquals(Customer_details_2nd_Day_Air,Customer_details_2nd_Day_Air);
}

public void select_Customer_details_2nd_Day_Air(){
		Customer_details_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "Customer_details_payment_options")
	public WebElement Customer_details_payment_options;

public void verify_Customer_details_payment_options_Status(String data){
		//Verifies the Status of the Customer_details_payment_options
		Assert.assertEquals(Customer_details_payment_options,Customer_details_payment_options);
}

public void select_Customer_details_payment_options(){
		Customer_details_payment_options.click();
}

@FindBy(how= How.ID, using = "Customer_details_COD")
	public WebElement Customer_details_COD;

public void verify_Customer_details_COD_Status(String data){
		//Verifies the Status of the Customer_details_COD
		Assert.assertEquals(Customer_details_COD,Customer_details_COD);
}

public void select_Customer_details_COD(){
		Customer_details_COD.click();
}

@FindBy(how= How.ID, using = "Customer_details_Credit_Card")
	public WebElement Customer_details_Credit_Card;

public void verify_Customer_details_Credit_Card_Status(String data){
		//Verifies the Status of the Customer_details_Credit_Card
		Assert.assertEquals(Customer_details_Credit_Card,Customer_details_Credit_Card);
}

public void select_Customer_details_Credit_Card(){
		Customer_details_Credit_Card.click();
}

@FindBy(how= How.ID, using = "Customer_details_Check")
	public WebElement Customer_details_Check;

public void verify_Customer_details_Check_Status(String data){
		//Verifies the Status of the Customer_details_Check
		Assert.assertEquals(Customer_details_Check,Customer_details_Check);
}

public void select_Customer_details_Check(){
		Customer_details_Check.click();
}

@FindBy(how= How.ID, using = "Customer_details_PO")
	public WebElement Customer_details_PO;

public void verify_Customer_details_PO_Status(String data){
		//Verifies the Status of the Customer_details_PO
		Assert.assertEquals(Customer_details_PO,Customer_details_PO);
}

public void select_Customer_details_PO(){
		Customer_details_PO.click();
}

@FindBy(how= How.ID, using = "Customer_details_COnfirmation")
	public WebElement Customer_details_COnfirmation;

public void verify_Customer_details_COnfirmation_Status(String data){
		//Verifies the Status of the Customer_details_COnfirmation
		Assert.assertEquals(Customer_details_COnfirmation,Customer_details_COnfirmation);
}

public void select_Customer_details_COnfirmation(){
		Customer_details_COnfirmation.click();
}

@FindBy(how= How.ID, using = "Customer_details_Gender")
	public WebElement Customer_details_Gender;

public void verify_Customer_details_Gender_Status(String data){
		//Verifies the Status of the Customer_details_Gender
		Assert.assertEquals(Customer_details_Gender,Customer_details_Gender);
}

public void select_Customer_details_Gender(){
		Customer_details_Gender.click();
}

@FindBy(how= How.ID, using = "Customer_details_Male")
	public WebElement Customer_details_Male;

public void verify_Customer_details_Male_Status(String data){
		//Verifies the Status of the Customer_details_Male
		Assert.assertEquals(Customer_details_Male,Customer_details_Male);
}

public void select_Customer_details_Male(){
		Customer_details_Male.click();
}

@FindBy(how= How.ID, using = "Customer_details_Female")
	public WebElement Customer_details_Female;

public void verify_Customer_details_Female_Status(String data){
		//Verifies the Status of the Customer_details_Female
		Assert.assertEquals(Customer_details_Female,Customer_details_Female);
}

public void select_Customer_details_Female(){
		Customer_details_Female.click();
}

@FindBy(how= How.ID, using = "Customer_details_Login")
	public WebElement Customer_details_Login;

public void verify_Customer_details_Login_Status(String data){
		//Verifies the Status of the Customer_details_Login
		Assert.assertEquals(Customer_details_Login,Customer_details_Login);
}

public void select_Customer_details_Login(){
		Customer_details_Login.click();
}

@FindBy(how= How.ID, using = "Customer_details_Shipping_options")
	public WebElement Customer_details_Shipping_options;

public void verify_Customer_details_Shipping_options_Status(String data){
		//Verifies the Status of the Customer_details_Shipping_options
		Assert.assertEquals(Customer_details_Shipping_options,Customer_details_Shipping_options);
}

public void select_Customer_details_Shipping_options(){
		Customer_details_Shipping_options.click();
}

@FindBy(how= How.ID, using = "Customer_details_Ground")
	public WebElement Customer_details_Ground;

public void verify_Customer_details_Ground_Status(String data){
		//Verifies the Status of the Customer_details_Ground
		Assert.assertEquals(Customer_details_Ground,Customer_details_Ground);
}

public void select_Customer_details_Ground(){
		Customer_details_Ground.click();
}

@FindBy(how= How.ID, using = "Customer_details_Next_Day_Air")
	public WebElement Customer_details_Next_Day_Air;

public void verify_Customer_details_Next_Day_Air_Status(String data){
		//Verifies the Status of the Customer_details_Next_Day_Air
		Assert.assertEquals(Customer_details_Next_Day_Air,Customer_details_Next_Day_Air);
}

public void select_Customer_details_Next_Day_Air(){
		Customer_details_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "Customer_details_2nd_Day_Air")
	public WebElement Customer_details_2nd_Day_Air;

public void verify_Customer_details_2nd_Day_Air_Status(String data){
		//Verifies the Status of the Customer_details_2nd_Day_Air
		Assert.assertEquals(Customer_details_2nd_Day_Air,Customer_details_2nd_Day_Air);
}

public void select_Customer_details_2nd_Day_Air(){
		Customer_details_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "Customer_details_payment_options")
	public WebElement Customer_details_payment_options;

public void verify_Customer_details_payment_options_Status(String data){
		//Verifies the Status of the Customer_details_payment_options
		Assert.assertEquals(Customer_details_payment_options,Customer_details_payment_options);
}

public void select_Customer_details_payment_options(){
		Customer_details_payment_options.click();
}

@FindBy(how= How.ID, using = "Customer_details_COD")
	public WebElement Customer_details_COD;

public void verify_Customer_details_COD_Status(String data){
		//Verifies the Status of the Customer_details_COD
		Assert.assertEquals(Customer_details_COD,Customer_details_COD);
}

public void select_Customer_details_COD(){
		Customer_details_COD.click();
}

@FindBy(how= How.ID, using = "Customer_details_Credit_Card")
	public WebElement Customer_details_Credit_Card;

public void verify_Customer_details_Credit_Card_Status(String data){
		//Verifies the Status of the Customer_details_Credit_Card
		Assert.assertEquals(Customer_details_Credit_Card,Customer_details_Credit_Card);
}

public void select_Customer_details_Credit_Card(){
		Customer_details_Credit_Card.click();
}

@FindBy(how= How.ID, using = "Customer_details_Check")
	public WebElement Customer_details_Check;

public void verify_Customer_details_Check_Status(String data){
		//Verifies the Status of the Customer_details_Check
		Assert.assertEquals(Customer_details_Check,Customer_details_Check);
}

public void select_Customer_details_Check(){
		Customer_details_Check.click();
}

@FindBy(how= How.ID, using = "Customer_details_PO")
	public WebElement Customer_details_PO;

public void verify_Customer_details_PO_Status(String data){
		//Verifies the Status of the Customer_details_PO
		Assert.assertEquals(Customer_details_PO,Customer_details_PO);
}

public void select_Customer_details_PO(){
		Customer_details_PO.click();
}

@FindBy(how= How.ID, using = "Customer_details_COnfirmation")
	public WebElement Customer_details_COnfirmation;

public void verify_Customer_details_COnfirmation_Status(String data){
		//Verifies the Status of the Customer_details_COnfirmation
		Assert.assertEquals(Customer_details_COnfirmation,Customer_details_COnfirmation);
}

public void select_Customer_details_COnfirmation(){
		Customer_details_COnfirmation.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}