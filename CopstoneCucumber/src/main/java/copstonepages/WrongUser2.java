package copstonepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import net.jodah.failsafe.internal.util.Assert;

public class WrongUser2 {
	
	
	WebDriver driver ;
	public void wrongUserScenario2() {
		
		System.setProperty("webdriver.chrome.driver","rescource//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.cssSelector(".error-message-container > h3:nth-child(1)"));
		
		String expected = "Epic sadface: Sorry, this user has been locked out.";
		WebElement actual = driver.findElement(By.cssSelector(".error-message-container > h3:nth-child(1)"));
		
		Assert.isTrue(true, expected, actual);
		
	}
	public WrongUser2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
