package org.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticAndNonStatic {

	int a;
	String b;
	public int c;
	public String d;
	public static int e = 10;
	public static String f = "name";
	 WebDriver driver;
	
	public void nonstatic() {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e); // can call directly 
		System.out.println(StaticAndNonStatic.e);
		System.out.println(StaticAndNonStatic.f);
		
		a=200;
		System.out.println(a);
		
		driver = new FirefoxDriver();
		
	}

	public static void main(String[] args) {
		
	
		
	}

}
