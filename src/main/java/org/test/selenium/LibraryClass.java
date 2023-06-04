package org.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LibraryClass {

	WebDriver driver; // NS

	public void firstStep(String browser) {

		switch (browser.toLowerCase().trim()) { // lowercase, uuper case, substring,
		case "chrome":
//			ChromeOptions co = new ChromeOptions();
//			co.addArguments("--remote-allow-origins=*");

			driver = new ChromeDriver();

			break;

		case "firefox":
			driver = new FirefoxDriver();

			break;

		default:
			System.out.println(" Browser not valid ");
			// throw new MyMessage("Data");
			break;
		}

	}

	public void SystemSet(String key, String path, String browser) {

		System.setProperty(key, path);
		switch (browser.toLowerCase().trim()) { // lowercase, uuper case, substring,
		case "chrome":
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);

			break;

		case "firefox":
			driver = new FirefoxDriver();

			break;

		default:
			System.out.println(" Browser not valid ");
			// throw new MyMessage("Data");
			break;
		}

	}

	public void getURL(String url) {
		driver.get(url);

	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String currentURL() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void quit() {
		driver.quit();
	}
	
	
	
	

}
