package copstonepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToItems {
	
	@FindBy(css = "#add-to-cart-sauce-labs-backpack")
	WebElement first_item;
	@FindBy(css = "#add-to-cart-sauce-labs-bike-light")
	WebElement second_item;
	@FindBy(css = "#shopping_cart_container")
	WebElement cart_button;
	@FindBy(css = "#add-to-cart-sauce-labs-onesie")
	WebElement lowprice;
	@FindBy(css = "#add-to-cart-sauce-labs-fleece-jacket")
	WebElement highprice;
	@FindBy(css = "#add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement thriditem;
	
	public AddToItems(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void addFirstOne() {
		first_item.click();
	}
	public void addSecondOne() {
		second_item.click();
	}public void clickCartBtn() {
		cart_button.click();
	}
	public void lowPriceItem() {
		lowprice.click();
	}
	public void highPriceitem() {
		highprice.click();
	}
	public void addthriditem() {
		thriditem.click();
	}

}
