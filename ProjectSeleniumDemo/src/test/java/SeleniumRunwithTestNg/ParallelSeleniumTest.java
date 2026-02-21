package SeleniumRunwithTestNg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelSeleniumTest {
	
	
	
	@BeforeMethod
	void setup() {
		
		
		DriverManager.setDriver();
	}
	
	@Test
	void testMethod1() {
	
		WebDriver driver = DriverManager.getDriver();
		
		driver.get("https://www.selenium.dev/");
		System.out.println("Title of Method1: " + driver.getTitle() + " | Thread ID: " + Thread.currentThread().getId());
		
	}
	
	@Test
	void testMethod2() {
		
		
		WebDriver driver = DriverManager.getDriver();
		
		driver.get("https://learnpitch.com/");
		System.out.println("Title of Method2: " + driver.getTitle() + " | Thread ID: " + Thread.currentThread().getId());
	}
	
	
	@AfterMethod
	void tearDown() {
		
		DriverManager.quitDriver();
	}

}
