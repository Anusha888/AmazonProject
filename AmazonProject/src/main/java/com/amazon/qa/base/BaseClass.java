package com.amazon.qa.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.amazon.qa.utilities.ExtentReportManager;

public class BaseClass 
{

	public static WebDriver driver;
	public static Properties p;
	public static EventFiringWebDriver e;
	//public static WebEvenListner l;
	

	@BeforeSuite
	public void setexten()
	{
		ExtentReportManager.setmeth();
	}
	
	
	public BaseClass()
	{
		 p=new Properties();
		try {
			FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\Config.properties");
			p.load(fs);
			} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	

	
	
	
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();		
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String u=p.getProperty("url");
    driver.get(u);
	}
	
	
@AfterSuite
public void endext()
{
	ExtentReportManager.endExtent();
}

	
	
}
