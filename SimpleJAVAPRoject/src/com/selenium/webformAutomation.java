package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class webformAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		// WebDriver driver = new FirefoxDriver();

		// WebDriver driver = new EdgeDriver();

		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		WebElement textbox1 = driver.findElement(By.xpath("//input[@id='my-text-id']"));

		textbox1.sendKeys("Abhishek");

		WebElement password = driver.findElement(By.xpath("//input[@name= \"my-password\"]"));

		password.sendKeys("123456");

		// input[@type= ‘password’]

		WebElement testArea = driver.findElement(By.xpath("//textarea[@name=\"my-textarea\"]"));

		testArea.sendKeys("this is text Area");
		
		//drop down

		WebElement dropdown_select = driver.findElement(By.name("my-select"));

		Select select = new Select(dropdown_select);// create an object from your select class

		select.selectByIndex(3);
		
		

		WebElement dropdown_datalist = driver
				.findElement(By.name("my-datalist"));

		dropdown_datalist.sendKeys("San Francisco");

		WebElement fileupload = driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/label[3]/input"));

		fileupload.sendKeys("/Users/abhishekkumararya/Downloads/XPath Secrets Every Tester Misses.pdf");

		WebElement checkbox = driver.findElement(By.cssSelector("#my-check-1"));

		checkbox.click();

		WebElement radiobox = driver.findElement(
				By.cssSelector("body > main > div > form > div > div:nth-child(2) > div:nth-child(5) > label"));

		radiobox.click();

		WebElement colourpicker = driver.findElement(
				By.cssSelector("body > main > div > form > div > div:nth-child(3) > label:nth-child(1) > input"));

		colourpicker.sendKeys("#563d7c");

		WebElement datepicker = driver.findElement(By.name("my-date"));

		datepicker.sendKeys("12/12/2025");
		
	

		WebElement rangeSlider = driver.findElement(By.name("my-range"));
		
		//rangeSlider.click();

		// range.

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value = arguments[1];", rangeSlider, "8");
		
		
		//through action class 
		
	//	Actions action = new Actions(driver);
		
	//	action.clickAndHold(rangeSlider).moveByOffset(100, 0).release().perform();

		WebElement submit = driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/button"));

		submit.click();

		driver.close(); // will close all browser windows

		driver.quit();// close the all sessions including browser window

	}

}
