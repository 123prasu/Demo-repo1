package Netzero_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Vacation_res extends Logout_Nz {

	public void vacation() throws InterruptedException{
		WebElement optvactn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("optionItem4")));
		nz.findElement(By.id("optionItem4")).click();
		Thread.sleep(3000);
		nz.findElement(By.id("vrStatusOn")).click();
		Thread.sleep(3000);
		nz.findElement(By.id("startMonth")).sendKeys("August");
		Thread.sleep(2000);
		nz.findElement(By.id("startDay")).sendKeys("28");
		Thread.sleep(2000);
		nz.findElement(By.id("startYear")).sendKeys("2018");
		Thread.sleep(4000);
		
		nz.findElement(By.id("endMonth")).sendKeys("August");
		Thread.sleep(2000);
		nz.findElement(By.id("endDay")).sendKeys("31");
		Thread.sleep(2000);
		
		nz.findElement(By.id("endYear")).sendKeys("2018");
		Thread.sleep(5000);
		
		nz.findElement(By.id("vrMsgBody")).sendKeys("I am in vacation this three days, if you have any queries please feel free to contact me with my personal mail id");
		
		Thread.sleep(5000);
		
		nz.findElement(By.id("selfMsg")).click();
		
		WebElement optelem1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='fi_barMenu_bottom']/div[2]/div[1]/div/div[2]/a")));
		
		nz.findElement(By.xpath("//*[@id='fi_barMenu_bottom']/div[2]/div[1]/div/div[2]/a")).click();
		
		Thread.sleep(1500);
		System.out.println("vacation responder enabled sucessfully");
		
		}
	
	 public void junkmail() throws InterruptedException{
		
		WebElement optjunk = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("optionItem5")));
		
		nz.findElement(By.id("optionItem5")).click();
		
		Thread.sleep(2000);
		
		WebElement optjunk1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addressBL")));
		
		System.out.println("idebtified the address book to block list");
		nz.findElement(By.id("addressBL")).click();
		System.out.println("entered to address book");
		
		String s[] = new String[3];
		 s[0] ="tester@gmail.com";
		 s[1] = "testing@gmail.com";
		 s[2] = "test@gmail.com";
		 
		
		for(int i=0; i<=2; i++){
			
		  nz.findElement(By.id("addressBL")).sendKeys(s[i]);
		
      Thread.sleep(2000);
       nz.findElement(By.id("blockListBtn_mid")).click();
       
		Thread.sleep(4000);
		System.out.println(s[i]);
		}
		nz.findElement(By.xpath("//*[@id='fi_barMenu_bottom']/div[2]/div[1]/div/div[2]/a")).click();	
	}

public void persnalInfo() throws InterruptedException{
	
	WebElement persnlinfo1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("optionItem2")));
	
	nz.findElement(By.id("optionItem2"));
	
	Thread.sleep(2000);
	
	WebElement persnlinfo2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
	
	nz.findElement(By.id("name")).sendKeys("tester");
	
	Thread.sleep(3000);
	
	nz.findElement(By.id("sendSampleMail")).click();
	
	Thread.sleep(3000);
	
	WebElement persnlinfo3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='fi_barMenu_bottom']/div[2]/div[1]/div/div[2]/a")));
	
	nz.findElement(By.xpath("//*[@id='fi_barMenu_bottom']/div[2]/div[1]/div/div[2]/a")).click();
	
	
	
	
	
}


}



	

