package seleniumlearning;
import static org.testng.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import okhttp3.Cookie;
      
public class TestScript extends Exception {
	public static WebDriver driver=null;
	public String baseURL ="";
	@BeforeTest
    @Parameters("browser")
	
	
	public void setBaseURL(String browser) throws InterruptedException, IOException {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("your test cases are running in chrome browser");
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
			Thread.sleep(1000);
			baseURL = "https://webmail.netzero.net/?cf=sp";
			//driver.get(baseURL);
			driver.navigate().to(baseURL);
			// Thread.sleep(1000);
			
			// Assert.assertEquals("Test", "Test123");
			// driver.findElement(By.id("allowButton")).click();
			
			
		}
	
		}
	

	@Test
	public void test2() throws InterruptedException{
		
		/*driver.findElement(By.id("memberId")).sendKeys("nqatest_gvinay18");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("netzero123");
		
		Thread.sleep(800);
		driver.findElement(By.id("keepmesignedin")).click();
		
	     Thread.sleep(800);
	     
	     driver.findElement(By.id("signin")).click();*/

		
		
		System.out.println(driver.getTitle());
		System.out.println("checking the New registration test cases ");
		
		//assert.assertEquals("Test","Test123");

		driver.findElement(By.xpath("//*[@id='newaccount_button']")).click();
		Thread.sleep(2000);
		System.out.println("getting screenshot now");
		
        String parentWindow = driver.getWindowHandle();
		
		Set<String> childWindow = driver.getWindowHandles();
		
		ArrayList<String> tabs = new ArrayList<>(childWindow);
		driver.switchTo().window(tabs.get(1));
		
		System.out.println(driver.getTitle());
		
		System.out.println("switched to new registration tab from the main tab");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='servicesNav']/a/span")).click();
		Thread.sleep(2000);
		
		
		driver.switchTo().window(tabs.get(0));
		driver.close();
		
        Thread.sleep(2000);
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath("//*[@id='serviceList']/a[13]/section/div[3]/button")).click();
		
		
		driver.findElement(By.xpath("//*[@id='serviceList']/a[14]/section/div[3]/button")).click();
		Thread.sleep(2000);
		
		List<WebElement> radios = driver.findElements(By.xpath("//*[@type='radio'and@name='offerId']"));
		for(int i=0;i<radios.size();i++){
			
			WebElement radio1 = radios.get(i);
			
			String check = radio1.getAttribute("value");
			if(check.equalsIgnoreCase("1")){
				radio1.click();
			}
		}
		
		
		driver.findElement(By.id("realButton")).click();
		
		System.out.println("filling the registartion details");
		
		Thread.sleep(1500);
		
		new Select(driver.findElement(By.id("userTitle"))).selectByValue("TITLE_MR");
		Thread.sleep(200);
		
		driver.findElement(By.id("firstName")).sendKeys("Prasannakumar");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("Desireddy");
		Thread.sleep(200);
		driver.findElement(By.id("billingAddress.streetName")).sendKeys("77 9th ave");
		Thread.sleep(1800);
		
		//driver.findElement(By.id("billingAddress.aptNumber")).sendKeys("#25");
		
		driver.findElement(By.id("billingAddress.city")).sendKeys("Newyork");
		
		Thread.sleep(1500);
		new Select(driver.findElement(By.id("billingAddress.state"))).selectByValue("NY");
		
		driver.findElement(By.id("billingAddress.zip")).sendKeys("10011");
		
		driver.findElement(By.id("mobileNumberId")).sendKeys("8182873480");
		Thread.sleep(1000);
		
		driver.findElement(By.id("sendSMSBtn")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='pvcodeId']")).sendKeys(driver.manage().getCookieNamed("otp").getValue());
	        Thread.sleep(2000);
		System.out.println(driver.manage().getCookieNamed("otp").getValue());
		Thread.sleep(1500);
	     driver.findElement(By.id("checkCode")).click();
		
		driver.findElement(By.id("altEmailAddress")).sendKeys("pdesire@corp.untd.com");
		
		Thread.sleep(1500);
		//driver.findElement(By.xpath("//*[@id='order']/article/section[1]/div[13]/label/span")).click();
		driver.findElement(By.xpath("//*[@id='order']/article/section[1]/div[13]/label/span")).isSelected();
		
		//Thread.sleep(100);
		
		// Here we using the date class for sending the different member id's for every registration
		
		Date dd = new Date();
		long date = dd.getTime(); 
		
		WebElement test1 = driver.findElement(By.id("memberId"));
		
				  test1.sendKeys("jfaux-pdesire"+date);
				  
				  String tt = "jfaux-pdesire"+date;
				  
				  System.out.println(tt);
			Thread.sleep(1500);
		
		WebElement test =driver.findElement(By.xpath("//*[@id='order']/article/section[2]/div[4]/input"));
		
	            test.click();
	      
	         Thread.sleep(1500);
	         
	         driver.findElement(By.id("password")).sendKeys("netzero");
	         driver.findElement(By.id("formPassword2")).sendKeys("netzero");
	         Thread.sleep(1000);
	         
	         new Select(driver.findElement(By.id("secretQuestionCode"))).selectByValue("2");
	        
	         Thread.sleep(1500);
	         driver.findElement(By.id("secretAnswer")).sendKeys("dog");
	         
	         Thread.sleep(1500);
	       /*  
	         new Select(driver.findElement(By.id("freeMemberProfile.dobMonth"))).selectByValue("02");
	         
	         Thread.sleep(1000);
	         new Select(driver.findElement(By.id("freeMemberProfile.dobDay"))).selectByValue("02");
	         
	         Thread.sleep(1000);
	         new Select(driver.findElement(By.id("freeMemberProfile.dobYear"))).selectByValue("1990");
	         
	         Thread.sleep(1500);
	         
	         new Select(driver.findElement(By.id("freeMemberProfile.education"))).selectByValue("110903");
	         Thread.sleep(1000);
	         
	         new Select(driver.findElement(By.id("freeMemberProfile.occupation"))).selectByValue("111006");
	         
	         Thread.sleep(1500);*/
	         
	         driver.findElement(By.id("ccNumber")).sendKeys("5412345678901190");
	         
	         new Select(driver.findElement(By.id("ccExpMonth"))).selectByValue("01");
	         Thread.sleep(100);
	         
	         new Select(driver.findElement(By.id("ccExpYear"))).selectByValue("2023");
	         Thread.sleep(100);
	         
	         driver.findElement(By.id("ccCvm")).sendKeys("785");
	       
	         
	         driver.findElement(By.xpath("//*[@id='acceptTermsHTML']/div[2]/div[1]/label/span")).click();
	         
	         Thread.sleep(1000);
	         
	         driver.findElement(By.id("purchaseSubmit")).click();
	    	 
	      	System.out.println("registration completed, closing the browser window");	
	         //driver.quit();
	      	
	      	String  mId = driver.findElement(By.id("memId")).getText();
	      	
	      	System.out.println(mId);
            String mPasswd = driver.findElement(By.id("memPass")).getText();
            
            System.out.println(mPasswd);
            
            Thread.sleep(1000);
            
            driver.findElement(By.xpath("//*[@id='orderConfirmation']/div[5]/div[2]/div[3]/span/a")).click();
            
            Thread.sleep(5000);
            
             driver.switchTo().window(tabs.get(2));
             
            System.out.println(driver.getTitle());
            
            Thread.sleep(4000);
            
            driver.findElement(By.id("tips-continue")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("closeOverLayIcon")).click();
            Thread.sleep(1000);
             
            System.out.println(driver.getTitle());
            Thread.sleep(1000);
            
            }

}
