package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {
	
	@Test
	public void slide() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement wele=driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		for(int i=0;i<10;i++) {
			System.out.println("inside of for loop");
			wele.sendKeys(Keys.ARROW_RIGHT);
		}

	}

}
