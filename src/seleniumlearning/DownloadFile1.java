package seleniumlearning;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//adding system property for launching the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");	
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//maximizing the browser
		driver.manage().window().maximize();
		//Entering the URL 
		driver.get("https://www.google.com/");
		//type the text
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("java downlaod");
		//waiting the browser some time for to perform the next action
		Thread.sleep(2000);
		//using keyboard keys for enter
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//click the one of download able link
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div[1]/a/h3")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/a/span")).click();
		Thread.sleep(1000);
		
		//driver.switchTo().alert().accept();
		
		//for handling the windows based controls
		Robot robj = new Robot();
		
		robj.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robj.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		

	}

}
