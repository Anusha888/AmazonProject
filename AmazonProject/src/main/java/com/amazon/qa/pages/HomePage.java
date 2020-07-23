package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.BaseClass;

public class HomePage extends BaseClass
{

	@FindBy(id="twotabsearchtextbox")
	WebElement searchtext;
	
	@FindBy(xpath="//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
	WebElement searchicon;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void search(String name)
	{
		searchtext.sendKeys(name);
		searchicon.click();
	}
	
	
}
