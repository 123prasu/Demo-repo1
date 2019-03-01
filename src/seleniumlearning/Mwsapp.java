package seleniumlearning;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mwsapp {
	
	static WebDriver driver;
	String BaseUrl = "";
	
	@BeforeTest
	
	
	
	public void UrlLoad() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(9000);
		BaseUrl = "http://signup.mysitebeta.com";
		driver.get(BaseUrl);
		}
	
	
	@Test
	
	public void BetaSignup() throws InterruptedException{
		
		Date dd = new Date();
		long date = dd.getTime();
		
		driver.findElement(By.id("free_subdomain_field")).sendKeys("jfaux-prasanna"+date);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='maintable']/div[3]/table/tbody/tr/td/input")).click();
		Thread.sleep(2000);
		
		List<WebElement> radios = driver.findElements(By.xpath("//*[@type='radio'and@name='account_type']"));
		for(int i=0;i<radios.size();i++){
			
			WebElement radio1 = radios.get(i);
			
			String check = radio1.getAttribute("value");
			if(check.equalsIgnoreCase("dphost06400")){
				radio1.click();
			}
		}
		
Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='maintable']/div[2]/div[2]/form/table[2]/tbody/tr/td[2]/input[2]")).click();
		 Thread.sleep(5000);
	        
		 new Select(driver.findElement(By.xpath("//*[@id='cc_dynamo']/div/table/tbody/tr/td/table/tbody/tr[1]/td[2]/select"))).selectByValue("master_card");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id='cc_dynamo']/div/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).sendKeys("5595552798460564");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id='cc_dynamo']/div/table/tbody/tr/td/table/tbody/tr[3]/td[2]/input")).sendKeys("895");
		 Thread.sleep(2000);
		 
		 new Select(driver.findElement(By.xpath("//*[@id='cc_dynamo']/div/table/tbody/tr/td/table/tbody/tr[4]/td[2]/select[1]"))).selectByValue("01");
		 
		 Thread.sleep(2000);
		 
		 new Select(driver.findElement(By.xpath("//*[@id='cc_dynamo']/div/table/tbody/tr/td/table/tbody/tr[4]/td[2]/select[2]"))).selectByValue("2023");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id='maintable']/form/div[3]/div[3]/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")).sendKeys("prasannakumar");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.name("billing_last_name")).sendKeys("Desireddy");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.name("billing_organizational_name")).sendKeys("MRM");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.name("billing_address")).sendKeys("512-25 ,Newyork, USA");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.name("billing_city")).sendKeys("Newyork");
		 
		 Thread.sleep(1000);
		 
		 new Select(driver.findElement(By.xpath("//*[@id='maintable']/form/div[3]/div[3]/table/tbody/tr[2]/td/table/tbody/tr[7]/td[2]/select"))).selectByValue("NY");
		 
		 Thread.sleep(1000);
		 
		 new Select(driver.findElement(By.xpath("//*[@id='maintable']/form/div[3]/div[3]/table/tbody/tr[2]/td/table/tbody/tr[8]/td[2]/select"))).selectByValue("US");
		 
		 Thread.sleep(1000);

		 driver.findElement(By.name("billing_zip_code")).sendKeys("10011");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.name("email")).sendKeys("pdesire@corp.untd.com");
		 
		 Thread.sleep(1000);
		// driver.findElement(By.xpath("//*[@id='maintable']/form/div[3]/div[3]/table/tbody/tr[2]/td/table/tbody/tr[11]/td[2]/font/input")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.name("billing_phone")).sendKeys("81828730005");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.name("password")).sendKeys("Test123");
		 Thread.sleep(1000);
		 driver.findElement(By.name("verify_password")).sendKeys("Test123");
		 
		 Thread.sleep(1000);
		 driver.findElement(By.name("agree")).click();
		 
		 Thread.sleep(1000);
	
		 driver.findElement(By.id("recaptcha-anchor")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id='maintable']/form/div[6]/table/tbody/tr/td/input[2]")).click();
		 
		 Thread.sleep(3000);
		 
			}
		
		
		
	}
	
	
