package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webformAutomation {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		

	//	WebDriver driver = new FirefoxDriver();
		
	//	WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		WebElement textbox1 = driver.findElement(By.xpath("//input[@id='my-text-id']"));
		
		textbox1.sendKeys("Abhishek");
		
         WebElement password = driver.findElement(By.xpath("//input[@name= \"my-password\"]"));
		
         password.sendKeys("123456"); 
		
		
		//input[@type= ‘password’]
		
		 WebElement testArea = driver.findElement(By.xpath("//textarea[@name=\"my-textarea\"]"));
			
		 testArea.sendKeys("this is text Area"); 
		
		
		//driver.close();
		
		//driver.quit();

	}

}
