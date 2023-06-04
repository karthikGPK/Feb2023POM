package org.dpw.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLibrary {
	WebDriver driver;

	public WebDriver driver(String browser) {

		if (browser == null) {
			System.out.println("Browser is null");
		}
			else {
		
		switch (browser.toLowerCase().trim()) {

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "chrome":
			driver = new ChromeDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println(" Please pass correct browser " + " " + browser);
			break;
		}
		

	}
		return driver;
	}

	public void getDriver(String url) {
		driver.get(url);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public void quit() {
		driver.quit();
	}

	public void close() {
		driver.close();
	}

	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	public void sendKeys(By Locator, String value) {
		findElement(Locator).sendKeys(value);
	}

	// Utility for Equals
	public Boolean titleEqual(String Actual, String expected) {
		boolean flag;
		if (Actual.equals(expected)) {
			System.out.println("Pass" + " " + Actual);
			flag = true;

		} else {
			flag = false;
		}
		return flag;

	}

	// Utiliy for Contains
	public Boolean titleContain(String Actual, String expected) {
		boolean flag;
		if (Actual.contains(expected)) {
			System.out.println("Pass" + " " + Actual);
			flag = true;

		} else {
			flag = false;
		}
		return flag;

	}

}
