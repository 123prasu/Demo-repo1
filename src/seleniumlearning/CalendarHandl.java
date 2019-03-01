package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandl {

	public static void main(String[] args) {
		
		//For launching the chrome browser required system property 
				System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
				
				//to launch the chrome browser
				WebDriver driver = new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//entering the url
				driver.get("https://www.abhibus.com/");
				
				WebElement dateVal = driver.findElement(By.id("datepicker1"));
				String date = "29-11-2018";
				calTest(driver,dateVal,date);
				
}



public static void calTest(WebDriver driver,WebElement element, String date){

	JavascriptExecutor js = ((JavascriptExecutor) driver);
	
	js.executeScript("argument[0].setAttribute('value','"+date+"');", element);
	
	
}
}