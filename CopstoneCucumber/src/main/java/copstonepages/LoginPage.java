package copstonepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "user-name")
	WebElement username;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(id = "login-button")
	WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername() {
		username.sendKeys("standard_user");
	}
	public void username() {
		username.sendKeys("problem_use");
	}
	public void enterPassword() {
		password.sendKeys("secret_sauce");
	}
	public void clickLoginBtn() {
		loginbtn.click();
	}
	public void wronguser() {
		username.sendKeys("locked_out_user");

}
}