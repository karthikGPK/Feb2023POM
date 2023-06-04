package org.dpw.test;

import org.openqa.selenium.WebDriver;

public absclass Encap {
	
	WebDriver driver;
	int a;
	String data;
	
	public Encap() {
		System.out.println("Default");
	}

	public Encap(WebDriver driver, int a, String data) {
		
		this.driver = driver;
		this.a = a;
		this.data = data;
		System.out.println(this.driver + " " + this.a + " " + this.data);
		
	}
	
	public void test() {
		System.out.println(this.driver + " " + this.a + " " + this.data);
	}
	public static void main(String[] args) {
		Encap e = new Encap();
		
		
		System.out.println(e.driver);
		System.out.println(e.a);
		System.out.println(e.data);
	e.test();
	}
	
	
	

}
