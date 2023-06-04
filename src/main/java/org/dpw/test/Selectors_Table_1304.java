package org.dpw.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectors_Table_1304 {
	// Parent // Ancestor // Cild
	static WebDriver driver;
	

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
//		WebElement findElement = driver.findElement(By.xpath("//a[text()='Jordan.Mathews']/parent::td/preceding-sibling::td/input"
//				+ "[@id='ohrmList_chkSelectRecord_14']"));
//		if(findElement.isDisplayed()) {
//			findElement.click();
//		}
//		
//		List<WebElement> personInfo = driver.findElements(By.xpath("//a[text()='Jordan.Mathews']/parent::td/preceding-sibling::td/input[@id='ohrmList_chkSelectRecord_14']/../following-sibling::td"));
//		System.out.println(personInfo.size());
//		for (WebElement e : personInfo) {
//			String text = e.getText();
//			System.out.println(text);
		// click second table were India
		List<WebElement> clickAll = driver.findElements(By.xpath("//td[text()='India']/parent::tr//input[@type='checkbox']"));
		for (WebElement e : clickAll) {
			e.click();
		}
			
		}

	}


