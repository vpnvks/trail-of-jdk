package apps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import test.Test_execution;

public class Applyteststatus implements  ITestListener{
WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("test case stared --> "+ result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case successful --> " + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Test_execution te=new Test_execution();
		TakesScreenshot sh= (TakesScreenshot)te.driver;
		File shfile=sh.getScreenshotAs(OutputType.FILE);
		File destlocation=new File("C:\\Users\\VipinMishra\\Selenium\\"+result.getName()+".png");
		//WebDriver driver = Test_execution.driver;
		//driver.close();
		try {
			FileUtils.copyFile(shfile, destlocation);
		} catch (IOException e) {
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped --> "+ result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test case on context start --> "+ context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test case on context finised --> "+context.getName());
		
	}

}
