package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import apps.Page_scroll;

public class Select_hotel {

	WebDriver driver;
	
	public Select_hotel(WebDriver driver) throws InterruptedException {
		this.driver=driver;
		Page_scroll pg_scrl=new Page_scroll(driver);
		pg_scrl.scrollbypixel(0, 500);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='https://assetscdn.paytm.com/hotels/images/ex/static/hotels/9202/900x600/gallery4.jpg']")).click();
	}
}
