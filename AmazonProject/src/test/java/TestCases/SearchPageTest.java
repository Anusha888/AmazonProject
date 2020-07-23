package TestCases;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.amazon.qa.base.BaseClass;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.pages.SearchPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class SearchPageTest extends BaseClass

{

	public static HomePage home;
	public static LoginPage login;
	public static SearchPage search;
	public static ExtentHtmlReporter html;
	public static ExtentReports report;
	public static ExtentTest test;
	

	public SearchPageTest()
	{
		super();
	}
	

	

	
	@BeforeMethod
	public void launch()
	{
		login.launchBrowser();
		login=new LoginPage();
		home=new HomePage();
		home=login.signIn(p.getProperty("username"), p.getProperty("password"));
		home.search("Mobiles");
		search=new SearchPage();
	}
	
	@Test(invocationCount=2)
	public void search()
	{
		
		search.randomSearch();
		
	}
	
	
	
	@AfterMethod
	public void teardowm()
	{
		driver.quit();
	}
	
	

	
	
	
}
