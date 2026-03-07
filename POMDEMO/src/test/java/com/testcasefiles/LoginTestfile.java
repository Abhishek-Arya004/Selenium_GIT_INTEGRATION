package com.testcasefiles;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Objectfiles.LoginObjects;

import org.openqa.selenium.WebDriver;

public class LoginTestfile {

	WebDriver driver;

	@BeforeTest
	void setup() {

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofMillis(2000));

	}

	@Test
	void login() {

		LoginObjects login = new LoginObjects(driver);

		login.getUsername_X("Admin");
		login.getPassword_X("admin123");
		login.getSubmit_X();

	}

}
