package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class City_selection {

WebDriver driver;
	
	public void mycity(WebDriver driver) throws InterruptedException {
		this.driver=driver;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Pune']")).click();
	}
}
