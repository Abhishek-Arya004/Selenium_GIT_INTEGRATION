package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		driver.manage().window().maximize();

		// Navigate to Url
		driver.get("https://www.selenium.dev/selenium/web/iframes.html");

		// switch To IFrame using Web Element

		WebElement iframe = driver.findElement(By.id("iframe1"));
		// Switch to the frame
	 	driver.switchTo().frame(iframe);

		// assertEquals(true, driver.getPageSource().contains("We Leave From Here"));
		// Now we can type text into email field

		WebElement emailE = driver.findElement(By.id("email"));

		emailE.sendKeys("admin@selenium.dev");

		//emailE.clear();

		driver.switchTo().defaultContent();// default

	}

}
