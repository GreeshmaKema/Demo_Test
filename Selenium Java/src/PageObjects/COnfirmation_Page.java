package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class COnfirmation_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "THANK_YOU")
	public static WebElement THANK_YOU;

public void verify_THANK_YOU(String data){
		Assert.assertEquals(THANK_YOU,THANK_YOU);
}

public void verify_THANK_YOU_Status(String data){
		//Verifies the Status of the THANK_YOU
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(THANK_YOU.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(THANK_YOU.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!THANK_YOU.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!THANK_YOU.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Click_to_know_order_details")
	public static WebElement Click_to_know_order_details;

public void verify_Click_to_know_order_details_Status(String data){
		//Verifies the Status of the Click_to_know_order_details
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Click_to_know_order_details.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Click_to_know_order_details.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Click_to_know_order_details.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Click_to_know_order_details.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Click_to_know_order_details(){
		Click_to_know_order_details.click();
}

@FindBy(how= How.ID, using = "COntinue")
	public static WebElement COntinue;

public void verify_COntinue_Status(String data){
		//Verifies the Status of the COntinue
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(COntinue.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(COntinue.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!COntinue.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!COntinue.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_COntinue(){
		COntinue.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}