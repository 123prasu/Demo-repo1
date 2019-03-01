package Netzero_Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//import java.lang.Exception;
import org.openqa.selenium.WebDriverException;

//web page automation with web driver controllers
public class Windw{

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("chrome browser opened vth new window");
	
	driver.get("http://softwaretesting-guru.blogspot.com/p/main-page.html");
	Thread.sleep(2000);   
	driver.findElement(By.linkText("Selenium Practice page")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.name("Name")).sendKeys("testing");
	Thread.sleep(1000);
	driver.findElement(By.name("subscribe")).click();
driver.findElement(By.xpath("//*[@id='sampleform']/table/tbody/tr[3]/td/textarea")).sendKeys("testing vth test page");
	Thread.sleep(2000);
	System.out.println("selecting the country");
	new Select(driver.findElement(By.name("countries"))).selectByVisibleText("Albania");
	Thread.sleep(1000);
	System.out.println("selecting the computer brand");
	new Select(driver.findElement(By.xpath("//*[@id='sampleform']/table/tbody/tr[5]/td/select"))).selectByValue("HP");
	
	Thread.sleep(1000);
	driver.findElement(By.name("pwd")).sendKeys("testing");
	Thread.sleep(1000);
	System.out.println("selecting the rating");
	driver.findElement(By.xpath("//*[@id='sampleform']/table/tbody/tr[7]/td/input[2]")).click();
	Thread.sleep(1000);
	
	driver.close();
}
	
}

