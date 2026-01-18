package com.selenium;import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.net.PortProber;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BaseTest {
	
	
	
	
    protected WebDriver driver;
	protected WebDriverWait wait;

	protected void startChromeDriver(ChromeOptions options) {
		driver = new ChromeDriver(options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	protected void startFirefoxDriver(FirefoxOptions options) {
		driver = new FirefoxDriver(options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	protected void startEdgeDriver(EdgeOptions options) {
		driver = new EdgeDriver(options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	
	protected static ChromeOptions getDefaultChromeOptions() {
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--no-sandbox");
	    return options;
	  }


	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
