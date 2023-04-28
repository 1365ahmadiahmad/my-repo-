package copstonetests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import copstonepages.AddToItems;
import copstonepages.Checkout;
import copstonepages.PersonalInfo;
import copstonepages.VerrifyErrorScena3;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class Scenario3testscripts {

	WebDriver driver ; 
	@Given("user on saucedemo page")
	public void user_on_saucedemo_page() {
	   
		System.setProperty("webdriver.chrome.driver", "rescource//chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@Given("enters his username and password and clicks on login button")
	public void enters_his_username_and_password_and_clicks_on_login_button() {
	    
		LoginPage login = new LoginPage(driver);
		login.username();
		login.enterPassword();
		login.clickLoginBtn();
	}

	@Given("adds first item on his cart and clicks on cart button on right up corner")
	public void adds_first_item_on_his_cart_and_clicks_on_cart_button_on_right_up_corner() {
	    
		AddToItems add = new AddToItems(driver);
		add.addFirstOne();
		add.clickCartBtn();
	}

	@Given("clicks checkout button")
	public void clicks_checkout_button() {
	   
		Checkout checkout = new Checkout(driver);
		checkout.clickCheckout();
	}

	@Given("enters his first and last name and postal code and clicks continue button")
	public void enters_his_first_and_last_name_and_postal_code_and_clicks_continue_button() {
	   
		PersonalInfo enter = new PersonalInfo(driver);
		enter.enterFirstname();
		enter.enterLastname();
		enter.enerPostalcode();
		enter.clickContinue();
	}

	@Then("can see error message {string}")
	public void can_see_error_message(String string) {
	   
		VerrifyErrorScena3 verrify = new VerrifyErrorScena3(driver);
		verrify.verrifyErrorMsg();
		driver.quit();
	}

}
