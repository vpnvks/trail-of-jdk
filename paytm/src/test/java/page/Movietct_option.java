package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Movietct_option {
	WebDriver driver;
	
	public void movieicon(WebDriver driver) {
		this.driver=driver;
		String url="https://paytm.com/";
		driver.get(url);
		driver.findElement(By.xpath("//span[text()='Movies']")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Pune')]")).click();
	}

}
