package com.Objectfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginObjects {

WebDriver driver ;


public LoginObjects(WebDriver driver) {
	
	this.driver = driver;
	
}

//WebElement username = driver.findElement(By.id("username"));
//WebElement password = driver.findElement(By.id("password"));

	By Username_X = By.xpath("//input[@name='username']");

	By Password_X = By.xpath("//input[@name='password']");

	By Sumit_X = By.xpath("//button[@type='submit']");
	
	
	
	public void getUsername_X(String username) {
		driver.findElement(Username_X).sendKeys(username);
	}

	public void getPassword_X(String password) {
		driver.findElement(Password_X).sendKeys(password);
	}
	
	public void getSubmit_X() {
		driver.findElement(Sumit_X).click();
	}
	

}
