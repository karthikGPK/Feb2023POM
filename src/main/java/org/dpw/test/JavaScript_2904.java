package org.dpw.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript_2904 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");

		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Title
		//Inner Text
		// Refresh, back, forward
		//Alert
		//confirm alert
		//Prompt Alert
		//Vertical Scrolling
		//Horizontal Scrolling
		//Zoom in - Edge and Firefox
		//Flash
		// Draw the border
		//

		
		// Title : Return --> Striung --> toString --
		String titleName = js.executeScript("return document.title").toString();
		System.out.println(titleName);
		
		js.executeScript("history.go(1)");
		
		//alert -- Format
		
		//js.executeScript("alert('Message')");
		 //confirm alert
		//js.executeScript("confirm('YES')");
		  // Prompt Alert
		//js.executeScript("prompt('NOOO')");
		
		// Inner Text
		String innerText = js.executeScript("return document.documentElement.innerText").toString();
		System.out.println(innerText);
		
		// ref forward // back
		js.executeScript("history.go(1)");
		
		//document.body.scrollHeight - Append is more important in Utility
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // complete page down
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)"); // complete page UP
		js.executeScript("window.scrollTo(0,document.body.scrollHeight/2)"); // scroll down to middle of page
		
		// orizontal scrolling
		js.executeScript("window.scrollBy('100,100')");
		
		// scrollTo
		//scrollBy
		//scrollIntoView 
		
		
		
		

	}

}
