package org.dpw.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class XPractise_2204 {

	public static void main(String[] args) {
		FirefoxOptions fo = new FirefoxOptions();
		WebDriver driver = new FirefoxDriver(fo);
		fo.addArguments("--private");
		//driver.get("https://www.amazon.com/");
		driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
		
		// Xpa
		// xpat - id
		    //input[@id='pass']
		//xpat -- multiple attributes using and
		     //input[@id='pass' and @title='Password']
		// xpat -- text
		     //label[text()='Password']
		// xpat -- text and id
		    //a[text()='Add this FREE plugin Testing Daily in your browser & be updated
		      //with Testing Trends' and @target='_blank']
		//xpat -- contains
		     //(//input[contains(@placeholder,'your mobile')])[1]
		//xpat -- conatins and w/o contains
		//xpat -- contains and text
		//xpat -- conatains text and w/o conatins text
		//xpat --
        // ancestors
		//parent
		//cilde
		//direct and indirect
		//
		
		//WebElement text = driver.findElement(By.xpath("//a[@class='nav_a' and text()='Amazon Music']"));
		//input[@id='pass' and @title='Password']
		

	}

}
