package org.test.selenium;

public class FirstCod {

	public static void main(String[] args) {
		
		CromeDriver driver = new CromeDriver(); // Object Creation
		driver.FindElement();
		driver.FindElements();
		driver.getURL("null");
		driver.getTitle();
		driver.quit();
		driver.close();   
		
		
		WebDrive dri = new CromeDriver(); // Top Casting
		dri.FindElement();
		dri.FindElements();
		dri.getURL("null");
		dri.getTitle();
		dri.quit();
		dri.close();   
		
		
		FireFox dr = new FireFox(); // Object Creation for firefox
		dr.FindElement(); 
		dr.FindElements();
		dr.getCurrentURL();
		dr.getTitle();
		
		
		
		
		
		

	}

}
