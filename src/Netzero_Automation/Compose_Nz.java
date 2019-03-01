package Netzero_Automation;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Compose_Nz extends Login_Nz {

	public void compose() throws Exception, java.io.IOException{
	
		//WebDriver nz = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(nz,30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Compose Mail")));
		 WebElement compose =  nz.findElement(By.linkText("Compose Mail"));
		   compose.click();
		   
		  Thread.sleep(5000);
		  
		  
		  nz.findElement(By.id("eow_To")).sendKeys("nqatest_gvinay22@netzero.net");
		  
		  Thread.sleep(2000);
		  
		  nz.findElement(By.id("eow_Subject")).sendKeys("text mail from selenium script");
		  Thread.sleep(2000);
		  
		  nz.findElement(By.xpath("//*[@id='msgText_ifr']")).sendKeys(" text mail, Please ignore!!!!!!!!");
		  
		  Thread.sleep(5000);
		
		  for(int i =0 ; i<=5;i++)
		   {
		    nz.findElement(By.xpath("//*[@id='attachafile_top']/div[2]")).click();
			  Thread.sleep(4000);
		 /* Normal way to upload attachments
		  *  StringSelection ss = new StringSelection("C:\\Users\\pdesire\\Desktop\\backend stuff.doc");
		  
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);*/
		
		//  upload the attachments through fileing 
			  File file = new File("E:\\attachments");
			  File[] files = file.listFiles();
			  for(File f: files){
				  String imgname = f.getName();
				  Thread.sleep(3000);
				  Runtime.getRuntime().exec("E:\\attachments"+imgname);
			
			  
		  //Robot class
		  Robot rb = new Robot();
		  rb.keyPress(KeyEvent.VK_ENTER);
		  rb.keyRelease(KeyEvent.VK_ENTER);
		  rb.keyPress(KeyEvent.VK_CONTROL);
		  rb.keyPress(KeyEvent.VK_V);
		  rb.keyRelease(KeyEvent.VK_CONTROL);
		  rb.keyRelease(KeyEvent.VK_V);
		  rb.keyPress(KeyEvent.VK_ENTER);
		  rb.keyRelease(KeyEvent.VK_ENTER);
		  
		  Thread.sleep(3000);
		  }
		   }
		  Thread.sleep(7000);
		  
		  nz.findElement(By.xpath("//*[@id='send_bottom']/div[2]")).click();
		  
		 // Thread.sleep(8000);
		  
		 // nz.findElement(By.xpath("//*[@id='newRHS']/div/div[4]/a")).click();
		 // Thread.sleep(2000);
		  
		   }}





