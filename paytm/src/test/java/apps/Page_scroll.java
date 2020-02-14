package apps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Page_scroll {
	WebDriver driver;
	JavascriptExecutor js;
	public Page_scroll(WebDriver driver) {
	this.driver=driver;
	js=(JavascriptExecutor) driver;
	System.out.println("inside constricto");
	}
	
	public void scrollbypixel(int x,int y) {
		System.out.println("inside scroll method");
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
}
