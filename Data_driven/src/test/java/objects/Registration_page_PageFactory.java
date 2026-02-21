package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_page_PageFactory {

	@FindBy(name = "firstName")

	private WebElement fname;

	@FindBy(name = "lastName")

	private WebElement lname;

	@FindBy(name = "phone")

	private WebElement phone;

	@FindBy(name = "userName")

	private WebElement email;

	@FindBy(id = "email")

	private WebElement username;

	@FindBy(name = "password")

	private WebElement password;

	@FindBy(name = "confirmPassword")

	private WebElement confirmPassword;

	@FindBy(name = "submit")

	private WebElement submit;

	public Registration_page_PageFactory(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void fname(String firstname) {

		fname.sendKeys(firstname);

	}

	public void lname(String lastname) {

		lname.sendKeys(lastname);

	}

	public void phonenumber(String phoneno) {

		phone.sendKeys(phoneno);

	}

	public void email(String Email) {

		email.sendKeys(Email);

	}

	public void username(String uname) {

		username.sendKeys(uname);

	}

	public void userpass(String pass) {

		password.sendKeys(pass);

	}

	public void confirmpass(String confpass) {

		confirmPassword.sendKeys(confpass);

	}

	public void submit() {

		submit.click();

	}

}
