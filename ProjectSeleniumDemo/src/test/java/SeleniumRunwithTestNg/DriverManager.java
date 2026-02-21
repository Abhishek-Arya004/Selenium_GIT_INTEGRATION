package SeleniumRunwithTestNg;

//ensure each thread has its own driver instance


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	
	
	
	
private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		
		return driver.get();
	}
	
	public static void setDriver() {
		
		
		driver.set(new ChromeDriver());

		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get().manage().window().maximize();
	}
	
	
	public static void quitDriver() {
		if (driver.get() != null) {
			driver.get().quit();
			driver.remove();
		}
	}
	

}
