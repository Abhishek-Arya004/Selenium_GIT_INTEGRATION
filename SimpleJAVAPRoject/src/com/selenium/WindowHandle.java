package com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		// Navigate to Url
		driver.get("https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html");

		// fetch handle of this
		String currHandle = driver.getWindowHandle();

		System.out.println(currHandle);

		// click on link to open a new window
		driver.findElement(By.linkText("Open new window")).click();

		// fetch handles of all windows, there will be two, [0]- default, [1] - new
		// window
		Object[] windowHandles = driver.getWindowHandles().toArray();

		System.out.println(windowHandles[0] + " " + windowHandles[1]);

		driver.switchTo().window((String) windowHandles[1]);

		String message = driver.findElement(By.xpath("/html/body/div")).getText();

		System.out.println(message);

		// assert on title of new window
		 String title1=driver.getTitle();

		 System.out.println(title1);

		// closing current window
		 driver.close();
		 
		 
		// Switch back to the old tab or window
		 driver.switchTo().window((String) windowHandles[0]);
		 
		 String title0=driver.getTitle();

		 System.out.println(title0);

		// Opens a new tab and switches to new tab
		 driver.switchTo().newWindow(WindowType.TAB);

		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html");

		
	

		// quitting driver
		driver.quit(); //close all windows

	}

}
