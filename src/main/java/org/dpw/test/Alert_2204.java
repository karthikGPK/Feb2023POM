package org.dpw.test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_2204 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
//
//		//driver.findElement(By.id("alertexamples")).click();
//		
//		Thread.sleep(10000);
//		//alert.accept();
//		
//		WebElement findElement = driver.findElement(By.id("confirmexample"));
//		findElement.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(10000);
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.dismiss();
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/lucknow-super-giants-vs-gujarat-titans-30th-match-1359504/live-cricket-score");
	List<WebElement> lists = driver.findElements(By.xpath("(//span[text()='Ravi Bishnoi'])[1]//ancestor::td//following-sibling::td"));
	for (WebElement e : lists) {
		String text = e.getText();
		System.out.println(text);
		
	}
		

		
		

	}

}
