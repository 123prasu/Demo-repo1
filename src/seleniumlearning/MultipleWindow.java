package seleniumlearning;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultipleWindow {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		//For launching the chrome browser required system property 
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
		
		//to launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//entering the url
		driver.get("https://webmail.lax.qa7.netzero.net/?cf=sp");
		
	  String mwTab = driver.getWindowHandle();
		
		//MultipleWindow mw = new MultipleWindow();
		
		WebElement nttab = driver.findElement(By.xpath("//*[@id='newaccount_button']"));
		
		nttab.click();
		  Thread.sleep(700);
		  
		/*  Set<String> handles = driver.getWindowHandles();

		String  firstWinHandle = driver.getWindowHandle(); handles.remove(firstWinHandle);

		  String winHandle = handles.iterator().next();

		  if (winHandle!=firstWinHandle){

		  //To retrieve the handle of second window, extracting the handle which does not match to first window handle

		String  secondWinHandle = winHandle; //Storing handle of second window handle

		 //Switch control to new window

		  driver.switchTo().window(secondWinHandle);
		  
		  Thread.sleep(2000);*/
		  
		  
		  
		  List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		  System.out.println("total my windows"+windows.size());
		
		for(int i=0;i<windows.size();i++){

	        System.out.println(driver.switchTo().window(windows.get(i)).getTitle());
	  	      }
	  		  System.out.println(driver.getTitle());
		 // Actions action = new Actions(driver);
		  
		 // action.keyDown(Keys.SHIFT).click(nttab).keyUp(Keys.SHIFT).build().perform();Thread.sleep(5000);
		 
              Thread.sleep(2000);		  
		  /*List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		  System.out.println("total my windows"+windows.size());
	      for(int i=0;i<windows.size();i++){
	    	  System.out.println(driver.switchTo().window(windows.get(i)).getTitle());
	      }*/
		  
		  driver.findElement(By.xpath("//*[@id='servicesNav']/a/span")).click();
		  
		  Thread.sleep(750);
		  
		//	driver.findElement(By.xpath("//*[@id='serviceList']/a[13]/section/div[3]/button")).click();
			
		
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
			driver.findElement(By.id("lastName")).sendKeys("Desireddy");
			driver.findElement(By.id("billingAddress.streetName")).sendKeys("77 9th ave");
			driver.findElement(By.id("billingAddress.city")).sendKeys("Newyork");
			new Select(driver.findElement(By.id("billingAddress.state"))).selectByValue("NY");
			driver.findElement(By.id("billingAddress.zip")).sendKeys("10011");
			driver.findElement(By.id("mobileNumberId")).sendKeys("8182873480");
	        driver.findElement(By.id("sendSMSBtn")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='pvcodeId']")).sendKeys(driver.manage().getCookieNamed("otp").getValue());
		        Thread.sleep(1000);
			System.out.println(driver.manage().getCookieNamed("otp").getValue());
			Thread.sleep(1700);
		     driver.findElement(By.id("checkCode")).click();
			
			driver.findElement(By.id("altEmailAddress")).sendKeys("pdesire@corp.untd.com");
			
			
			//driver.findElement(By.xpath("//*[@id='order']/article/section[1]/div[13]/label/span")).click();
			/*WebElement checkBox = driver.findElement(By.xpath("//*[@id='order']/article/section[1]/div[13]/label/span"));
			
			checkBox.click()*/;
	
			driver.findElement(By.xpath("//*[@id='order']/article/section[1]/div[13]/div/label/span")).click();
			//driver.findElement(By.id("specialOffersEmailOptinCheckBox")).click();
			
			
			Thread.sleep(100);
			
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
	            
	         WebElement webmail =  driver.findElement(By.xpath("//*[@id='orderConfirmation']/div[5]/div[2]/div[3]/span/a"));
	         webmail.click();
	           
	         System.out.println(driver.switchTo().window(windows.get(2)).getTitle());
	         Thread.sleep(1000);
	            
	            //action.keyDown(Keys.SHIFT).click(webmail).keyUp(Keys.SHIFT).build().perform();Thread.sleep(5000);
	           
	            
	            Thread.sleep(10000);
	            
	           // driver.findElement(By.xpath("//*[@id='closeOverLayIcon']")).click();
	            driver.findElement(By.xpath("//*[@id='btmSession']/div[2]/div/div/div[2]/a/b")).click();
	            
	            System.out.println(driver.getTitle());
	            Thread.sleep(1000);
	            
		  
		  

	            
		  }
	  }


			
		
		


