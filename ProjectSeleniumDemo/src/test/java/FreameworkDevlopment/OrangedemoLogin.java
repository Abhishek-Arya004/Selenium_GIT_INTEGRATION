package FreameworkDevlopment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utilities.ReadingConfigValues;

public class OrangedemoLogin {

	WebDriver driver;
	
	ReadingConfigValues config ;

	@BeforeSuite

	void setup() {

		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	void loginValidation() {
		
		
		config	= new ReadingConfigValues();

		driver.get(config.getURL());

		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofMillis(5000));

		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));

		username.sendKeys(config.getUsername());
		password.sendKeys(config.getPassword());

		loginbutton.click();

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");// validation

	}

	@Test(priority = 2)
	void dashboardValidation() {

		// Explicit wait

		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement dashboard = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));

		String dashboardText = dashboard.getText();

		Assert.assertEquals(dashboardText, "Dashboard");// validation-->true

	}

	@AfterSuite

	void teardown() {

		driver.quit();
	}

}
