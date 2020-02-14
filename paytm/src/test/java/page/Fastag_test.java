package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fastag_test {
	WebDriver driver;
	public Fastag_test(WebDriver driver) throws InterruptedException {
		this.driver=driver;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Buy FASTag']")).click();
	}

}
