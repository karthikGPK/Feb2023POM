package org.dpw.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner2 {

	public static void main(String[] args) {

		BrowserLibrary br = new BrowserLibrary(); // Browser Lib
		WebDriver driver = br.driver("firefox");
		br.getDriver("https://www.amazon.com/");
		String title = br.getTitle();
		String currentURL = br.getCurrentURL();

		Boolean titleEqual = br.titleEqual(title, "Account Login");
		System.out.println(titleEqual);

		By id = By.id("input-email");

		Locators l = new Locators(driver); // Locators
		if (l.isDisplayed(id)) {
			l.doSendKeys(id, "Test");
		} else {
			System.out.println("Element not available " + " " + id);
		}

		String doGetAttribute = l.doGetAttribute(id, "placeholder");
		System.out.println(doGetAttribute);

		By tagName = By.tagName("a");
		

		l.doGetAll(tagName);
		By img = By.tagName("img");
		List<String> doGetElementsAttribute = l.doGetElementsAttribute(img, "src");
		System.out.println(doGetElementsAttribute);
		
		By className = By.className("list-group-item");
		List<WebElement> partialPage = driver.findElements(className);
		for (int i = 0; i < partialPage.size(); i++) {
			String output = partialPage.get(i).getText();
			System.out.println(output);
			if(output.equals("Address Book")) {
				System.out.println("Found");
				break;
			}
		}
		
		By xpath = By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterDescLine']//a");
			List<WebElement> findElements = driver.findElements(xpath);
			for (WebElement e : findElements) {
				String text = e.getText();
			
				System.out.println(text);
				
			}
			for (int i = 0; i < findElements.size(); i++) {
				String text = findElements.get(i).getText();
				
				if(text.contains("Woot!")){
				break;
				}
				System.out.println(text);
			}
		
			
		}

	}


