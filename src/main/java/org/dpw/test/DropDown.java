package org.dpw.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		Locators l = new Locators(driver);
		
		//select.selectByIndex(10);
		//select.selectByValue("AUS");
		//select.selectByVisibleText("Benin");
		//List<WebElement> options = select.getOptions();
		//System.out.println(options.size());
		
//		doSelectByIndex(dropdown, 5);
//		int doGetDropdownSize = doGetDropdownSize(dropdown);
//		System.out.println(doGetDropdownSize);
		
//		List<WebElement> options = select.getOptions();
//		for (WebElement e : options) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
	
		WebElement clickOne = driver.findElement(By.id("justAnInputBox"));
		clickOne.click();
		By dropdown = By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//span");
		List<WebElement> options = driver.findElements(dropdown);
		
		System.out.println(options.size());
		
		for (WebElement e : options) {
			String optionsList = e.getText();
			if(!optionsList.startsWith("−")) {
			System.out.println(optionsList);
			}
		}
		
		
		
	}
	
	public static List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}
	
		
	}


