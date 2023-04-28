package copstonepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SortItem  {
	
	@FindBy(css = "#header_container > div.header_secondary_container > div > span > select")
	WebElement dropdown;
	
	public SortItem(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void sortlowtohigh() {
		Select select = new Select(dropdown);
		select.selectByVisibleText("Price (low to high)");
	}
	public void sorthightolow() {
		Select select = new Select(dropdown);
		select.selectByVisibleText("Price (high to low)");
	}

}
