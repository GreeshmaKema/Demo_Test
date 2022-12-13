package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Error_message_Page extends PageObjectBase{
public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}