package copstonetests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import copstonepages.AddToItems;
import copstonepages.Checkout;
import copstonepages.Finish;
import copstonepages.LoginPage;
import copstonepages.PersonalInfo;
import copstonepages.VerrifySucc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class scenario1Testscripts {
	
	WebDriver driver;
	@Test
	@Given("user in loginpage of saucedemo")
	public void user_in_loginpage_of_saucedemo() {
	  
		System.setProperty("webdriver.chrome.driver", "rescource//chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
	}
	@Given("user inserts his username and password and clicks login button")
	public void user_inserts_his_username_and_password_and_clicks_login_button() {
	   
		 LoginPage login = new LoginPage(driver);
			login.enterUsername();
			login.enterPassword();
			login.clickLoginBtn();
		
	}
	@Given("user adds first and second items to cart and clicks on cartbutton")
	public void user_adds_first_and_second_items_to_cart_and_clicks_on_cartbutton() {
	  
		AddToItems add = new AddToItems(driver);
		add.addFirstOne();
		add.addSecondOne();
		add.clickCartBtn();
		
		
	}
	@Given("user clicks cneckout button")
	public void user_clicks_cneckout_button() {
	   
		Checkout checkout = new Checkout(driver);
		checkout.clickCheckout();
		
	}
	@Given("user enters his personal informations in to textboxes and clicks on continue button")
	public void user_enters_his_personal_informations_in_to_textboxes_and_clicks_on_continue_button() {
	   
		PersonalInfo enter = new PersonalInfo(driver);
		enter.enterFirstname();
		enter.enterLastname();
		enter.enerPostalcode();
		enter.clickContinue();
		
		
	}
	@Given("user clicks finish button")
	public void user_clicks_finish_button() {
	   
		Finish finish = new Finish(driver);
		finish.clickFinish();
		
	}
	@Then("user must see {string}")
	public void user_must_see(String string) {
	  
		VerrifySucc succ = new VerrifySucc(driver);
		succ.verrifySuccMsg();
		driver.quit();
	}

}
