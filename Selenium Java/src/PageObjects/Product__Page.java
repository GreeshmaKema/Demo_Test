package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Product_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "130_00")
	public static WebElement 130_00;

public void verify_130_00(String data){
		Assert.assertEquals(130_00,130_00);
}

public void verify_130_00_Status(String data){
		//Verifies the Status of the 130_00
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(130_00.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(130_00.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!130_00.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!130_00.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Qty")
	public static WebElement Qty;

public void verify_Qty(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Qty.getAttribute("value"),data);
	}

}

public void verify_Qty_Status(String data){
		//Verifies the Status of the Qty
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Qty.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Qty.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Qty.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Qty.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Qty(String data){
		Qty.clear();
		Qty.sendKeys(data);
}

@FindBy(how= How.ID, using = "Add_to_Cart")
	public static WebElement Add_to_Cart;

public void verify_Add_to_Cart_Status(String data){
		//Verifies the Status of the Add_to_Cart
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_to_Cart.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_to_Cart.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_to_Cart.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_to_Cart.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_to_Cart(){
		Add_to_Cart.click();
}

@FindBy(how= How.ID, using = "130.00_Gender")
	public WebElement 130_00_Gender;

public void verify_130_00_Gender_Status(String data){
		//Verifies the Status of the 130_00_Gender
		Assert.assertEquals(130_00_Gender,130_00_Gender);
}

public void select_130_00_Gender(){
		130_00_Gender.click();
}

@FindBy(how= How.ID, using = "130.00_Male")
	public WebElement 130_00_Male;

public void verify_130_00_Male_Status(String data){
		//Verifies the Status of the 130_00_Male
		Assert.assertEquals(130_00_Male,130_00_Male);
}

public void select_130_00_Male(){
		130_00_Male.click();
}

@FindBy(how= How.ID, using = "130.00_Female")
	public WebElement 130_00_Female;

public void verify_130_00_Female_Status(String data){
		//Verifies the Status of the 130_00_Female
		Assert.assertEquals(130_00_Female,130_00_Female);
}

public void select_130_00_Female(){
		130_00_Female.click();
}

@FindBy(how= How.ID, using = "130.00_Login")
	public WebElement 130_00_Login;

public void verify_130_00_Login_Status(String data){
		//Verifies the Status of the 130_00_Login
		Assert.assertEquals(130_00_Login,130_00_Login);
}

public void select_130_00_Login(){
		130_00_Login.click();
}

@FindBy(how= How.ID, using = "130.00_Shipping_options")
	public WebElement 130_00_Shipping_options;

public void verify_130_00_Shipping_options_Status(String data){
		//Verifies the Status of the 130_00_Shipping_options
		Assert.assertEquals(130_00_Shipping_options,130_00_Shipping_options);
}

public void select_130_00_Shipping_options(){
		130_00_Shipping_options.click();
}

@FindBy(how= How.ID, using = "130.00_Ground")
	public WebElement 130_00_Ground;

public void verify_130_00_Ground_Status(String data){
		//Verifies the Status of the 130_00_Ground
		Assert.assertEquals(130_00_Ground,130_00_Ground);
}

public void select_130_00_Ground(){
		130_00_Ground.click();
}

@FindBy(how= How.ID, using = "130.00_Next_Day_Air")
	public WebElement 130_00_Next_Day_Air;

public void verify_130_00_Next_Day_Air_Status(String data){
		//Verifies the Status of the 130_00_Next_Day_Air
		Assert.assertEquals(130_00_Next_Day_Air,130_00_Next_Day_Air);
}

public void select_130_00_Next_Day_Air(){
		130_00_Next_Day_Air.click();
}

@FindBy(how= How.ID, using = "130.00_2nd_Day_Air")
	public WebElement 130_00_2nd_Day_Air;

public void verify_130_00_2nd_Day_Air_Status(String data){
		//Verifies the Status of the 130_00_2nd_Day_Air
		Assert.assertEquals(130_00_2nd_Day_Air,130_00_2nd_Day_Air);
}

public void select_130_00_2nd_Day_Air(){
		130_00_2nd_Day_Air.click();
}

@FindBy(how= How.ID, using = "130.00_payment_options")
	public WebElement 130_00_payment_options;

public void verify_130_00_payment_options_Status(String data){
		//Verifies the Status of the 130_00_payment_options
		Assert.assertEquals(130_00_payment_options,130_00_payment_options);
}

public void select_130_00_payment_options(){
		130_00_payment_options.click();
}

@FindBy(how= How.ID, using = "130.00_COD")
	public WebElement 130_00_COD;

public void verify_130_00_COD_Status(String data){
		//Verifies the Status of the 130_00_COD
		Assert.assertEquals(130_00_COD,130_00_COD);
}

public void select_130_00_COD(){
		130_00_COD.click();
}

@FindBy(how= How.ID, using = "130.00_Credit_Card")
	public WebElement 130_00_Credit_Card;

public void verify_130_00_Credit_Card_Status(String data){
		//Verifies the Status of the 130_00_Credit_Card
		Assert.assertEquals(130_00_Credit_Card,130_00_Credit_Card);
}

public void select_130_00_Credit_Card(){
		130_00_Credit_Card.click();
}

@FindBy(how= How.ID, using = "130.00_Check")
	public WebElement 130_00_Check;

public void verify_130_00_Check_Status(String data){
		//Verifies the Status of the 130_00_Check
		Assert.assertEquals(130_00_Check,130_00_Check);
}

public void select_130_00_Check(){
		130_00_Check.click();
}

@FindBy(how= How.ID, using = "130.00_PO")
	public WebElement 130_00_PO;

public void verify_130_00_PO_Status(String data){
		//Verifies the Status of the 130_00_PO
		Assert.assertEquals(130_00_PO,130_00_PO);
}

public void select_130_00_PO(){
		130_00_PO.click();
}

@FindBy(how= How.ID, using = "130.00_COnfirmation")
	public WebElement 130_00_COnfirmation;

public void verify_130_00_COnfirmation_Status(String data){
		//Verifies the Status of the 130_00_COnfirmation
		Assert.assertEquals(130_00_COnfirmation,130_00_COnfirmation);
}

public void select_130_00_COnfirmation(){
		130_00_COnfirmation.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}