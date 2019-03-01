package datadriven;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

public class NetzeroReg {
	public WebDriver driver;

	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://store.qa7.netzero.net/?cf=sp");

	}
	@AfterMethod
	public void quit(){
		driver.quit();
	}
	
	/*public Objects[][] passData(){
		Object[][] data = new Object[3][2];
		data[0][0] = "prasanna";
				
	}*/

	@Test
	public void regstration(String firstname,String lastname,String city,String Email) throws Exception{

		System.out.println( driver.getTitle());

		/*---ordering new megamail account ---*/
		System.out.println("purchasing a new meagamail account");

		driver.findElement(By.xpath("//*[@id='serviceList']/a[14]/section/div[3]/button")).click();
		Thread.sleep(2000);

		List<WebElement> radios = driver.findElements(By.xpath("//*[@type='radio'and@name='offerId']"));
		for (int i = 0; i < radios.size(); i++) {

			WebElement radio1 = radios.get(i);

			String check = radio1.getAttribute("value");
			if (check.equalsIgnoreCase("1")) {
				radio1.click();
			}
		}


		driver.findElement(By.id("realButton")).click();

		System.out.println("****filling the registartion details****");
		Thread.sleep(1500);
		driver.findElement(By.id("firstName")).sendKeys(firstname);
		Thread.sleep(200);
		driver.findElement(By.id("lastName")).sendKeys(lastname);
        Thread.sleep(200);
		driver.findElement(By.id("billingAddress.city")).sendKeys(city);
		Thread.sleep(200);
		driver.findElement(By.id("altEmailAddress")).sendKeys(Email);
		Thread.sleep(200);
		driver.quit();

	}
}
