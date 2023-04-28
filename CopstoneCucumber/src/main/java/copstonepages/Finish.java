package copstonepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finish {
	
	@FindBy(id = "finish")
	WebElement finishbtn;
	
	public Finish(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void clickFinish() {
		finishbtn.click();
	}

}
