package seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWeb {

	public static void main(String[] args) {
		
		WebDriver ff = new FirefoxDriver();
		
		ff.get("https://www.google.com");
	}

}
