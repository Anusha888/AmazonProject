
package com.amazon.qa.utilities;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.amazon.qa.base.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager extends BaseClass
{

	
	public static ExtentHtmlReporter html;
	public static ExtentReports report;
	public static ExtentTest test;
	
	
	public static void setmeth()
	{
		html=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\test-output\\ExtentReport\\"+"HTMLReport.html");
		
		
		  html.config().setReportName("Amazon Automation Test Report");
		  html.config().setTheme(Theme.DARK);
		 
		report=new ExtentReports();
		report.attachReporter(html);
		report.setSystemInfo("Tester", "Anusha");
	}
	
	

	public static void endExtent()
	{
		report.flush();
	}


	
}
