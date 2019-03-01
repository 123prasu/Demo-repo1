package seleniumlearning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class Annotations {
	
	
	@Test
	public void tc1(){
		System.out.println("First test case ");
				
	}
	
	
	@Test
	public void tc2(){
		System.out.println("Second test case ");
	}
	
}
