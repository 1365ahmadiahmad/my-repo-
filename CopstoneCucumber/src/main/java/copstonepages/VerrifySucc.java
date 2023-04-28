package copstonepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.jodah.failsafe.internal.util.Assert;


public class VerrifySucc {

	@FindBy(css = ".complete-text")
	WebElement succmsg;
	@FindBy(css = "#checkout_complete_container > h2")
	WebElement secondmsg;
	public VerrifySucc(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void verrifySuccMsg() {
		String expected = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actual = succmsg.getText();
		Assert.isTrue(true, actual,expected);
	}
	public void verrifysecondSucc() {
		String expected = "Thank you for your order!";
		String actual = secondmsg.getText();
		Assert.isTrue(true, actual, expected);
	}
}
