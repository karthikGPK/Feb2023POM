package org.dpw.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_0305 {

	public static void main(String[] args) {
		
		
		//Wait - Interface
		// Fluent Wait -- Class
		//WebDriver wait - class
		
		
		//*[@id="post-body-5867683659713562481"]/div[1]/div[4]/table/tbody/tr[2]/td[1]
		//*[@id="post-body-5867683659713562481"]/div[1]/div[4]/table/tbody/tr[3]/td[1]
		
		WebDriver driver = new FirefoxDriver();
		driver.get("");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.pres)
		
		
		driver.manage().window().implictlywait(Duration.ofSeconds(10));

		
	
	}

}

