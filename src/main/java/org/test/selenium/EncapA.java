package org.test.selenium;

import org.openqa.selenium.WebDriver;

public abstract class EncapA {

	int a = 20;
	WebDriver driver;
	String b = "data";
	
	public EncapA() {
		this("data");
		System.out.println("Default Constructor");
	}
	
	public EncapA(String value) {
		System.out.println("EncapA Param");
	}
	
	public void quotes() {
		System.out.println("Quotes M");
	}
	
	public void sipmentsData() {
		System.out.println("Sipments Data");
	}
	
	
}
