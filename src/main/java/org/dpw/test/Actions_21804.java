package org.dpw.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_21804 {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		Actions action = new Actions(driver);

		// Move 2 Elemenmt
		// action.moveToElement(null);

		// drag and drop
		// action.dragAndDrop(null, null);

		// click and old
		// action.clickAndHold(null);

		// Rigt Click
		// action.contextClick(null);

//		driver.get("https://demoqa.com/droppable");
//		WebElement click = driver.findElement(By.id("droppableExample-tab-accept"));
//		click.click();
//		
//		WebElement source = driver.findElement(By.xpath("//div[text()='Acceptable']"));
//		WebElement destination = driver.findElement(By.id("droppable"));
//		action.dragAndDrop(source, destination).build().perform();

		driver.get(
				"https://www.bigbasket.com/?utm_source=google&gclid=EAIaIQobChMI86rN9-LM_gIVPZpmAh15kAThEAAYASAAEgIm9vD_BwE&utm_campaign=Brand-T2&utm_medium=cpc");
		WebElement parentElement = driver.findElement(By.xpath("//a[contains(text(),'Category')]"));
		action.moveToElement(parentElement).build().perform();
		

	}
	
	
	
	
	

	
}


