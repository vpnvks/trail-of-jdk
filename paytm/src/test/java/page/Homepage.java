package page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;
	public void rechrarge(WebDriver driver1) throws InterruptedException, AWTException {
		driver=driver1;
		//Robot rb= new Robot();
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8109666719");
		
	//	rb.keyPress(KeyEvent.key);
		driver.findElement(By.xpath("//div[@class='_2CU_']//input[@type='text']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'MTNL')]")).click();
/*		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2CU_']/label[contains(text(),'Circle')]")).click();
		Thread.sleep(2000);
		System.out.println("reached to circlr selection");
		driver.findElement(By.xpath("//li//span[contains(text(),'Mumbai')]")).click();
		Thread.sleep(2000);
		System.out.println("reached to amount");*/
		driver.findElement(By.xpath("//div[@class='_1vY2 ']/label[@data-reactid='217']")).sendKeys("49");
		System.out.println("amount is selected");
		driver.findElement(By.xpath("//button[contains(text(),'Proceed to Recharge')]")).click();
		
	
	}

}
