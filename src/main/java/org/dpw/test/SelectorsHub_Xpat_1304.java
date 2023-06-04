package org.dpw.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SelectorsHub_Xpat_1304 {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
	    FirefoxOptions fo = new FirefoxOptions();
	    fo.addArguments("--private");
	    WebDriver driver = new FirefoxDriver(fo);
driver.get("https://selectorshub.com/xpath-practice-page/");


// Xpat

//Single Attribute
//1 - //input[@title='Email']

//Multiple attributes
//2 //input[@title='Email' and @autocomplete='anyrandomstring']

//Text function
//3 //button[text()='Checkout here']

// Contains - attribute,value
//input[contains(@class,'nam')]

// Contains - Multiple attribute
//input[contains(@class,'nam') and contains(@name,'test')]

// Contains - wit text : can be used for long para
//span[contains(text(),'automate')]

// Contains - First Attribute w/o contains and second wit contain
//span[@style='color: #4e2424;' and contains(text(),'automate')]

//conatins -- First wit text contains and second w/o text
//a[contains(text(),'Testing Daily in your browser') and  contains(@href,'chrome.google.com/webstore/detail/testing')]

//Starts wit --
// Indexing and Postion


	}

}
