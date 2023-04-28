package copstonetests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import copstonepages.AddToItems;
import copstonepages.Checkout;
import copstonepages.Finish;
import copstonepages.PersonalInfo;
import copstonepages.SortItem;
import copstonepages.VerrifyItemCart;
import copstonepages.VerrifySucc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class Scenario4testscripts {

	WebDriver driver ;
	@Given("user on the saucedemo page")
	public void user_on_the_saucedemo_page() {
	   
		System.setProperty("webdriver.chrome.driver", "rescource//chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@Given("enters his username and password and clicks login button")
	public void enters_his_username_and_password_and_clicks_login_button() {
	   
		LoginPage login = new LoginPage(driver);
		login.enterUsername();
		login.enterPassword();
		login.clickLoginBtn();
	}

	@Given("sorts items based on price from low to high")
	public void sorts_items_based_on_price_from_low_to_high() {
	   
		SortItem low_to_high = new SortItem(driver);
		low_to_high.sortlowtohigh();
	}

	@Given("adds first item to cart and clicks cart buttons")
	public void adds_first_item_to_cart_and_clicks_cart_buttons() {
	    
		AddToItems add = new AddToItems(driver);
		add.addFirstOne();
		add.clickCartBtn();
	}

	@Given("verrifies same selected item")
	public void verrifies_same_selected_item() {
	   
		VerrifyItemCart verrify = new VerrifyItemCart(driver);
		verrify.verrifysameitem();
	}

	@Given("clicks checkout buttons")
	public void clicks_checkout_buttons() {
	   
		Checkout  checkout = new Checkout(driver);
		checkout.clickCheckout();
	}

	@Given("enters his first and last name and pastol code and clicks continue buttons")
	public void enters_his_first_and_last_name_and_pastol_code_and_clicks_continue_buttons() {
	    
		PersonalInfo enterinfo = new PersonalInfo(driver);
		enterinfo.enterFirstname();
		enterinfo.enterLastname();
		enterinfo.enerPostalcode();
		enterinfo.clickContinue();
	}

	@Given("clicks finish button")
	public void clicks_finish_button() {
	   
		Finish finish = new Finish(driver);
		finish.clickFinish();
	}

	@Then("can see success message {string}")
	public void can_see_success_message(String string) {
	    
		VerrifySucc succ = new VerrifySucc(driver);
		succ.verrifysecondSucc();
		driver.quit();
	}
}
