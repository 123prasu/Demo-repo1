package memdesk;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod()
	@Parameters({"browser"})
	public void setUp(String browser){

		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","D:/geckodriver-v0.20.1-win64/mozilladriver/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://google.co.in/");

		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://google.co.in/");
		}



		//int i = 9/0;
	}

	@Test()
	public void title(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google","String is matched");
		int i = 9/0;
	}

	@Test()

	public void verify(){
		boolean q = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(q);
	}
	
	@AfterMethod
	public void end(){
		driver.quit();
	}


}
