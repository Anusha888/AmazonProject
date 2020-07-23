package com.amazon.qa.utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.amazon.qa.actiondriver.WindowHandles;
import com.amazon.qa.base.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestListener extends ExtentReportManager  implements ITestListener
{
	
	public static String  path;
	
	@Override
	public void onStart(ITestContext context) 
	{


		
		
	}
	
	@Override
	public void onTestStart(ITestResult result) 
	{

     test=report.createTest(result.getName());  
     test.createNode(result.getName());

		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		
		  if(result.getStatus()==ITestResult.SUCCESS) {
		  
		  test.log(Status.PASS, "Pass Test Case is"+result.getName());
		  
		 
		WindowHandles.windowHandle();
		try {
			
			path=ScreenShots.screenshot(result.getName());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try {
			test.pass("Screen shot is attached", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  }
		  
		  
		  
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
	
		try {
			ScreenShots.screenshot(result.getName());
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
}
