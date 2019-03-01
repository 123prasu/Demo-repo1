package seleniumlearning;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailAuto {

	public static void main(String[] args) {
	
		//Automating gmail application using selenium web driver
		//For launching the chrome browser required system property 
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
		
		//to launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//it will waits the browser until element visible
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		//maximize the browser
		driver.manage().window().maximize();
		
		
		//entering the google url using driver object
		driver.get("https://www.google.com/");
		
		//Entering gmail in google search 
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("gmail");
		
		//using keyboard api clicking on enter button
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys(Keys.ENTER);
		
		//clicking on gmail link option
		
		driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div.rc > div.r > a")).click();
		
		//identifying the profile or using the new profile using profile id 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profileIdentifier")));
		driver.findElement(By.id("profileIdentifier")).click();
		
		driver.findElement(By.xpath("//*[@id='identifierLink']/div[2]/p")).click();
		

	}

}
