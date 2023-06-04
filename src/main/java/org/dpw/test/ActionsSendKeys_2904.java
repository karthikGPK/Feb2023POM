package org.dpw.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeys_2904 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		// Actions : Send Keys ( Target , value )
//		driver.get("https://www.amazon.com/");
		Actions action = new Actions(driver);
//		WebElement box = driver.findElement(By.id("twotabsearchtextbox"));
//		action.sendKeys(box, "MacBook Pro").build().perform();
		
		// Actions : Send keys : Tab Sequence
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		// Actions : Partial scrolling
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_UP).build().perform();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_UP).build().perform();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_UP).build().perform();
		
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("Kart");
		action.sendKeys(Keys.TAB);
		action.sendKeys("Value");
		// Actions will not work w/o build and perform
		
		action.sendKeys(Keys.TAB);
		action.sendKeys("Email");
		
		action.sendKeys(Keys.TAB);
		action.sendKeys("Tele");

		
		action.sendKeys(Keys.TAB);
		action.sendKeys("Password");
		
		action.sendKeys(Keys.TAB);
		action.sendKeys("Confirm Password").build().perform();
		
		//TAb
		//PAGE_DOWN
		//PAGE_UP
		//PAUSE
		//COMMAND
		//END
		//HOME
		
		
		action.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).build().perform();
		
		
		
		
		
		
		
		
		
		

	}

}
