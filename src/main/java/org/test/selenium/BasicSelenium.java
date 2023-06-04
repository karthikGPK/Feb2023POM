package org.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.safari.SafariOptions;

public class BasicSelenium {

	public static void main(String[] args) {

		LibraryClass lc = new LibraryClass();
//		lc.firstStep("chrome");
//		lc.getURL("https://staging-runner.cargoes.com/");
//
//		String s = lc.getTitle();
//		System.out.println(s);
//		lc.currentURL();

		ChromeOptions co = new ChromeOptions();
		EdgeOptions eo = new EdgeOptions();
		FirefoxOptions fo = new FirefoxOptions();
		SafariOptions so = new SafariOptions();
				
		

	
		co.addArguments("--incognito"); 
		WebDriver driver = new ChromeDriver(co);
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().window().minimize();

//		driver.get("https://www.youtube.com/");
//
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		
		
		// diff quit and close 

	}

}
