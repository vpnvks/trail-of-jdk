package page;

//import org.apache.poi.xwpf.usermodel.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Movie_select {

	WebDriver driver;
	
	public void mymovie(WebDriver driver) throws InterruptedException {
		this.driver=driver;
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//div[text()='Tanhaji: The Unsung Warrior']")).click();
		
		
	}
}
