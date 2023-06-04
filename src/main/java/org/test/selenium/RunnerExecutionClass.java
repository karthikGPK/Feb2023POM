package org.test.selenium;

public class RunnerExecutionClass {

	public static void main(String[] args) {
		
		
		LibraryClass lc = new LibraryClass();
		lc.firstStep("firefox");
		
		lc.getURL("https://qa-runner.cargoes.com/");
		lc.getTitle();
		lc.currentURL();
		
		
		
				
		
		

	}

}
