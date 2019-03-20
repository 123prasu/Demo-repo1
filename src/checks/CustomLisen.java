package checks;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IAnnotationTransformer;
import org.testng.IExecutionListener;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;





public class CustomLisen implements IInvokedMethodListener,IExecutionListener,IHookable,IAnnotationTransformer,ITestListener{
	public static WebDriver driver;
	
	/*IInvokedMethodListener unimplemented methods*/
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("before invocation of"+method.getTestMethod().getMethodName());
		System.setProperty("webdriver.chrome.driver","D:/chromedriver_win32/webdriverchrome/chromedriver.exe");

		driver = new ChromeDriver();
		

	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("After invocation of"+method.getTestMethod().getMethodName());
		driver.quit();
		
	}
    
	/*IExecutionListener unimplemented methods*/
	@Override
	public void onExecutionStart() {
		System.out.println("Testcases execution is started");
		
	}

	@Override
	public void onExecutionFinish() {
		System.out.println("Testcases execution is ended");		
	}

	/*IHookable unimplemented methods*/
	@Override
	public void run(IHookCallBack callBack, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}
	
	/*IAnnotationTransformer unimplemented methods*/

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryAnalz.class);
		
	}

	/*ITestListener unimplemented methods*/
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		/*System.out.println("Failed test case in custome listner");
		   Date dd = new Date();
		  ss.failed(result.getMethod().getMethodName()+dd.getTime());
		*/
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
