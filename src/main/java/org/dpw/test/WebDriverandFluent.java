package org.dpw.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverandFluent {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(500));
				
				Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
						.withTimeout(null)
						.ignoring(null)
						.withMessage("data")
						.pollingEvery(Duration.ofMinutes(10))
						.ignoreAll(null);
				wait2.until(ExpectedConditions.)
						
				

	}

}
