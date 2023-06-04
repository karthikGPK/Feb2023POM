package org.dpw.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpa_2304 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(10000);
		List<WebElement> indiaList = driver.findElements(By.xpath("//td[text()='India']/parent::tr//input[@type='checkbox']"));
		for (WebElement e : indiaList) {
			e.click();
			
		}
		
		//*[@id="resultTable"]/tbody/tr[1]/td[2]/a
		//*[@id="resultTable"]/tbody/tr[2]/td[2]/a
		

	}

}
