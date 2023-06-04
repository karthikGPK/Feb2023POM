package org.dpw.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_0105 {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Tab");
		driver.findElement(By.xpath("(//a[text()='Click Here'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		//
		Iterator<String> iterator = windowHandles.iterator();
		
		//
		String parent = iterator.next();
		System.out.println(parent);
		
		//
		String second = iterator.next();
		System.out.println(second);
		
		driver.switchTo().window(second);
		driver.close();
		driver.switchTo().window(parent);
		driver.quit();

	}

}
