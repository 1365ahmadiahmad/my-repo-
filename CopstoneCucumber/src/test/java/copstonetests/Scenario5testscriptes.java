package copstonetests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import copstonepages.AddToItems;
import copstonepages.Checkout;
import copstonepages.ContinueShopping;
import copstonepages.Finish;
import copstonepages.LoginPage;
import copstonepages.PersonalInfo;
import copstonepages.Removeitem;
import copstonepages.SortItem;
import copstonepages.Verrify2items;
import copstonepages.VerrifySucc;
import copstonepages.YourCart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Scenario5testscriptes {

	WebDriver driver;
	@Given("he must on saucedemo page")
	public void he_must_on_saucedemo_page() {
	   
		System.setProperty("webdriver.chrome.driver", "rescource//chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@Given("user enters his username and password and clicks on login button")
	public void user_enters_his_username_and_password_and_clicks_on_login_button() {
	   
		LoginPage login = new LoginPage(driver);
		login.enterUsername();
		login.enterPassword();
		login.clickLoginBtn();
		
	}

	@Given("adds first and thrid items to cart")
	public void adds_first_and_thrid_items_to_cart() {
	   
		AddToItems add = new AddToItems(driver);
		add.addFirstOne();
		add.addthriditem();
	}

	@Given("removes first item from cart and clicks on cart button right up corner")
	public void removes_first_item_from_cart_and_clicks_on_cart_button_right_up_corner() {
	   
		Removeitem remove = new Removeitem(driver);
		remove.removeItem();
		AddToItems clicks = new AddToItems(driver);
		clicks.clickCartBtn();
	}

	@Given("sees your cart text on left corner up and clicks continue shopping button")
	public void sees_your_cart_text_on_left_corner_up_and_clicks_continue_shopping_button() {
	    
		YourCart yourcart = new YourCart(driver);
		yourcart.verrifytext();
		
		ContinueShopping click = new ContinueShopping(driver);
		click.clickCountinueshopping();
	}

	@Given("sorts items from high to low based price")
	public void sorts_items_from_high_to_low_based_price() {
	    
		SortItem sort = new SortItem(driver);
		sort.sorthightolow();
	}

	@Given("adds expensive item to cart and clicks cart button")
	public void adds_expensive_item_to_cart_and_clicks_cart_button() {
	   
		AddToItems expen = new AddToItems(driver);
		expen.highPriceitem();
		expen.clickCartBtn();
	}

	@Given("can see two items in the cart")
	public void can_see_two_items_in_the_cart() {
	    
		Verrify2items twoitems = new Verrify2items(driver);
		twoitems.verrify2items();
	}

	@Given("user clicks checkout button")
	public void user_clicks_checkout_button() {
	    
		Checkout checkout = new Checkout(driver);
		checkout.clickCheckout();
	}

	@Given("enters his first and last name and postal code in  the text boxes and clicks on continue button")
	public void enters_his_first_and_last_name_and_postal_code_in_the_text_boxes_and_clicks_on_continue_button() {
	   
		PersonalInfo personalinfo = new PersonalInfo(driver);
		personalinfo.enterFirstname();
		personalinfo.enterLastname();
		personalinfo.enerPostalcode();
		personalinfo.clickContinue();
	}

	@Given("clicks on finish button")
	public void clicks_on_finish_button() {
	    
		Finish finish = new Finish(driver);
		finish.clickFinish();
	}

	@Then("user can see success message {string}")
	public void user_can_see_success_message(String string) {
	    
		VerrifySucc verrifysucc = new VerrifySucc(driver);
		verrifysucc.verrifysecondSucc();
		driver.quit();
	}
}
