package org.dpw.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket_2904 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get(
				"https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-T2&gclid=EAIaIQobChMI-f2Bg43P_gIV2X8rCh2sDwDHEAAYASAAEgIKQfD_BwE");

		Actions action = new Actions(driver);
		
		WebElement firstElement = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
		action.moveToElement(firstElement).build().perform();
		Thread.sleep(2000);

		WebElement firstLevel = driver.findElement(By.xpath("(//a[text()='Beauty & Hygiene'])[2]"));
		action.moveToElement(firstLevel).build().perform();
		Thread.sleep(2000);

		WebElement secondLevel = driver.findElement(By.linkText("Men's Grooming"));
		action.moveToElement(secondLevel).build().perform();
		Thread.sleep(2000);
		
		WebElement lastLevel = driver.findElement(By.xpath("(//a[text()='Talc'])[2]"));
		action.moveToElement(lastLevel).build().perform();
		Thread.sleep(2000);
		lastLevel.click();
		
		action.contextClick(lastLevel);
	
	}
	
	
	
	

}
