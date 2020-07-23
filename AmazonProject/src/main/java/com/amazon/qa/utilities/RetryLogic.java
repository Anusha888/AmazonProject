package com.amazon.qa.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{


	int limit=3;
	int count=0;
	
	public boolean retry(ITestResult result) 
	{
		if(count<limit)
		{
		count++;
		return true;
		}
		return false;

	}
	

}
