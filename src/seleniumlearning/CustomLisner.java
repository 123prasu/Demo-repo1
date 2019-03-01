package seleniumlearning;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomLisner extends TestListenerAdapter {
	
	public void onTestFailure(ITestResult tr){
		
		File screenshotFile = ((TakesScreenshot)TestScript.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File("D:\\Screenshots\\"+tr.getName()+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		
	}

}
