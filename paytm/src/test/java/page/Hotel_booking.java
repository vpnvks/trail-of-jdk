package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hotel_booking {
	WebDriver driver;

	public Hotel_booking(WebDriver driver) {
		this.driver=driver;
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
	}
}
