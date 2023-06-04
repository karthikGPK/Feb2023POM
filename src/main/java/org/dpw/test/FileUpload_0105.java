package org.dpw.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload_0105 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
	WebElement findElement = driver.findElement(By.xpath("//input[@type='file']"));
	findElement.sendKeys("\"C:\\Users\\karthikeyan.P\\Downloads\\59064-Email Audit Log .xlsx\"");
	}

}
