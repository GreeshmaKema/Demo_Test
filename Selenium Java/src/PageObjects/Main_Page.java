package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Main_Page extends PageObjectBase{
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

@FindBy(how= How.ID, using = "Log_in")
	public static WebElement Log_in;

public void verify_Log_in_Status(String data){
		//Verifies the Status of the Log_in
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Log_in.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Log_in.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Log_in.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Log_in.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Log_in(){
		Log_in.click();
}

@FindBy(how= How.ID, using = "Shopping_cart")
	public static WebElement Shopping_cart;

public void verify_Shopping_cart_Status(String data){
		//Verifies the Status of the Shopping_cart
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Shopping_cart.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Shopping_cart.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Shopping_cart.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Shopping_cart.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Shopping_cart(){
		Shopping_cart.click();
}

@FindBy(how= How.ID, using = "Wishlist")
	public static WebElement Wishlist;

public void verify_Wishlist_Status(String data){
		//Verifies the Status of the Wishlist
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Wishlist.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Wishlist.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Wishlist.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Wishlist.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Wishlist(){
		Wishlist.click();
}

@FindBy(how= How.ID, using = "log_out")
	public static WebElement log_out;

public void verify_log_out_Status(String data){
		//Verifies the Status of the log_out
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(log_out.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(log_out.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!log_out.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!log_out.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_log_out(){
		log_out.click();
}

@FindBy(how= How.ID, using = "Jewelery")
	public static WebElement Jewelery;

public void click_Jewelery(){
		Jewelery.click();
}

@FindBy(how= How.ID, using = "Design_Type")
	public static WebElement Design_Type;

public void click_Design_Type(){
		Design_Type.click();
}

@FindBy(how= How.ID, using = "Diamond_Heart")
	public static WebElement Diamond_Heart;

public void click_Diamond_Heart(){
		Diamond_Heart.click();
}

@FindBy(how= How.ID, using = "Click")
	public static WebElement Click;

public void click_Click(){
		Click.click();
}

@FindBy(how= How.ID, using = "Diamond_bracelet")
	public static WebElement Diamond_bracelet;

public void click_Diamond_bracelet(){
		Diamond_bracelet.click();
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

@FindBy(how= How.ID, using = "item1")
	public static WebElement item1;

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
public void click_item1(){
		item1.click();
}

@FindBy(how= How.ID, using = "Item2")
	public static WebElement Item2;

public void verify_Item2_Status(String data){
		//Verifies the Status of the Item2
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Item2.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Item2.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Item2.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Item2.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Item2(){
		Item2.click();
}

@FindBy(how= How.ID, using = "item3")
	public static WebElement item3;

public void verify_item3_Status(String data){
		//Verifies the Status of the item3
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(item3.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(item3.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!item3.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!item3.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_item3(){
		item3.click();
}

@FindBy(how= How.ID, using = "books")
	public static WebElement books;

public void click_books(){
		books.click();
}

@FindBy(how= How.ID, using = "computers")
	public static WebElement computers;

public void click_computers(){
		computers.click();
}

@FindBy(how= How.ID, using = "electronics")
	public static WebElement electronics;

public void click_electronics(){
		electronics.click();
}

@FindBy(how= How.ID, using = "gift_cards")
	public static WebElement gift_cards;

public void click_gift_cards(){
		gift_cards.click();
}

@FindBy(how= How.ID, using = "items")
	public static WebElement items;

public void click_items(){
		items.click();
}

@FindBy(how= How.ID, using = "Jewelry")
	public static WebElement Jewelry;

public void click_Jewelry(){
		Jewelry.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}