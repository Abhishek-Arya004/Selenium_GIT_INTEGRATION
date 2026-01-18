package ChromaCampus.ProjectSeleniumDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
import org.openqa.selenium.*;


public class App {
    public static void main(String[] args) throws IOException {
    	
	WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		//File scrFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		
		//FileUtils.copyFile(scrFile1, new File("./screenimage.jpg"));
		
		
		// driver.close();

		// https://www.selenium.dev/selenium/web/web-form.html

	     driver.get("https://www.selenium.dev/selenium/web/web-form.html");

	     WebElement element = driver.findElement(By.name("my-colors"));
	     
	     
	     File scrFile2 = element.getScreenshotAs(OutputType.FILE);
	     
	     
		 FileUtils.copyFile(scrFile2, new File("./colorpicker.png"));
		 
		 driver.close();
        
    }
}
