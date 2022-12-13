package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Register_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Gender")
	public static WebElement Gender;

public void verify_Gender(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Gender.getAttribute("name"),data);
	}

}

public void verify_Gender_Status(String data){
		//Verifies the Status of the Gender
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Gender.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Gender.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Gender.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Gender.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "First_name")
	public static WebElement First_name;

public void verify_First_name(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(First_name.getAttribute("value"),data);
	}

}

public void verify_First_name_Status(String data){
		//Verifies the Status of the First_name
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(First_name.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(First_name.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!First_name.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!First_name.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_First_name(String data){
		First_name.clear();
		First_name.sendKeys(data);
}

@FindBy(how= How.ID, using = "Last_name")
	public static WebElement Last_name;

public void verify_Last_name(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Last_name.getAttribute("value"),data);
	}

}

public void verify_Last_name_Status(String data){
		//Verifies the Status of the Last_name
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Last_name.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Last_name.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Last_name.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Last_name.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Last_name(String data){
		Last_name.clear();
		Last_name.sendKeys(data);
}

@FindBy(how= How.ID, using = "Email")
	public static WebElement Email;

public void verify_Email(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Email.getAttribute("value"),data);
	}

}

public void verify_Email_Status(String data){
		//Verifies the Status of the Email
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Email.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Email.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Email.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Email.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Email(String data){
		Email.clear();
		Email.sendKeys(data);
}

@FindBy(how= How.ID, using = "Password")
	public static WebElement Password;

public void verify_Password(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Password.getAttribute("value"),data);
	}

}

public void verify_Password_Status(String data){
		//Verifies the Status of the Password
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Password.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Password.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Password.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Password.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Password(String data){
		Password.clear();
		Password.sendKeys(data);
}

@FindBy(how= How.ID, using = "Confirm_Password")
	public static WebElement Confirm_Password;

public void verify_Confirm_Password(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Confirm_Password.getAttribute("value"),data);
	}

}

public void verify_Confirm_Password_Status(String data){
		//Verifies the Status of the Confirm_Password
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Confirm_Password.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Confirm_Password.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Confirm_Password.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Confirm_Password.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Confirm_Password(String data){
		Confirm_Password.clear();
		Confirm_Password.sendKeys(data);
}

@FindBy(how= How.ID, using = "Register")
	public static WebElement Register;

public void verify_Register_Status(String data){
		//Verifies the Status of the Register
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Register.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Register.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Register.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Register.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Register(){
		Register.click();
}

@FindBy(how= How.ID, using = "First_name_Gender")
	public WebElement First_name_Gender;

public void verify_First_name_Gender_Status(String data){
		//Verifies the Status of the First_name_Gender
		Assert.assertEquals(First_name_Gender,First_name_Gender);
}

public void select_First_name_Gender(){
		First_name_Gender.click();
}

@FindBy(how= How.ID, using = "First_name_Male")
	public WebElement First_name_Male;

public void verify_First_name_Male_Status(String data){
		//Verifies the Status of the First_name_Male
		Assert.assertEquals(First_name_Male,First_name_Male);
}

public void select_First_name_Male(){
		First_name_Male.click();
}

@FindBy(how= How.ID, using = "First_name_Female")
	public WebElement First_name_Female;

public void verify_First_name_Female_Status(String data){
		//Verifies the Status of the First_name_Female
		Assert.assertEquals(First_name_Female,First_name_Female);
}

public void select_First_name_Female(){
		First_name_Female.click();
}

@FindBy(how= How.ID, using = "First_name_Login")
	public WebElement First_name_Login;

public void verify_First_name_Login_Status(String data){
		//Verifies the Status of the First_name_Login
		Assert.assertEquals(First_name_Login,First_name_Login);
}

public void select_First_name_Login(){
		First_name_Login.click();
}

@FindBy(how= How.ID, using = "First_name_Shipping_options")
	public WebElement First_name_Shipping_options;

public void verify_First_name_Shipping_options_Status(String data){
		//Verifies the Status of the First_name_Shipping_options
		Assert.assertEquals(First_name_Shipping_options,First_name_Shipping_options);
}

public void select_First_name_Shipping_options(){
		First_name_Shipping_options.click();
}

@FindBy(how= How.ID, using = "First_name_Ground")
	public WebElement First_name_Ground;

public void verify_First_name_Ground_Status(String data){
		//Verifies the Status of the First_name_Ground
		Assert.assertEquals(First_name_Ground,First_name_Ground);
}

public void select_First_name_Ground(){
		First_name_Ground.click();
}

@FindBy(how= How.ID, using = "First_name_Next_Day_Air")
	public WebElement First_name_Next_Day_Air;

public void verify_First_name_Next_Day_Air_Status(String data){
		//Verifies the Status of the First_name_Next_Day_Air
		Assert.assertEquals(First_name_Next_Day_Air,First_name_Next_Day_Air);
}

public void select_First_name_Next_Day_Air(){
		First_name_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "First_name_2nd_Day_Air")
	public WebElement First_name_2nd_Day_Air;

public void verify_First_name_2nd_Day_Air_Status(String data){
		//Verifies the Status of the First_name_2nd_Day_Air
		Assert.assertEquals(First_name_2nd_Day_Air,First_name_2nd_Day_Air);
}

public void select_First_name_2nd_Day_Air(){
		First_name_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "First_name_payment_options")
	public WebElement First_name_payment_options;

public void verify_First_name_payment_options_Status(String data){
		//Verifies the Status of the First_name_payment_options
		Assert.assertEquals(First_name_payment_options,First_name_payment_options);
}

public void select_First_name_payment_options(){
		First_name_payment_options.click();
}

@FindBy(how= How.ID, using = "First_name_COD")
	public WebElement First_name_COD;

public void verify_First_name_COD_Status(String data){
		//Verifies the Status of the First_name_COD
		Assert.assertEquals(First_name_COD,First_name_COD);
}

public void select_First_name_COD(){
		First_name_COD.click();
}

@FindBy(how= How.ID, using = "First_name_Credit_Card")
	public WebElement First_name_Credit_Card;

public void verify_First_name_Credit_Card_Status(String data){
		//Verifies the Status of the First_name_Credit_Card
		Assert.assertEquals(First_name_Credit_Card,First_name_Credit_Card);
}

public void select_First_name_Credit_Card(){
		First_name_Credit_Card.click();
}

@FindBy(how= How.ID, using = "First_name_Check")
	public WebElement First_name_Check;

public void verify_First_name_Check_Status(String data){
		//Verifies the Status of the First_name_Check
		Assert.assertEquals(First_name_Check,First_name_Check);
}

public void select_First_name_Check(){
		First_name_Check.click();
}

@FindBy(how= How.ID, using = "First_name_PO")
	public WebElement First_name_PO;

public void verify_First_name_PO_Status(String data){
		//Verifies the Status of the First_name_PO
		Assert.assertEquals(First_name_PO,First_name_PO);
}

public void select_First_name_PO(){
		First_name_PO.click();
}

@FindBy(how= How.ID, using = "First_name_COnfirmation")
	public WebElement First_name_COnfirmation;

public void verify_First_name_COnfirmation_Status(String data){
		//Verifies the Status of the First_name_COnfirmation
		Assert.assertEquals(First_name_COnfirmation,First_name_COnfirmation);
}

public void select_First_name_COnfirmation(){
		First_name_COnfirmation.click();
}

@FindBy(how= How.ID, using = "First_name_Gender")
	public WebElement First_name_Gender;

public void verify_First_name_Gender_Status(String data){
		//Verifies the Status of the First_name_Gender
		Assert.assertEquals(First_name_Gender,First_name_Gender);
}

public void select_First_name_Gender(){
		First_name_Gender.click();
}

@FindBy(how= How.ID, using = "First_name_Male")
	public WebElement First_name_Male;

public void verify_First_name_Male_Status(String data){
		//Verifies the Status of the First_name_Male
		Assert.assertEquals(First_name_Male,First_name_Male);
}

public void select_First_name_Male(){
		First_name_Male.click();
}

@FindBy(how= How.ID, using = "First_name_Female")
	public WebElement First_name_Female;

public void verify_First_name_Female_Status(String data){
		//Verifies the Status of the First_name_Female
		Assert.assertEquals(First_name_Female,First_name_Female);
}

public void select_First_name_Female(){
		First_name_Female.click();
}

@FindBy(how= How.ID, using = "First_name_Login")
	public WebElement First_name_Login;

public void verify_First_name_Login_Status(String data){
		//Verifies the Status of the First_name_Login
		Assert.assertEquals(First_name_Login,First_name_Login);
}

public void select_First_name_Login(){
		First_name_Login.click();
}

@FindBy(how= How.ID, using = "First_name_Shipping_options")
	public WebElement First_name_Shipping_options;

public void verify_First_name_Shipping_options_Status(String data){
		//Verifies the Status of the First_name_Shipping_options
		Assert.assertEquals(First_name_Shipping_options,First_name_Shipping_options);
}

public void select_First_name_Shipping_options(){
		First_name_Shipping_options.click();
}

@FindBy(how= How.ID, using = "First_name_Ground")
	public WebElement First_name_Ground;

public void verify_First_name_Ground_Status(String data){
		//Verifies the Status of the First_name_Ground
		Assert.assertEquals(First_name_Ground,First_name_Ground);
}

public void select_First_name_Ground(){
		First_name_Ground.click();
}

@FindBy(how= How.ID, using = "First_name_Next_Day_Air")
	public WebElement First_name_Next_Day_Air;

public void verify_First_name_Next_Day_Air_Status(String data){
		//Verifies the Status of the First_name_Next_Day_Air
		Assert.assertEquals(First_name_Next_Day_Air,First_name_Next_Day_Air);
}

public void select_First_name_Next_Day_Air(){
		First_name_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "First_name_2nd_Day_Air")
	public WebElement First_name_2nd_Day_Air;

public void verify_First_name_2nd_Day_Air_Status(String data){
		//Verifies the Status of the First_name_2nd_Day_Air
		Assert.assertEquals(First_name_2nd_Day_Air,First_name_2nd_Day_Air);
}

public void select_First_name_2nd_Day_Air(){
		First_name_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "First_name_payment_options")
	public WebElement First_name_payment_options;

public void verify_First_name_payment_options_Status(String data){
		//Verifies the Status of the First_name_payment_options
		Assert.assertEquals(First_name_payment_options,First_name_payment_options);
}

public void select_First_name_payment_options(){
		First_name_payment_options.click();
}

@FindBy(how= How.ID, using = "First_name_COD")
	public WebElement First_name_COD;

public void verify_First_name_COD_Status(String data){
		//Verifies the Status of the First_name_COD
		Assert.assertEquals(First_name_COD,First_name_COD);
}

public void select_First_name_COD(){
		First_name_COD.click();
}

@FindBy(how= How.ID, using = "First_name_Credit_Card")
	public WebElement First_name_Credit_Card;

public void verify_First_name_Credit_Card_Status(String data){
		//Verifies the Status of the First_name_Credit_Card
		Assert.assertEquals(First_name_Credit_Card,First_name_Credit_Card);
}

public void select_First_name_Credit_Card(){
		First_name_Credit_Card.click();
}

@FindBy(how= How.ID, using = "First_name_Check")
	public WebElement First_name_Check;

public void verify_First_name_Check_Status(String data){
		//Verifies the Status of the First_name_Check
		Assert.assertEquals(First_name_Check,First_name_Check);
}

public void select_First_name_Check(){
		First_name_Check.click();
}

@FindBy(how= How.ID, using = "First_name_PO")
	public WebElement First_name_PO;

public void verify_First_name_PO_Status(String data){
		//Verifies the Status of the First_name_PO
		Assert.assertEquals(First_name_PO,First_name_PO);
}

public void select_First_name_PO(){
		First_name_PO.click();
}

@FindBy(how= How.ID, using = "First_name_COnfirmation")
	public WebElement First_name_COnfirmation;

public void verify_First_name_COnfirmation_Status(String data){
		//Verifies the Status of the First_name_COnfirmation
		Assert.assertEquals(First_name_COnfirmation,First_name_COnfirmation);
}

public void select_First_name_COnfirmation(){
		First_name_COnfirmation.click();
}

@FindBy(how= How.ID, using = "First_name_Gender")
	public WebElement First_name_Gender;

public void verify_First_name_Gender_Status(String data){
		//Verifies the Status of the First_name_Gender
		Assert.assertEquals(First_name_Gender,First_name_Gender);
}

public void select_First_name_Gender(){
		First_name_Gender.click();
}

@FindBy(how= How.ID, using = "First_name_Male")
	public WebElement First_name_Male;

public void verify_First_name_Male_Status(String data){
		//Verifies the Status of the First_name_Male
		Assert.assertEquals(First_name_Male,First_name_Male);
}

public void select_First_name_Male(){
		First_name_Male.click();
}

@FindBy(how= How.ID, using = "First_name_Female")
	public WebElement First_name_Female;

public void verify_First_name_Female_Status(String data){
		//Verifies the Status of the First_name_Female
		Assert.assertEquals(First_name_Female,First_name_Female);
}

public void select_First_name_Female(){
		First_name_Female.click();
}

@FindBy(how= How.ID, using = "First_name_Login")
	public WebElement First_name_Login;

public void verify_First_name_Login_Status(String data){
		//Verifies the Status of the First_name_Login
		Assert.assertEquals(First_name_Login,First_name_Login);
}

public void select_First_name_Login(){
		First_name_Login.click();
}

@FindBy(how= How.ID, using = "First_name_Shipping_options")
	public WebElement First_name_Shipping_options;

public void verify_First_name_Shipping_options_Status(String data){
		//Verifies the Status of the First_name_Shipping_options
		Assert.assertEquals(First_name_Shipping_options,First_name_Shipping_options);
}

public void select_First_name_Shipping_options(){
		First_name_Shipping_options.click();
}

@FindBy(how= How.ID, using = "First_name_Ground")
	public WebElement First_name_Ground;

public void verify_First_name_Ground_Status(String data){
		//Verifies the Status of the First_name_Ground
		Assert.assertEquals(First_name_Ground,First_name_Ground);
}

public void select_First_name_Ground(){
		First_name_Ground.click();
}

@FindBy(how= How.ID, using = "First_name_Next_Day_Air")
	public WebElement First_name_Next_Day_Air;

public void verify_First_name_Next_Day_Air_Status(String data){
		//Verifies the Status of the First_name_Next_Day_Air
		Assert.assertEquals(First_name_Next_Day_Air,First_name_Next_Day_Air);
}

public void select_First_name_Next_Day_Air(){
		First_name_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "First_name_2nd_Day_Air")
	public WebElement First_name_2nd_Day_Air;

public void verify_First_name_2nd_Day_Air_Status(String data){
		//Verifies the Status of the First_name_2nd_Day_Air
		Assert.assertEquals(First_name_2nd_Day_Air,First_name_2nd_Day_Air);
}

public void select_First_name_2nd_Day_Air(){
		First_name_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "First_name_payment_options")
	public WebElement First_name_payment_options;

public void verify_First_name_payment_options_Status(String data){
		//Verifies the Status of the First_name_payment_options
		Assert.assertEquals(First_name_payment_options,First_name_payment_options);
}

public void select_First_name_payment_options(){
		First_name_payment_options.click();
}

@FindBy(how= How.ID, using = "First_name_COD")
	public WebElement First_name_COD;

public void verify_First_name_COD_Status(String data){
		//Verifies the Status of the First_name_COD
		Assert.assertEquals(First_name_COD,First_name_COD);
}

public void select_First_name_COD(){
		First_name_COD.click();
}

@FindBy(how= How.ID, using = "First_name_Credit_Card")
	public WebElement First_name_Credit_Card;

public void verify_First_name_Credit_Card_Status(String data){
		//Verifies the Status of the First_name_Credit_Card
		Assert.assertEquals(First_name_Credit_Card,First_name_Credit_Card);
}

public void select_First_name_Credit_Card(){
		First_name_Credit_Card.click();
}

@FindBy(how= How.ID, using = "First_name_Check")
	public WebElement First_name_Check;

public void verify_First_name_Check_Status(String data){
		//Verifies the Status of the First_name_Check
		Assert.assertEquals(First_name_Check,First_name_Check);
}

public void select_First_name_Check(){
		First_name_Check.click();
}

@FindBy(how= How.ID, using = "First_name_PO")
	public WebElement First_name_PO;

public void verify_First_name_PO_Status(String data){
		//Verifies the Status of the First_name_PO
		Assert.assertEquals(First_name_PO,First_name_PO);
}

public void select_First_name_PO(){
		First_name_PO.click();
}

@FindBy(how= How.ID, using = "First_name_COnfirmation")
	public WebElement First_name_COnfirmation;

public void verify_First_name_COnfirmation_Status(String data){
		//Verifies the Status of the First_name_COnfirmation
		Assert.assertEquals(First_name_COnfirmation,First_name_COnfirmation);
}

public void select_First_name_COnfirmation(){
		First_name_COnfirmation.click();
}

@FindBy(how= How.ID, using = "Gender_Male")
	public WebElement Gender_Male;

public void verify_Gender_Male_Status(String data){
		//Verifies the Status of the Gender_Male
		Assert.assertEquals(Gender_Male,Gender_Male);
}

public void select_Gender_Male(){
		Gender_Male.click();
}

@FindBy(how= How.ID, using = "Gender_Female")
	public WebElement Gender_Female;

public void verify_Gender_Female_Status(String data){
		//Verifies the Status of the Gender_Female
		Assert.assertEquals(Gender_Female,Gender_Female);
}

public void select_Gender_Female(){
		Gender_Female.click();
}

@FindBy(how= How.ID, using = "Gender_Login")
	public WebElement Gender_Login;

public void verify_Gender_Login_Status(String data){
		//Verifies the Status of the Gender_Login
		Assert.assertEquals(Gender_Login,Gender_Login);
}

public void select_Gender_Login(){
		Gender_Login.click();
}

@FindBy(how= How.ID, using = "Gender_Shipping_options")
	public WebElement Gender_Shipping_options;

public void verify_Gender_Shipping_options_Status(String data){
		//Verifies the Status of the Gender_Shipping_options
		Assert.assertEquals(Gender_Shipping_options,Gender_Shipping_options);
}

public void select_Gender_Shipping_options(){
		Gender_Shipping_options.click();
}

@FindBy(how= How.ID, using = "Gender_Ground")
	public WebElement Gender_Ground;

public void verify_Gender_Ground_Status(String data){
		//Verifies the Status of the Gender_Ground
		Assert.assertEquals(Gender_Ground,Gender_Ground);
}

public void select_Gender_Ground(){
		Gender_Ground.click();
}

@FindBy(how= How.ID, using = "Gender_Next_Day_Air")
	public WebElement Gender_Next_Day_Air;

public void verify_Gender_Next_Day_Air_Status(String data){
		//Verifies the Status of the Gender_Next_Day_Air
		Assert.assertEquals(Gender_Next_Day_Air,Gender_Next_Day_Air);
}

public void select_Gender_Next_Day_Air(){
		Gender_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "Gender_2nd_Day_Air")
	public WebElement Gender_2nd_Day_Air;

public void verify_Gender_2nd_Day_Air_Status(String data){
		//Verifies the Status of the Gender_2nd_Day_Air
		Assert.assertEquals(Gender_2nd_Day_Air,Gender_2nd_Day_Air);
}

public void select_Gender_2nd_Day_Air(){
		Gender_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "Gender_payment_options")
	public WebElement Gender_payment_options;

public void verify_Gender_payment_options_Status(String data){
		//Verifies the Status of the Gender_payment_options
		Assert.assertEquals(Gender_payment_options,Gender_payment_options);
}

public void select_Gender_payment_options(){
		Gender_payment_options.click();
}

@FindBy(how= How.ID, using = "Gender_COD")
	public WebElement Gender_COD;

public void verify_Gender_COD_Status(String data){
		//Verifies the Status of the Gender_COD
		Assert.assertEquals(Gender_COD,Gender_COD);
}

public void select_Gender_COD(){
		Gender_COD.click();
}

@FindBy(how= How.ID, using = "Gender_Credit_Card")
	public WebElement Gender_Credit_Card;

public void verify_Gender_Credit_Card_Status(String data){
		//Verifies the Status of the Gender_Credit_Card
		Assert.assertEquals(Gender_Credit_Card,Gender_Credit_Card);
}

public void select_Gender_Credit_Card(){
		Gender_Credit_Card.click();
}

@FindBy(how= How.ID, using = "Gender_Check")
	public WebElement Gender_Check;

public void verify_Gender_Check_Status(String data){
		//Verifies the Status of the Gender_Check
		Assert.assertEquals(Gender_Check,Gender_Check);
}

public void select_Gender_Check(){
		Gender_Check.click();
}

@FindBy(how= How.ID, using = "Gender_PO")
	public WebElement Gender_PO;

public void verify_Gender_PO_Status(String data){
		//Verifies the Status of the Gender_PO
		Assert.assertEquals(Gender_PO,Gender_PO);
}

public void select_Gender_PO(){
		Gender_PO.click();
}

@FindBy(how= How.ID, using = "Gender_COnfirmation")
	public WebElement Gender_COnfirmation;

public void verify_Gender_COnfirmation_Status(String data){
		//Verifies the Status of the Gender_COnfirmation
		Assert.assertEquals(Gender_COnfirmation,Gender_COnfirmation);
}

public void select_Gender_COnfirmation(){
		Gender_COnfirmation.click();
}

@FindBy(how= How.ID, using = "Your_Password_Gender")
	public WebElement Your_Password_Gender;

public void verify_Your_Password_Gender_Status(String data){
		//Verifies the Status of the Your_Password_Gender
		Assert.assertEquals(Your_Password_Gender,Your_Password_Gender);
}

public void select_Your_Password_Gender(){
		Your_Password_Gender.click();
}

@FindBy(how= How.ID, using = "Your_Password_Male")
	public WebElement Your_Password_Male;

public void verify_Your_Password_Male_Status(String data){
		//Verifies the Status of the Your_Password_Male
		Assert.assertEquals(Your_Password_Male,Your_Password_Male);
}

public void select_Your_Password_Male(){
		Your_Password_Male.click();
}

@FindBy(how= How.ID, using = "Your_Password_Female")
	public WebElement Your_Password_Female;

public void verify_Your_Password_Female_Status(String data){
		//Verifies the Status of the Your_Password_Female
		Assert.assertEquals(Your_Password_Female,Your_Password_Female);
}

public void select_Your_Password_Female(){
		Your_Password_Female.click();
}

@FindBy(how= How.ID, using = "Your_Password_Login")
	public WebElement Your_Password_Login;

public void verify_Your_Password_Login_Status(String data){
		//Verifies the Status of the Your_Password_Login
		Assert.assertEquals(Your_Password_Login,Your_Password_Login);
}

public void select_Your_Password_Login(){
		Your_Password_Login.click();
}

@FindBy(how= How.ID, using = "Your_Password_Shipping_options")
	public WebElement Your_Password_Shipping_options;

public void verify_Your_Password_Shipping_options_Status(String data){
		//Verifies the Status of the Your_Password_Shipping_options
		Assert.assertEquals(Your_Password_Shipping_options,Your_Password_Shipping_options);
}

public void select_Your_Password_Shipping_options(){
		Your_Password_Shipping_options.click();
}

@FindBy(how= How.ID, using = "Your_Password_Ground")
	public WebElement Your_Password_Ground;

public void verify_Your_Password_Ground_Status(String data){
		//Verifies the Status of the Your_Password_Ground
		Assert.assertEquals(Your_Password_Ground,Your_Password_Ground);
}

public void select_Your_Password_Ground(){
		Your_Password_Ground.click();
}

@FindBy(how= How.ID, using = "Your_Password_Next_Day_Air")
	public WebElement Your_Password_Next_Day_Air;

public void verify_Your_Password_Next_Day_Air_Status(String data){
		//Verifies the Status of the Your_Password_Next_Day_Air
		Assert.assertEquals(Your_Password_Next_Day_Air,Your_Password_Next_Day_Air);
}

public void select_Your_Password_Next_Day_Air(){
		Your_Password_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "Your_Password_2nd_Day_Air")
	public WebElement Your_Password_2nd_Day_Air;

public void verify_Your_Password_2nd_Day_Air_Status(String data){
		//Verifies the Status of the Your_Password_2nd_Day_Air
		Assert.assertEquals(Your_Password_2nd_Day_Air,Your_Password_2nd_Day_Air);
}

public void select_Your_Password_2nd_Day_Air(){
		Your_Password_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "Your_Password_payment_options")
	public WebElement Your_Password_payment_options;

public void verify_Your_Password_payment_options_Status(String data){
		//Verifies the Status of the Your_Password_payment_options
		Assert.assertEquals(Your_Password_payment_options,Your_Password_payment_options);
}

public void select_Your_Password_payment_options(){
		Your_Password_payment_options.click();
}

@FindBy(how= How.ID, using = "Your_Password_COD")
	public WebElement Your_Password_COD;

public void verify_Your_Password_COD_Status(String data){
		//Verifies the Status of the Your_Password_COD
		Assert.assertEquals(Your_Password_COD,Your_Password_COD);
}

public void select_Your_Password_COD(){
		Your_Password_COD.click();
}

@FindBy(how= How.ID, using = "Your_Password_Credit_Card")
	public WebElement Your_Password_Credit_Card;

public void verify_Your_Password_Credit_Card_Status(String data){
		//Verifies the Status of the Your_Password_Credit_Card
		Assert.assertEquals(Your_Password_Credit_Card,Your_Password_Credit_Card);
}

public void select_Your_Password_Credit_Card(){
		Your_Password_Credit_Card.click();
}

@FindBy(how= How.ID, using = "Your_Password_Check")
	public WebElement Your_Password_Check;

public void verify_Your_Password_Check_Status(String data){
		//Verifies the Status of the Your_Password_Check
		Assert.assertEquals(Your_Password_Check,Your_Password_Check);
}

public void select_Your_Password_Check(){
		Your_Password_Check.click();
}

@FindBy(how= How.ID, using = "Your_Password_PO")
	public WebElement Your_Password_PO;

public void verify_Your_Password_PO_Status(String data){
		//Verifies the Status of the Your_Password_PO
		Assert.assertEquals(Your_Password_PO,Your_Password_PO);
}

public void select_Your_Password_PO(){
		Your_Password_PO.click();
}

@FindBy(how= How.ID, using = "Your_Password_COnfirmation")
	public WebElement Your_Password_COnfirmation;

public void verify_Your_Password_COnfirmation_Status(String data){
		//Verifies the Status of the Your_Password_COnfirmation
		Assert.assertEquals(Your_Password_COnfirmation,Your_Password_COnfirmation);
}

public void select_Your_Password_COnfirmation(){
		Your_Password_COnfirmation.click();
}

@FindBy(how= How.ID, using = "Your_Password_Gender")
	public WebElement Your_Password_Gender;

public void verify_Your_Password_Gender_Status(String data){
		//Verifies the Status of the Your_Password_Gender
		Assert.assertEquals(Your_Password_Gender,Your_Password_Gender);
}

public void select_Your_Password_Gender(){
		Your_Password_Gender.click();
}

@FindBy(how= How.ID, using = "Your_Password_Male")
	public WebElement Your_Password_Male;

public void verify_Your_Password_Male_Status(String data){
		//Verifies the Status of the Your_Password_Male
		Assert.assertEquals(Your_Password_Male,Your_Password_Male);
}

public void select_Your_Password_Male(){
		Your_Password_Male.click();
}

@FindBy(how= How.ID, using = "Your_Password_Female")
	public WebElement Your_Password_Female;

public void verify_Your_Password_Female_Status(String data){
		//Verifies the Status of the Your_Password_Female
		Assert.assertEquals(Your_Password_Female,Your_Password_Female);
}

public void select_Your_Password_Female(){
		Your_Password_Female.click();
}

@FindBy(how= How.ID, using = "Your_Password_Login")
	public WebElement Your_Password_Login;

public void verify_Your_Password_Login_Status(String data){
		//Verifies the Status of the Your_Password_Login
		Assert.assertEquals(Your_Password_Login,Your_Password_Login);
}

public void select_Your_Password_Login(){
		Your_Password_Login.click();
}

@FindBy(how= How.ID, using = "Your_Password_Shipping_options")
	public WebElement Your_Password_Shipping_options;

public void verify_Your_Password_Shipping_options_Status(String data){
		//Verifies the Status of the Your_Password_Shipping_options
		Assert.assertEquals(Your_Password_Shipping_options,Your_Password_Shipping_options);
}

public void select_Your_Password_Shipping_options(){
		Your_Password_Shipping_options.click();
}

@FindBy(how= How.ID, using = "Your_Password_Ground")
	public WebElement Your_Password_Ground;

public void verify_Your_Password_Ground_Status(String data){
		//Verifies the Status of the Your_Password_Ground
		Assert.assertEquals(Your_Password_Ground,Your_Password_Ground);
}

public void select_Your_Password_Ground(){
		Your_Password_Ground.click();
}

@FindBy(how= How.ID, using = "Your_Password_Next_Day_Air")
	public WebElement Your_Password_Next_Day_Air;

public void verify_Your_Password_Next_Day_Air_Status(String data){
		//Verifies the Status of the Your_Password_Next_Day_Air
		Assert.assertEquals(Your_Password_Next_Day_Air,Your_Password_Next_Day_Air);
}

public void select_Your_Password_Next_Day_Air(){
		Your_Password_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "Your_Password_2nd_Day_Air")
	public WebElement Your_Password_2nd_Day_Air;

public void verify_Your_Password_2nd_Day_Air_Status(String data){
		//Verifies the Status of the Your_Password_2nd_Day_Air
		Assert.assertEquals(Your_Password_2nd_Day_Air,Your_Password_2nd_Day_Air);
}

public void select_Your_Password_2nd_Day_Air(){
		Your_Password_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "Your_Password_payment_options")
	public WebElement Your_Password_payment_options;

public void verify_Your_Password_payment_options_Status(String data){
		//Verifies the Status of the Your_Password_payment_options
		Assert.assertEquals(Your_Password_payment_options,Your_Password_payment_options);
}

public void select_Your_Password_payment_options(){
		Your_Password_payment_options.click();
}

@FindBy(how= How.ID, using = "Your_Password_COD")
	public WebElement Your_Password_COD;

public void verify_Your_Password_COD_Status(String data){
		//Verifies the Status of the Your_Password_COD
		Assert.assertEquals(Your_Password_COD,Your_Password_COD);
}

public void select_Your_Password_COD(){
		Your_Password_COD.click();
}

@FindBy(how= How.ID, using = "Your_Password_Credit_Card")
	public WebElement Your_Password_Credit_Card;

public void verify_Your_Password_Credit_Card_Status(String data){
		//Verifies the Status of the Your_Password_Credit_Card
		Assert.assertEquals(Your_Password_Credit_Card,Your_Password_Credit_Card);
}

public void select_Your_Password_Credit_Card(){
		Your_Password_Credit_Card.click();
}

@FindBy(how= How.ID, using = "Your_Password_Check")
	public WebElement Your_Password_Check;

public void verify_Your_Password_Check_Status(String data){
		//Verifies the Status of the Your_Password_Check
		Assert.assertEquals(Your_Password_Check,Your_Password_Check);
}

public void select_Your_Password_Check(){
		Your_Password_Check.click();
}

@FindBy(how= How.ID, using = "Your_Password_PO")
	public WebElement Your_Password_PO;

public void verify_Your_Password_PO_Status(String data){
		//Verifies the Status of the Your_Password_PO
		Assert.assertEquals(Your_Password_PO,Your_Password_PO);
}

public void select_Your_Password_PO(){
		Your_Password_PO.click();
}

@FindBy(how= How.ID, using = "Your_Password_COnfirmation")
	public WebElement Your_Password_COnfirmation;

public void verify_Your_Password_COnfirmation_Status(String data){
		//Verifies the Status of the Your_Password_COnfirmation
		Assert.assertEquals(Your_Password_COnfirmation,Your_Password_COnfirmation);
}

public void select_Your_Password_COnfirmation(){
		Your_Password_COnfirmation.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}