package copstonepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.jodah.failsafe.internal.util.Assert;


public class YourCart {

	@FindBy(css = ".title")
	WebElement verrifyyourcart;
	
	public YourCart(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public void verrifytext() {
		String expect = "Your Cart";
		String actual = verrifyyourcart.getText();
		Assert.isTrue(true, actual, expect);
	}
}
