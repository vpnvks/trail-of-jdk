package test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.Homepage;

public class Test_execution {

	WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://paytm.com/");
	}
	@Test
	public void homepage_exec() throws InterruptedException, AWTException {
		Homepage HMPG=new Homepage();
		HMPG.rechrarge(driver);
	}
	
}
