package org.dpw.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestRunner1 {

	public static void main(String[] args) {
		BrowserLibrary br = new BrowserLibrary();
		WebDriver driver = br.driver("firefox");
		br.getDriver("https://www.amazon.in/");
		
		System.out.println(br.getTitle());
		System.out.println(br.getCurrentURL());
		
		By userName = By.id("cargo-runner-username");
		By password = By.id("cargo-runner-password");
		By forgotpwd = By.xpath("//*[@id=\"login-input-form-wrapper\"]/div[1]/span/a");
		//By clickNewQuotes = By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span");
//		By email = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By confirmPassword = By.id("input-confirm");
//		By cBox = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
//		By continueBtn = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
//		By linkText = By.linkText("Login");
		
		Locators loc = new Locators(driver);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);
		System.out.println(links);
		
		for (int i = 0; i < size; i++) {
			String text = links.get(i).getText();
			if(text.length()>0) {
			System.out.println(i + " " + text);
			
		}
		}
		
		List<WebElement> image = driver.findElements(By.tagName("img"));
		int size2 = image.size();
		System.out.println(size2);
		
		
//		
		
		
		
		
		
	
		
		
		
		
		}
		
		

	}


