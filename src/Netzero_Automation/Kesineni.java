package Netzero_Automation;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
//import java.awt.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Kesineni {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://www.kesinenitravels.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("source")).sendKeys("Hyderabad");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("destination")).sendKeys("Vijayawada");
		System.out.println("destination also selected please go with date of journey");
		Thread.sleep(1000);
		
		
		//it will click the calendar
		driver.findElement(By.id("datepicker")).click();
		
		//
		
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[6]")).click();;
		
		 
		 
		 
		 
		 
		driver.findElement(By.xpath("/html/body/section/div[2]/div/div[1]/div[3]/form/button")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("checking the availabilty....!");
		
		System.out.println("alert text....!"+alert.getText());
		String actualText =  alert.getText();
		String exceptedText = "Please select the Source city";
		
		if(actualText.equalsIgnoreCase(exceptedText)){
			
			alert.accept();
		}
	}

}
