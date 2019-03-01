package Netzero_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	
	public static void main(String[] args) throws InterruptedException{
		
		//browser property
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
		
		//Launching the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize chrome browser
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//for getting the text of web page table content
		String contact = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[2]/td[2]")).getText();
		
		
		//gor getting the attribute value
		//String attribute = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[2]/td[2]")).getAttribute("id");
		//String attribute1 = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[2]/td[2]")).getAttribute("title");
		String attribute2 = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[2]/td[2]")).getAttribute("value");
		
		System.out.println(contact);
		
		//System.out.println(attribute);
		//System.out.println(attribute1);
		System.out.println(attribute2);
		
	String Expectedcontact = "Maria Anders";
	if(Expectedcontact.contentEquals(contact)){
		System.out.println("test case pass...!");
	}
		else {
			System.out.println("test case failed...!");
	}
		
	
	
	}

}
