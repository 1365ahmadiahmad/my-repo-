package copstonepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.jodah.failsafe.internal.util.Assert;


public class Verrify2items {

	
	@FindBy(css = "#shopping_cart_container > a > span")
	WebElement verrify2;
	
	public Verrify2items(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void verrify2items() {
		
		int expected = 2;
		String actual = verrify2.getText();
		Assert.isTrue(true, actual, expected);
	
		
	}
}
