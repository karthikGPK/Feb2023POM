package org.dpw.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonFooter_1204 {
	
	

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		WebElement findElement = driver.findElement
				(By.xpath("(//table[@class='navFooterMoreOnAmazon']//a[@class='nav_a'])[8]"));
		String text = findElement.getText();
		System.out.println(text);
		
//		driver.findElement(By.id(text));
//		driver.findElement(By.name(text));
//		driver.findElement(By.className(text))
//		driver.findElement(By.linkText(text))
//		driver.findElement(By.tagName(text))
		
		

	}

}
