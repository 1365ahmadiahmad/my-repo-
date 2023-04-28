package copstonepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinueShopping {
	
	@FindBy(id = "continue-shopping")
	WebElement continueshopping;
	
	public ContinueShopping(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickCountinueshopping() {
		continueshopping.click();
	}

}
