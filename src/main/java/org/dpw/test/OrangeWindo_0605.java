package org.dpw.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeWindo_0605 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://staging-runner.cargoes.com/Account/Login/?ReturnUrl=%2F");
		
		Thread.sleep(20000);
		WebElement termsof = driver.findElement(By.xpath("//a[text()='Terms Of Service']"));
		termsof.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		Iterator<String> iterator = windowHandles.iterator();
		String firstWindow = iterator.next();
		String secondWindow = iterator.next();
		driver.switchTo().window(secondWindow);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(firstWindow);
		System.out.println(driver.getTitle());
		

	}

}
