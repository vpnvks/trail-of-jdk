package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import apps.Page_scroll;

public class Select_bustime {
WebDriver driver;

public void bus_time(WebDriver driver) throws InterruptedException {
	this.driver=driver;
	
	Thread.sleep(9000);
	WebElement wele=driver.findElement(By.xpath("//div/div[text()='Price']/following-sibling::div[1][@class='slider']//div[@class='handle handle-0 ']"));
	WebElement wele1=driver.findElement(By.xpath("//div/div[text()='Departure']/following-sibling::div[1][@class='slider']//div[@class='handle handle-0 ']"));
	Actions act=new Actions(driver);
			
	for(int i=0;i<2;i++) {
		act.moveToElement(wele).clickAndHold().moveByOffset(10,0).release().perform();
		act.moveToElement(wele1).clickAndHold().moveByOffset(10,0).release().perform();
		}
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Select Seats']")).click();
	Thread.sleep(1000);
	Page_scroll ps=new Page_scroll(driver);
	ps.scrollbypixel(0,400);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[text()='D5']")).click();
	driver.findElement(By.xpath("//span[text()='Boarding Point']")).click();
	driver.findElement(By.xpath("//li[@value='2']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Dropping Point']")).click();
	driver.findElement(By.xpath("//li[@value='4']")).click();
	driver.findElement(By.xpath("//button[text()='Continue']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@title='Close']")).click();
	driver.findElement(By.xpath("//span[@class='iconPaytmHeader iconSp']")).click();
}
	
}
