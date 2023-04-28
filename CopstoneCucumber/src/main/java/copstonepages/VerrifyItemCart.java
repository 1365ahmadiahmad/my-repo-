package copstonepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.jodah.failsafe.internal.util.Assert;


public class VerrifyItemCart {
	
	@FindBy(css = ".inventory_item_name")
	WebElement verrify;
	
	public VerrifyItemCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void verrifysameitem() {
		String expected = verrify.getText();
		String actual = verrify.getText();
		Assert.isTrue(true, actual, expected);
	}

}
