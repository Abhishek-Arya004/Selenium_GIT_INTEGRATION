package com.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
import org.openqa.selenium.*;

public class ScreenshotandPrint {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		//File scrFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		
		//FileUtils.copyFile(scrFile1, new File("./screenimage.jpg"));
		
		
		// driver.close();

		// https://www.selenium.dev/selenium/web/web-form.html

	     driver.get("https://www.selenium.dev/selenium/web/web-form.html");

	     WebElement element = driver.findElement(By.name("my-colors"));
	     
	     
	     File scrFile2 = element.getScreenshotAs(OutputType.FILE);
	     
	     
		 FileUtils.copyFile(scrFile2, new File("./colorpicker.png"));
		 
		 driver.close();
//
//		// Creating the JavascriptExecutor interface object by Type casting
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		// Button Element
//		WebElement button = driver.findElement(By.cssSelector("body > main > div > form > div > div:nth-child(2) > button"));
//		// Executing JavaScript to click on element
//		js.executeScript("arguments[0].click();", button);
//		// Get return value from script
//		String text = (String) js.executeScript("return arguments[0].innerText", button);
//		// Executing JavaScript directly
//		js.executeScript("console.log('hello world')");

	}

}
