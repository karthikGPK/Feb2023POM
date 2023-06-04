package org.test.selenium;

public class CromeDriver extends RemoteWebDrive {
	
	public void testCrome() {
		System.out.println("Crome Test");
	}
	
	public static void main(String[] args) {
	// Searc 
		// WebDriver
		//Remote Web --- Remote Web Deri
		
		
		
		
		//SearcContext sc = new CromeDriver();
//		sc.FindElement();
//		sc.FindElements();
		
		
		RemoteWebDrive rwd = new CromeDriver();
		rwd.FindElement();
		rwd.FindElements();
		rwd.getURL("null");
		
		CromeDriver cd = new CromeDriver();
	cd.FindElement();
	cd.FindElements();
	cd.getURL("nuu");
	
	
	WebDrive wd = new CromeDriver();
	wd.getURL(null);
		
	}

	
}
