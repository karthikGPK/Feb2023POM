package org.dpw.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StagingQuotes_1304 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://staging-runner.cargoes.com/");
		Thread.sleep(10000);
		WebElement userName = driver.findElement(By.id("cargo-runner-username"));
		WebElement pwd = driver.findElement(By.id("cargo-runner-password"));
		userName.sendKeys("tomlee");
		pwd.sendKeys("Welcome@123");
		Thread.sleep(10000);
		driver.findElement(By.id("signInButtonId")).click();
		
		List<WebElement> referenceNo = driver.findElements(By.xpath("//div[text()='HIPL Test']"));
		System.out.println(referenceNo.size());
		for(int i=0;i<referenceNo.size();i++) {
			String text = referenceNo.get(i).getText();
			System.out.println(text);
		}
		
		
		////table[@id="resultTable"]/tbody/tr[1]/td[4]
		//*[@id="resultTable"]/tbody/tr[2]/td[4]

	}

}
