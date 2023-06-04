package org.dpw.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame_2504 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
//		System.out.println(driver.getTitle());
//
//		driver.switchTo().frame("globalSqa");
//		WebElement courseContent = driver.findElement(By.id("s"));
//		courseContent.sendKeys("Testing is required for IFrame");
//		driver.switchTo().frame("google_esf");
//		//driver.switchTo().parentFrame();
//		WebElement alertBox = driver.findElement(By.xpath("(//span[text()='AlertBox'])[2]"));
//		alertBox.click();
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		for(int i=0;i<=list.size()-1;i++) {
			WebElement webElement = list.get(i);
			String text = webElement.getAttribute("name");
			System.out.println(text);
		}
	}

}
