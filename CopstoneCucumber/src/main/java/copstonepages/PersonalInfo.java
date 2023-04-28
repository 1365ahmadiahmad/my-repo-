package copstonepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfo {
	
	@FindBy(id = "first-name")
	WebElement firstname;
	@FindBy(id = "last-name")
	WebElement lastname;
	@FindBy(id = "postal-code")
	WebElement postalcode;
	@FindBy(id = "continue")
	WebElement continuebtn;
	
	public PersonalInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterFirstname () {
		firstname.sendKeys("First Name");
	}
	public void enterLastname() {
		lastname.sendKeys("Last Name");
	}
	public void clickContinue() {
		continuebtn.click();
	}
	public void enerPostalcode() {
		postalcode.sendKeys("Postal Code");
	}

}
