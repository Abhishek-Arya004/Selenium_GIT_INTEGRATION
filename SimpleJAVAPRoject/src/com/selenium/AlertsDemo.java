package com.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");

		// alert
//		WebElement alert1 = driver.findElement(By.id("alert"));
//		
//		alert1.click();
//		
//		
//		 Alert alt = driver.switchTo().alert();
//		 
//		 Thread.sleep(5000);
//		 
//		 alt.accept();

		// prompt

//		driver.findElement(By.id("prompt")).click();
//
//		Alert prompt = driver.switchTo().alert();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//
//		wait.until(ExpectedConditions.alertIsPresent());
//
//		prompt.sendKeys("For testing only");
//
//		Thread.sleep(5000);
//
//		prompt.accept();

		// test confirm

//		driver.findElement(By.linkText("test confirm")).click();
//
//		Alert textconfirmation = driver.switchTo().alert();
//
//		Thread.sleep(5000);
//
//		textconfirmation.dismiss();
		
		
		
		 driver.findElement(By.id("double-prompt")).click();
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

	     wait.until(ExpectedConditions.alertIsPresent());

	     Alert alert1 = driver.switchTo().alert();
	     
	  

	     alert1.sendKeys("first");
	     alert1.accept();
	     
	     Thread.sleep(2000);


	     Alert alert2 = driver.switchTo().alert();

	     alert2.sendKeys("second");
	     alert2.accept();


	}

}
