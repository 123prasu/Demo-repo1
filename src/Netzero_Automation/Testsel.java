package Netzero_Automation;
import java.io.File;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
//import Netzero_Automation.Testing.Sent_Nz;

public class Testsel {

	public static void main(String[] args) 
	/* go to exception class and ignore the all expectation from the method call */
			throws java.lang.Exception{
	
		
		/* take  the chrome drivers from user storage place and open chrome tab */
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
	
		WebDriver f1 = new ChromeDriver();
		
	   /* for fire fox use this drivers */
		/*System.setProperty("webdriver.gecko.driver" , "D:\\geckodriver-v0.20.1-win64\\mozilladriver\\geckodriver.exe");
		FirefoxProfile profile =new FirefoxProfile(new File("C:\\Users\\pdesire\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\7lo9sc7v.tester"));
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		WebDriver f3 = new FirefoxDriver(option); */
		
		
		
	
		/* go to chrome tab and enter the gmail url in a new tab */
	f1.get("https://www.gmail.com");
	//f2.get("https://www.flipkart.com");
	//f3.get("https://www.gmail.com");
	
	
	/* where every thread will present wait for that time and proceed the next action */
	Thread.sleep(5000);
	
	/* go to enter mail address column and enter the user mail address */
   WebElement username =  f1.findElement(By.xpath("//*[@id='identifierId']"));
   username.sendKeys("pdesireddy29");
   Thread.sleep(1500);
   
   /* go to next after enter the user mail address */
   WebElement next = f1.findElement(By.xpath("//*[@id='identifierNext']"));
   next.click();
   Thread.sleep(5000);
   
   /*go to password column and enter the login password */
   WebElement passwd = f1.findElement(By.xpath("//*[@name='password']"));
   passwd.sendKeys("Ilovemyself");
   
   /*go to next and click on it */
   WebElement next1 = f1.findElement(By.xpath("//*[@id='passwordNext']"));
   next1.click();
   Thread.sleep(10000);
  
   /* go to compose folder and click on compose button */
   WebElement comp = f1.findElement(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']"));
   comp.click();
   Thread.sleep(7000);
   
   /* go to "to address" and enter the mailing recipients */
   WebElement to = f1.findElement(By.name("to"));
		   to.sendKeys("pdesireddy29@gmail.com");
		   Thread.sleep(2000);
		   
		 /* go to subject and enter the subject */
		   WebElement sub = f1.findElement(By.name("subjectbox"));
		 //  System.out.println(f1.findElement(By.name("subjectbox")));
		   sub.getText();
		   sub.sendKeys("Welcome to selenium training");
		   System.out.println(sub.getAttribute("value"));
		  String str = sub.getText();
		   System.out.print(str);
		    Thread.sleep(2000);
		   		   
		/* go to message body and compose an email */   
		WebElement body = f1.findElement(By.xpath("//div[@class='Ar Au']//div"));
		body.click();
		body.sendKeys("hi prasanna, how are you???? Here by i'm inviting you please join on selenium traning course");
		Thread.sleep(5000);
		
		/* go to click on send after compose of an email */
		f1.findElement(By.xpath("//div[contains(text(),'Send')]")).click();
		  Thread.sleep(3000);
		
		/* Go to Sent Items and verify */
		f1.findElement(By.xpath("//a[@title='Sent Mail']")).click();
		
		if (f1.findElement(By.xpath("//div[@class='y6']//b[text()='"+sub.getAttribute("value")+"']")) != null)
		{
		System.out.println(" Email sent sucessfully!!!");
		}
		else
		{
		System.out.println("Failed to send email !!!");
		}
		Thread.sleep(3000);
	
		
   /*go to sign out logo */
   WebElement imag = f1.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a"));
   imag.click();
   /*click() is the method it will automatically click that tag of web application here it will click the sign out logo of gmail */
   Thread.sleep(5000);
  
   /* go to sign out button and click sign out option */
   WebElement signout  = f1.findElement(By.xpath("//*[@id='gb_71']"));
    signout.click();
   Thread.sleep(4000);
   
   /* close the tab after successful sign out from user account */ 
   f1.close();
   
   
   //tab close 
   
   
   }

}
 