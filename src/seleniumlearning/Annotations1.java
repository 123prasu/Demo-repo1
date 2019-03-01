package seleniumlearning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations1 {

	public WebDriver driver;
	
	
	/*@Parameters("myBrowser")
/*	@BeforeClass
	public void tc1(String myBrowser){
		/*if(myBrowser.equalsIgnoreCase("firefox")){
			
		System.setProperty("webdriver.gecko.driver", "D:/JARS/geckodriver.exe");
			
			 new FirefoxDriver();
			//driver.get("https://www.google.co.in");
			
}
		 if(myBrowser.equalsIgnoreCase("chrome")){
	
	System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
	 new ChromeDriver();
	 driver.get("https://www.google.co.in");
	}
		
	}*/
	@Test
	public void tc4(){
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
		 new ChromeDriver();
		 System.out.println("after browser lanuch");
		driver.get("https://webmail.netzero.net");
		 System.out.println("after url");
		//driver.findElement(By.name("q")).sendKeys("java for selenium");
	}
	
	
	
}
