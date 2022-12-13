package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Add_Cart_message_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "shopping_cart")
	public static WebElement shopping_cart;

public void verify_shopping_cart_Status(String data){
		//Verifies the Status of the shopping_cart
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(shopping_cart.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(shopping_cart.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!shopping_cart.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!shopping_cart.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_shopping_cart(){
		shopping_cart.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}