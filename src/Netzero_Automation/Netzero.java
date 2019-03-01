package Netzero_Automation;
//import Netzero_Automation.Sent_Nz;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Netzero_Automation.Compose_Nz;
import Netzero_Automation.Login_Nz;
import Netzero_Automation.Options_page;

public class Netzero {
public static WebDriver nz;
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
          
		nz.manage().window().maximize();
		
	Vacation_res netzo = new Vacation_res();
	
	//verify the user login credentials 
	 netzo.verify();
    Thread.sleep(4000);
	 
	 //Go to compose and compose a test mail to some other recpnts
	  netzo.compose();
	  Thread.sleep(5000);
	  
	  
	  // go to the options page 
	//  netzo.options();
	  //Thread.sleep(10000);
	
	 //enable the vacation responder 
	   //netzo.vacation();
	  //Thread.sleep(10000);
	  
	 //go to junk mail settings and check the box.
	  //netzo.junkmail();
	  //Thread.sleep(5000);
	  //netzo.logout();
	 
		/*WebDriver nz = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(nz,30);
		
		nz.get("https://webmail.netzero.net/?cf=sp");
		
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("memberId")));
		
		WebElement username =  nz.findElement(By.xpath("//*[@id='memberId']"));
		
		   username.sendKeys("nqatest_gvinay22@netzero.net");
		   
		   WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/button")));
		   
		   WebElement next =  nz.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/button"));
		  next.click();
		   
		   WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']")));
		   WebElement passwd =  nz.findElement(By.xpath("//*[@id='password']"));
			  passwd.sendKeys("netzero1");
			   
			  WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='signin']")));
			   
			   WebElement signin =  nz.findElement(By.xpath("//*[@id='signin']"));
				  signin.click();
				  Thread.sleep(15000);
			
				  WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("compose_id")));
				   
			  WebElement compose =  nz.findElement(By.linkText("Compose Mail"));
				   compose.click();
				   
				  Thread.sleep(5000);
				  
				  
				  nz.findElement(By.id("eow_To")).sendKeys("nqatest_gvinay22@netzero.net");
				  
				  Thread.sleep(2000);
				  
				  nz.findElement(By.id("eow_Subject")).sendKeys("text mail from selenium script");
				  Thread.sleep(7000);
				  
				  nz.findElement(By.xpath("//*[@id='msgText_ifr']")).sendKeys(" text mail, Please ignore!!!!!!!!");
				  
				  Thread.sleep(5000);
				  
				  nz.findElement(By.xpath("//*[@id='send_bottom']/div[2]")).click();
				  
				  Thread.sleep(8000);
				  
				  nz.findElement(By.xpath("//*[@id='newRHS']/div/div[4]/a")).click();
				  Thread.sleep(2000);
				  
				nz.close();*/
				  
				  
				  
				  
	}		  
				  
				  
				  
		
	}


