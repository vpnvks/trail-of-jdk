package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bust_booking {
WebDriver driver;

 public void bustbokking(WebDriver driver) throws InterruptedException {
	this.driver=driver;
	Thread.sleep(2000);
	//this.driver.get("https://paytm.com/");
	driver.findElement(By.xpath("//span[text()='Bus']")).click();
	//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	/*Thread.sleep(3000);
	System.out.println("wait before from click");
	driver.findElement(By.xpath("//label[text()='From']")).click();
	System.out.println("clicked on from");
	Thread.sleep(2000);
	System.out.println("after wait of 2 second");
	driver.findElement(By.xpath("//p[text()='Pune']")).click();*/
	
	driver.findElement(By.id("text-box")).click();
	driver.findElement(By.xpath("//p[text()='Pune']")).click();
    //driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div[3]/div/p[2]")).click();
    driver.findElement(By.xpath("(//input[@id='text-box'])[2]")).click();
    driver.findElement(By.xpath("//p[text()='Hyderabad']")).click();
    driver.findElement(By.xpath("//button[text()='Search']")).click();
    
 }

}
