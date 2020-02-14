package apps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

public class Newtab {
	

WebDriver driver;

public void newtab(WebDriver driver) throws AWTException {
	this.driver=driver;
	Robot act =new Robot();
	act.keyPress(KeyEvent.VK_CONTROL);
	act.keyPress(KeyEvent.VK_T);
	act.keyRelease(KeyEvent.VK_CONTROL);
	act.keyRelease(KeyEvent.VK_T);
	driver.get("http://gamil.com/");
	
}
}
