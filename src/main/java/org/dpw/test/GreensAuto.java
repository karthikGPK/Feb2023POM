package org.dpw.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class GreensAuto {

	public static void main(String[] args) {

		BrowserLibrary br = new BrowserLibrary();
		WebDriver driver = br.driver("firefox");
		br.getDriver("http://greenstech.in/selenium-course-content.html");
		String title = br.getTitle();
		System.out.println(title);
		
		
		

		Locators l = new Locators(driver);
		By courses = By.className("header-browse-greens");
		l.doClick(courses);

		By coursesMenu = By.xpath("//div[@id='browse_courses-greens']//div/span[1]");
		int doGetElementsCount = l.doGetElementsCount(coursesMenu);
		System.out.println(doGetElementsCount);

		List<WebElement> coursesElements = l.getFindElements(coursesMenu);
		List<String> finalO = new ArrayList<String>();
		System.out.println(finalO.size());
		for (WebElement e : coursesElements) {
			String text = e.getText();
			finalO.add(text);

		}
		System.out.println(finalO);

	}

}
