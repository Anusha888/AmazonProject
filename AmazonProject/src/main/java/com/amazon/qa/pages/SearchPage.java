package com.amazon.qa.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.BaseClass;

public class SearchPage extends BaseClass
{

	@FindBy(xpath="//span[contains(@class,'a-size-medium a-color-base a-text-normal')]")
	List<WebElement> allProducts;
	
	
	public SearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void randomSearch()
	{
		randomProduct();
		
	}
	
	 public void randomProduct()
	 {
	    Random rand = new Random();
	    int randomProduct = rand.nextInt(allProducts.size());
	   System.out.println( allProducts.get(randomProduct).getText());
	    allProducts.get(randomProduct).click();
		
	 }
	
	
}

