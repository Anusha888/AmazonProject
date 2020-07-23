package com.amazon.qa.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.amazon.qa.base.BaseClass;


public class ScreenShots extends BaseClass
{

	
	public static String simpledateformat()
	{
		DateFormat  d=new SimpleDateFormat("yyyymmddhhmmss");
		String date=d.format(new Date());
		return date;
	}
	
	public static String screenshot(String name) throws IOException
	{


		String destination=System.getProperty("user.dir")+"\\ScreenShot\\"+name+simpledateformat()+".png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(destination));
		return destination;
		
	}
	
}
	
	
	