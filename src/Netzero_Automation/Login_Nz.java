package Netzero_Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Nz {
	
	
	WebDriver nz = new ChromeDriver();       
	WebDriverWait wait = new WebDriverWait(nz,30); 
		
	public void verify(){
		
		
		
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
				  
				 
		}
	}


