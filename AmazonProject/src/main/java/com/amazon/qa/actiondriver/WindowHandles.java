package com.amazon.qa.actiondriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;

import com.amazon.qa.base.BaseClass;

public class WindowHandles extends BaseClass
{
	
   public static Set<String>set;
	public static void windowHandle()
	{
		

		set=driver.getWindowHandles();
		Iterator<String> itr=set.iterator();
		String parent=itr.next();
		String child=itr.next();
		driver.switchTo().window(child);
		
		
		
		
	}
	
}
