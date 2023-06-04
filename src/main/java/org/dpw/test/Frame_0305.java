package org.dpw.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame_0305 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");

		WebElement newTab = driver.findElement(By.id("tabButton"));

		newTab.click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());

		Iterator<String> iterator = windowHandles.iterator();
		String parentWindow = iterator.next();
		System.out.println(parentWindow);

		String cWindow = iterator.next();
		System.out.println(cWindow);

		driver.switchTo().window(cWindow);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().newWindow(WindowType.TAB);

	}

}
