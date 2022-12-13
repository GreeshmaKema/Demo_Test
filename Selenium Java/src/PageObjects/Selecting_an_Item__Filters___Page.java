package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Selecting_an_Item__Filters__Page extends PageObjectBase{
@FindBy(how= How.ID, using = "is")
	public static WebElement is;

public void verify_is_Status(String data){
		//Verifies the Status of the is
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(is.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(is.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!is.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!is.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_is(){
		is.click();
}

@FindBy(how= How.ID, using = "Criteria")
	public static WebElement Criteria;

public void verify_Criteria(String data){
		Assert.assertEquals(Criteria,Criteria);
}

public void enter_Criteria(String data){
		Criteria.sendKeys(data);
}

@FindBy(how= How.ID, using = "Value")
	public static WebElement Value;

public void verify_Value(String data){
		Assert.assertEquals(Value,Value);
}

public void enter_Value(String data){
		Value.sendKeys(data);
}

@FindBy(how= How.ID, using = "unnamed")
	public static WebElement unnamed;

public void verify_unnamed(String data){
		Assert.assertEquals(unnamed,unnamed);
}

public void enter_unnamed(String data){
		unnamed.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}