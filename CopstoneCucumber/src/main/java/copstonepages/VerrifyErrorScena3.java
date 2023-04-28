package copstonepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.jodah.failsafe.internal.util.Assert;


public class VerrifyErrorScena3 {
	
	@FindBy(css = ".error-message-container")
	WebElement errormsg;
	
	public VerrifyErrorScena3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void verrifyErrorMsg() {
		String expected = "Error: Last Name is required";
		String actual = errormsg.getText();
		Assert.isTrue(true, actual, expected);
		
	}

}
