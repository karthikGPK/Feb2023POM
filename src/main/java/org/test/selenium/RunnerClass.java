package org.test.selenium;

public class RunnerClass {

	public static void main(String[] args) {
		
		WebDrive dri = new CromeDriver(); // Top Casting
		dri.FindElement();
		dri.FindElements();
		dri.getURL("https://staging-runner.cargoes.com/");
		dri.getTitle();
		dri.quit();
		dri.close();

	}

}
