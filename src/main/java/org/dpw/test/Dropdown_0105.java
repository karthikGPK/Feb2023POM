package org.dpw.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown_0105 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.xpath("(//span[@class='comboTreeArrowBtnImg'])[1]")).click();
		
		List<WebElement> completeList = driver.findElements(By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//span[@class='comboTreeItemTitle']"));
		System.out.println(completeList.size());
		
		for (WebElement e : completeList) {
			String text = e.getText();
			if(text.equals("choice 2 2")){
				e.click();
				break;
			}
			
		}

	}

}
