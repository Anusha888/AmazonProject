package com.amazon.qa.actiondriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.amazon.qa.base.BaseClass;

public class ActionClass extends BaseClass
{

	//public static Actions a;
	public static Actions action1()
	{
	
		return new Actions(driver);
		
	}
	
	public static void mousemovement(WebElement e)
	{
	

		action1().moveToElement(e).build().perform();;
	}
	
	
	
	
	
}
