package org.dpw.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.test.selenium.FireFox;
import org.test.selenium.LibraryClass;

public class TestRunner {
static WebDriver driver; 

	public static void main(String[] args) {

//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--private");
//		driver = new FirefoxDriver(fo);
//
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());

		// 1st
//		driver.findElement(By.id("input-firstname")).sendKeys("kartik");
//		driver.findElement(By.id("input-lastname")).sendKeys("GP");
//		driver.findElement(By.id("input-email")).sendKeys("abc@info.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("7890123");
//		driver.findElement(By.id("input-password")).sendKeys("TEST");
//		driver.findElement(By.id("input-confirm")).sendKeys("TEST");

		// 2nd

//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		WebElement lastName = driver.findElement(By.id("input-lastname"));
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement tele = driver.findElement(By.id("input-telephone"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		WebElement confirmPassword = driver.findElement(By.id("input-confirm"));
//		
//		firstName.sendKeys("test");
//		lastName.sendKeys("po");
//		email.sendKeys("abc");
//		tele.sendKeys("989000");
//		password.sendKeys("asdas");
//		confirmPassword.sendKeys("asss");

		// 3rd
//		By fName = By.id("input-firstname");
//		By lName = By.id("input-lastname");
//		By ema = By.id("input-email");
//		By tel = By.id("input-telephone");
//		By pwd = By.id("input-password");
//		By cPwd = By.id("input-confirm");
//
//		WebElement firstName = driver.findElement(fName);
//		WebElement lastName = driver.findElement(lName);
//		WebElement email = driver.findElement(ema);
//		WebElement tele = driver.findElement(tel);
//		WebElement pwd1 = driver.findElement(pwd);
//		WebElement cPwd1 = driver.findElement(cPwd);
//		
//		firstName.sendKeys("12");
//		lastName.sendKeys("tet");
//		email.sendKeys("one");
//		tele.sendKeys("ew");
//		pwd1.sendKeys("233");
//		cPwd1.sendKeys("2222");

		// 4t
//		By fName = By.id("input-firstname");
//		By lName = By.id("input-lastname");
//		By ema = By.id("input-email");
//		By tel = By.id("input-telephone");
//		By pwd = By.id("input-password");
//		By cPwd = By.id("input-confirm");

//		WebElement findElemnet = getFindElemnet(fName);
//		WebElement findElemnet2 = getFindElemnet(lName);
//		
//		findElemnet.sendKeys("one");
//		findElemnet2.sendKeys("tywo");

		// 5t
//		By fName = By.id("input-firstname");
//		By lName = By.id("input-lastname");
//		By ema = By.id("input-email");
//		By tel = By.id("input-telephone");
//		By pwd = By.id("input-password");
//		By cPwd = By.id("input-confirm");

		// sendKeys(fName, "old");
		// 6t
//		By fName = By.id("input-firstname");
//		By lName = By.id("input-lastname");
//		By ema = By.id("input-email");
//		By tel = By.id("input-telephone");
//		By pwd = By.id("input-password");
//		By cPwd = By.id("input-confirm");

//		Locators l = new Locators(driver);
//		l.sendKeys(fName, "one");
//		l.sendKeys(lName, "KGP");
//		l.sendKeys(ema, "abc@info.com");
//		l.sendKeys(tel, "9078907");
//		l.sendKeys(pwd, "abc@info");
//		l.sendKeys(cPwd, "send");

		// 7t - Naveen
		BrowserLibrary br = new BrowserLibrary();
		
		WebDriver driver1 = br.driver("firefox");
		br.getDriver("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(br.getTitle());
		System.out.println(br.getCurrentURL());
		
		Locators l = new Locators(driver);

		By fName = By.id("input-firstname");
		By lName = By.id("input-lastname");
		By ema = By.id("input-email");
		By tel = By.id("input-telephone");
		By pwd = By.id("input-password");
		By cPwd = By.id("input-confirm");
		
		l.doSendKeys(fName, "test env");

	}

//	public static WebElement getFindElemnet(By locator) {
//		return driver.findElement(locator);
//
//	}
//
//	public static void sendKeys(By locator, String value) {
//		getFindElemnet(locator).sendKeys(value);
//	}

}
