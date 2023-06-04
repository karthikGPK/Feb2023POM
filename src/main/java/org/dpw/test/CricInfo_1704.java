package org.dpw.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CricInfo_1704 { // Pick one player
static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		driver.get("https://www.espncricinfo.com/series/indian-premier-league"
				+ "-2023-1345038/gujarat-titans-vs-rajasthan-royals-23rd-match-1359497/full-scorecard");
		
		List<WebElement> playerInfo = driver.findElements(By.xpath("(//span[text()='Rashid Khan'])[1]/ancestor::tr/td"));
		for (WebElement e : playerInfo) {
			String text = e.getText();
			System.out.println(text);
			
		}

	}
	
	public static List<String> playerInfo1(String playerName) {
		List<WebElement> outputAll = driver.findElements(By.xpath("(//span[text()='Rashid Khan'])[1]/ancestor::tr/td"));
		List<String> data = new ArrayList<String>();
		for (WebElement e : outputAll) {
			String text = e.getText();
			data.add(text);
			
		}
		return data;
		
	}

}
