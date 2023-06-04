package org.dpw.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonFooter_0305 {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");

//		List<WebElement> columnValues = driver.findElements(By.xpath("//div[text()='Get to Know Us']/../ul/li"));
//
//		for (int i = 0; i <= columnValues.size() - 1; i++) {
//			String text = columnValues.get(i).getText();
//			System.out.println(text);
//		}
		columnValue("Amazon Payment Products");
	}

	public static void columnValue(String name) {
		List<WebElement> columnValues = driver.findElements(By.xpath("//div[text()='"+name+"']/../ul/li"));

		for (int i = 0; i <= columnValues.size() - 1; i++) {
			String text = columnValues.get(i).getText();
			System.out.println(text);
		}
	}

}
