package page;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;
	public void rechrarge(WebDriver driver1) throws InterruptedException, AWTException {
		
		driver=driver1;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8109666719");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_2CU_']//input[@type='text']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'MTNL')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Mumbai')]")).click();
		driver.findElement(By.xpath("//input[@type='text' and @autocomplete='new-password']")).sendKeys("49");
		driver.findElement(By.xpath("//button[contains(text(),'Proceed to Recharge')]")).click();
		
	}

}
