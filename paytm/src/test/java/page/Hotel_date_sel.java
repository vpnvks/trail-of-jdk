package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Hotel_date_sel {

	WebDriver driver;
	public Hotel_date_sel(WebDriver driver) throws InterruptedException, FindFailed {
		this.driver=driver;
		driver.findElement(By.xpath("//input[@type='text' and @id='text-box']")).click();
		driver.findElement(By.xpath("//p[text()='Vijayawada']")).click();
		driver.findElement(By.xpath("//div[@data-reactid='171']//img[@role='presentation']")).click();
		Thread.sleep(2000);
		Screen s = new Screen();
		Pattern fileinputbox =new Pattern("C:\\Users\\VipinMishra\\Desktop\\nextbutton.jpg");
		s.click(fileinputbox);
		s.click(fileinputbox);
		driver.findElement(By.xpath("//div[text()='24']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
	}
	
}
