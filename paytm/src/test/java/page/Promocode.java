package page;


//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Promocode {
WebDriver driver;

public void applypromo(WebDriver driver) throws InterruptedException {
	this.driver=driver;
	Thread.sleep(3000);
	//WebDriverWait wbat=new WebDriverWait(driver, 10);
	//wbat.until(ExpectedConditions.invisibilityOfAllElements(driver.findElement(By.xpath("//a[contains(text(),'Have a promocode')]"))));
	driver.findElement(By.xpath("//a[contains(text(),'Have a promocode')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[1]//div[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_11kC _1Kkq _15qf _3vjB']")).click();
	driver.findElement(By.xpath("//i[@class='icon-delete']")).click();
	driver.findElement(By.xpath("//i[@class='_1nFl']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(), '1 more items')]")).click();
	WebElement wbel=driver.findElement(By.xpath("//div[contains(text(),'Life Insurance cover of Rs. 2 lakh')]"));
	String str=wbel.getText().toString();
	System.out.println(str);
	if (str.equals("Life Insurance cover of Rs. 2 lakh")) {
		System.out.println("similar string so test is passed");
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Proceed to pay')]")).click();
	Thread.sleep(5000);
	System.out.println("after sleep on login");
	//WebElement ifrme= driver.findElement(By.tagName("iframe"));
	WebElement ifrme1=driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
	
	//System.out.print(ifrme.toString());
	driver.switchTo().frame(ifrme1);
	//System.out.println("tried 1 moving to other");
	//driver.switchTo().frame(ifrme);
	System.out.println("tried 2 as weell");
	driver.findElement(By.xpath("//span[contains(text(),'Login/Signup with mobile number and password')]")).click();
}
	
}
