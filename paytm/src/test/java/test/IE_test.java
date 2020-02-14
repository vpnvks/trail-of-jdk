package test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.Fastag_test;

public class IE_test {
	
 WebDriver driver;
	@BeforeTest(groups= {"A"})
	@Parameters("browser")
	public void setup(String browser) throws AWTException, InterruptedException {
		
		if (browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		
	}
	
	else if (browser.equalsIgnoreCase("edge"))	{
		
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		
			}
	else {
		System.out.println("no browser present");
	}}
/*	WebDriver driver;
	@BeforeTest(groups= {"A"})
	@Parameters("browser")
	public void brouser_sel(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	}*/
	
	@Test(groups= {"A","B"})
	public void berowser() throws InterruptedException {
		/*driver.get("https://www.guru99.com/");
		driver.findElement(By.xpath("//li//a[text()='Selenium']")).click();*/
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		new Fastag_test(driver); 
		//driver.findElement(By.xpath("//span[text()='Buy FASTag']")).click();
	}
}
