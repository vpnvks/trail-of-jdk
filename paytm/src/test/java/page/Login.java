package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
WebDriver driver;
public void enterur(WebDriver driver) throws InterruptedException {
this.driver=driver;
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9479719769");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("VIPIN1MISHRA");
/*driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//form[@id='verifyOTPForm']/div/div[2]/md-content/button/span")).click();
driver.findElement(By.id("input_0")).click();
driver.findElement(By.id("input_0")).clear();
driver.findElement(By.id("input_0")).sendKeys("5111");
driver.findElement(By.xpath("//form[@id='verifyOTPForm']/div/div[2]/md-content/button/span")).click();*/
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//a[text()='X']")).click();
/*WebElement frameElement1=driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
System.out.println("reached inside of frame element");
driver.switchTo().frame(frameElement1);
System.out.println("already switched to frame");
//driver.findElement(By.xpath("//a[@title='Close']")).click();
driver.findElement(By.xpath("//button[@type='submit']")).click();
System.out.println("clcicked on close button");
driver.findElement(By.xpath("//a[@href='https://paytm.com' and  @target='_self']")).click();
Thread.sleep(2000);*/
	
}
	
}
