package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration_Page {

	WebDriver driver;
	
	public Registration_Page(WebDriver driver){
		
		
		this.driver = driver;
		
		
	}
	

	By fname = By.name("firstName");
	By lname = By.name("lastName");
	By phone = By.name("phone");

	By email = By.name("userName");

	By username = By.id("email");
	By password = By.name("password");
	By confirmPassword = By.name("confirmPassword");
	By submit = By.name("submit");

	public void fname(String firstname) {

		driver.findElement(fname).sendKeys(firstname);

	}

	public void lname(String lastname) {

		driver.findElement(lname).sendKeys(lastname);

	}

	public void phonenumber(String phone) {

		driver.findElement(lname).sendKeys(phone);

	}

	public 	void email(String Email) {

		driver.findElement(email).sendKeys(Email);

	}

	public 	void username(String uname) {

		driver.findElement(username).sendKeys(uname);

	}

	public void userpass(String pass) {

		driver.findElement(password).sendKeys(pass);

	}

	public void confirmpass(String confpass) {

		driver.findElement(confirmPassword).sendKeys(confpass);

	}

	public void submit() {

		driver.findElement(submit).click();

	}

}
