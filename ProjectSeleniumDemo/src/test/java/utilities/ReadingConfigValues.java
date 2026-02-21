package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadingConfigValues {

	Properties p;

	public ReadingConfigValues() {

		// loading properties file with file location
		File s = new File("./configuration/config1.properties");

		try {

			// getting the key value pair
			FileInputStream fileInputStream = new FileInputStream(s);

			// create object of properties class
			p = new Properties();
			p.load(fileInputStream);
		}

		catch (Exception e) {
			System.out.println("Exception encountered: " + e);
		}
	}

	public String getURL() {

		// get URL from .properties file
		String url = p.getProperty("url");
		return url;
	}

	public String getBrowser() {

		// get browser from .properties file
		String browser = p.getProperty("browser");
		return browser;
	}

	public String getUsername() {

		// get username from .properties file
		String username = p.getProperty("username");
		return username;
	}

	public String getPassword() {

		// get password from .properties file
		String password = p.getProperty("password");
		return password;
	}
}
