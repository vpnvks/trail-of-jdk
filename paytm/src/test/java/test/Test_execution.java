package test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sikuli.script.FindFailed;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import apps.Applyteststatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.Bust_booking;
import page.City_selection;
import page.Fastag_test;
import page.Homepage;
import page.Hotel_booking;
import page.Hotel_date_sel;
import page.Login;
import page.Movie_date_selection;
import page.Movie_select;
import page.Movietct_option;
import page.Promocode;
import page.Select_bustime;
import page.Select_hotel;
@Listeners(Applyteststatus.class)
public class Test_execution {

	public WebDriver driver;
	
	@BeforeTest(groups= {"D"})
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
	}
		//Thread.sleep(5000);
	}
	
	@Test(priority=1,groups = {"B"})
	public void homepage_exec() throws InterruptedException, AWTException {
		Homepage HMPG=new Homepage();
		HMPG.rechrarge(driver);
		Thread.sleep(3000);
		}
	
	@Test(priority=2, groups = {"B"})
	public void secondtest() throws InterruptedException {
		Promocode prmcd=new Promocode();
		prmcd.applypromo(driver);
	}
	
	@Test(dependsOnMethods= {"secondtest"}, groups = {"B"})
	public void loginexec() throws InterruptedException {
		Login log=new Login();
		log.enterur(driver);
	} 
	
	@Test(dependsOnMethods= {"loginexec"} , groups = {"B"})
	public void MoviePT() throws InterruptedException {
		Movietct_option mvopn=new Movietct_option();
		City_selection ctsln=new City_selection();
		Movie_select mvslt=new Movie_select();
		Movie_date_selection mds=new Movie_date_selection();
		mvopn.movieicon(driver);
		ctsln.mycity(driver);
		mvslt.mymovie(driver);
		mds.moview_dt(driver);
	}
	
	@Test(groups= {"A"})
	public void testcase() throws InterruptedException {
		Bust_booking bsbk=new Bust_booking();
		Select_bustime sebs=new Select_bustime();
		bsbk.bustbokking(driver);
		sebs.bus_time(driver);
		
	}
	//dependsOnMethods= {"testcase"},
	@Test( groups= {"C","A"})
	public void Hotel_b() throws InterruptedException, FindFailed {
		Thread.sleep(3000);
		new Hotel_booking(driver);
		Thread.sleep(3000);
		new Hotel_date_sel(driver);
		new Select_hotel(driver);
	}
	
	@Test(groups= {"C","D"})
	public void tag() throws InterruptedException {
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		new Fastag_test(driver); 
			}
	
	}
