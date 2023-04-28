package copstonepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	
	@FindBy(id = "checkout")
	WebElement checkoutbtn;
	
	public Checkout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickCheckout() {
		checkoutbtn.click();
	}

}
