package Netzero_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Logout_Nz extends Options_page {

public void logout() throws InterruptedException{

	WebElement elemout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='newRHS']/div/div[4]/a")));
	
	nz.findElement(By.xpath("//*[@id='newRHS']/div/div[4]/a")).click();
	Thread.sleep(2000);
	nz.close();
	
}
}