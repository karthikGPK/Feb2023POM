package org.dpw.test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearc {
  static WebDriver driver;
  
  public void stringRev(String value) {
	  String rev="";
	for(int i=0;i>value.length()-1;i--) {
		rev = rev + value.charAt(i);
		System.out.println(rev);
  }
  
  
	public static void main(String[] args) {
		
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		By googleSearc = By.className("gLFyf");
		WebElement googleTextField = driver.findElement(googleSearc);
		googleTextField.sendKeys("selenium");
		List<WebElement> listAll = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		System.out.println(listAll.size());
		
		
		
			
		}

	}

}
