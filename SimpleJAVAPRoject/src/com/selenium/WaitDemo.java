package com.selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");

		WebElement reveal = driver.findElement(By.id("reveal"));

		reveal.click();

		// implicit wait --> it will apply to all the elements of the page

		// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
		
		//Explicit wait
		

		// WebElement revealedbox = driver.findElement(By.id("revealed"));

		// Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		// wait.until(d -> revealedbox.isDisplayed());
		
		
		//explicit wait

	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

	//	WebElement revealedbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed")));

	//	revealedbox.sendKeys("Abhishek");

		// Explicit wait--- will wait specific element
		
		//fluent wait
		
		
		Wait<WebDriver> fluentwait = new FluentWait<>(driver)
				
				.withTimeout(Duration.ofSeconds(2))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		
		WebElement revealedbox = fluentwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed")));
		
		revealedbox.sendKeys("Abhishek");
		

	}

}
