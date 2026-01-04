package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.toolsqa.com/selenium-webdriver/advance-webdriver-waits/");
		 
		  driver.navigate().to("https://selenium.dev");
		  
		  driver.navigate().back();
		  
		  driver.navigate().forward();
		  
		  driver.navigate().refresh();

	}

}
