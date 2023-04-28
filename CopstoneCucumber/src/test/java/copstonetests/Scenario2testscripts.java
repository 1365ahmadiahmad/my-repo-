package copstonetests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import copstonepages.ErrorMsg;
import copstonepages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Scenario2testscripts {


	WebDriver driver;
	@Given("user in loginpage of Saucedemo")
	public void user_in_loginpage_of_saucedemo() {
	    
		System.setProperty("webdriver.chrome.driver", "rescource//chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@Given("user enters his uuername and password and ckicks login button")
	public void user_enters_his_uuername_and_password_and_ckicks_login_button() {
	    
		LoginPage login = new LoginPage(driver);
		login.username();
		login.enterPassword();
		login.clickLoginBtn();
	}

	@Then("user must able to see {string}")
	public void user_must_able_to_see(String string) {
	   
		ErrorMsg verrify = new ErrorMsg(driver);
		verrify.verrifyError();
		driver.quit();
	}
}
