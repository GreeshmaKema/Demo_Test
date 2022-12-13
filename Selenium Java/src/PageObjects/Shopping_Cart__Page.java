package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Shopping_Cart_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Checkout")
	public static WebElement Checkout;

public void verify_Checkout_Status(String data){
		//Verifies the Status of the Checkout
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Checkout.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Checkout.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Checkout.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Checkout.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Checkout(){
		Checkout.click();
}

@FindBy(how= How.ID, using = "item1")
	public static WebElement item1;

public void verify_item1(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(item1.getAttribute("value"),data);
	}

}

public void verify_item1_Status(String data){
		//Verifies the Status of the item1
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(item1.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(item1.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!item1.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!item1.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_item1(String data){
		if(item1.isSelected());
			item1.click();
}

@FindBy(how= How.ID, using = "I_Agree")
	public static WebElement I_Agree;

public void verify_I_Agree(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(I_Agree.getAttribute("value"),data);
	}

}

public void verify_I_Agree_Status(String data){
		//Verifies the Status of the I_Agree
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(I_Agree.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(I_Agree.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!I_Agree.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!I_Agree.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_I_Agree(String data){
		if(I_Agree.isSelected());
			I_Agree.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}