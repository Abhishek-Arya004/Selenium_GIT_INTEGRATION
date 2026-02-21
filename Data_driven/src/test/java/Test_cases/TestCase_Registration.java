package Test_cases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objects.Registration_Page;
import objects.Registration_page_PageFactory;

public class TestCase_Registration {
	
	WebDriver driver ;

	
	@BeforeTest

	void setUp() {

		 driver = new SafariDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();

	}

	@Test

	void registration() {

		//Registration_Page rg = new Registration_Page(driver);
		
		Registration_page_PageFactory rg = new	Registration_page_PageFactory(driver);

		rg.fname("Abbhishek");                            
		rg.lname("Arya");
		rg.phonenumber("12121212");
		rg.email("test@gmail.com");
		rg.username("Arya");
		rg.userpass("123456");
		rg.confirmpass("123456");
		rg.submit();

	}

	//@AfterTest

	//void quit() throws InterruptedException {
		
	//	Thread.sleep(5000);

		//driver.quit();

	//}

}
