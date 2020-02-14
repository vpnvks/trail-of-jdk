package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Movie_date_selection {

	WebDriver driver;
	
	public void moview_dt(WebDriver driver) throws InterruptedException {
		this.driver=driver;
		Thread.sleep(3000);
		System.out.println("inside movie daate selection");
		driver.findElement(By.xpath("//span[text()='Fri']")).click();
		
		Actions act =new Actions(driver);
		//scroll page by 200 pixcel
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		WebElement wele=driver.findElement(By.xpath("//div[text()='04:00 PM']"));
		act.moveToElement(wele);
		Thread.sleep(3000);
		wele.click();
		
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ul/li[text()='C']//following-sibling::li[6]")).click();
		
	}
}
