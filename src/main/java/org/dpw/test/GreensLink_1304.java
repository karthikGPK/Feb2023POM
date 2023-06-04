package org.dpw.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GreensLink_1304{
	static WebDriver driver;
 

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement findElement = driver.findElement(By.xpath("//div[text()='Courses ']"));
		findElement.click();
		
		
		List<WebElement> optionsList = driver.findElements(By.xpath("//div[text()='Courses ']//following-sibling::div/ul/li"));
		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals("Data Warehousing (5)")) {
				e.click();
				break;
			}
			
		}
	}
}
