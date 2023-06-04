package org.dpw.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebWait_0605 {
static WebDriver driver;

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");

		// Prsence of Element Located
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement first = wait.until(ExpectedConditions.presenceOfElementLocated(firstName));
		first.sendKeys("First name as");

		// Visibility of Element
		wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys("Last name again");
		List<WebElement> completeList = driver.findElements(By.xpath("//div[@class='list-group']/a"));

		// multiple Elements
		List<WebElement> comlpleteListOne = wait.until(ExpectedConditions.visibilityOfAllElements(completeList));
		System.out.println(comlpleteListOne.size());
		// Alert Box
		driver.navigate().to("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		By alertBox1 = By.id("alertexamples");
		driver.findElement(alertBox1).click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();

		// Title Contains
		Boolean until = wait.until(ExpectedConditions.titleContains("Page For JavaScript"));
		System.out.println(until);

		// Alert -- Interface

		// driver.switchTo().alert();
		
		// Frame
		// driver.switchTo().frame(); // frame name , frame index , frame element
		        // driver.switchTo().parentFrame();
				// driver.switchTo().defaultContent();
		
		// Select -- Class
		// Select select = new Select(WebElement);
		Select select = new Select(first);
		
		// Window
		// driver.switchTo.window();
		driver.switchTo().window(null)
		driver.switchTo().parentFrame()
		driver.switchTo().defaultContent()
		

		//Js
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	
	
	

}
