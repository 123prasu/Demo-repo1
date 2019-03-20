package checks;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(CustomLisen.class)	
public class MyCases extends CustomLisen {
   @Test
	public void test_1a(){
		System.out.println("test case1");
		driver.get("https://google.co.in");
		String test = driver.getTitle();
        Assert.assertEquals(test, "trets1");
	}

	@Test
	public void test_1b(){
		System.out.println("test case2");
		driver.get("https://store.qa7.netzero.net/account/store.do");
		System.out.println(driver.getTitle());
	}

}