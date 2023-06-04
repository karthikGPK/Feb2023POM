package org.dpw.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomShadow_2804 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("chrome://settings/");

		String oneValue = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement data = (WebElement) js.executeScript(oneValue);
		data.sendKeys("Value one");
	}

}
