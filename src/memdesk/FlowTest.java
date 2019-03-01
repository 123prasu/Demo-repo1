package memdesk;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlowTest {

@BeforeSuite
public void property(){
System.out.println("Setting system property for chrome");	
}
@BeforeTest
public void lanuch(){
System.out.println("Lanuching the chrome browser");		
}
@BeforeClass
public void  url(){
System.out.println("Entering the page url");	
}
@BeforeMethod
public void  login(){
System.out.println("vaildating login credentials");	
	
}
@Test
public void pageTitle2(){
System.out.println("page title2");	
}
@Test
public void pageTitle1(){
System.out.println("page title1"
		+ "");	
}
@AfterMethod
public void logOut(){
System.out.println("logout from the session");	
}
@AfterClass
public void deleteCookies(){
System.out.println("deleting the all cookies");	
}
@AfterTest
public void closeBrowser(){
System.out.println("closing the browser window");	
}
@AfterSuite
public void reports(){
System.out.println("Generating the reports");	
}

}
