package Netzero_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Options_page extends Compose_Nz{
	
	public void options() throws InterruptedException{
		
		WebElement options = nz.findElement(By.id("optionsButton_txt"));
		options.click();
		
		
		/*WebElement optelem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("optionItem3")));
		
		nz.findElement(By.id("optionItem3")).click();
		Thread.sleep(1000);
		nz.findElement(By.xpath("//*[@id='blockImg']")).click();
		Thread.sleep(1000);
		nz.findElement(By.xpath("//*[@id='fi_barMenu_top']/div[2]/div[1]/div/div[2]/a")).click();*/
		
		
	}

}
