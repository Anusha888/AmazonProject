package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.ActionClass;
import com.amazon.qa.base.BaseClass;

public class LoginPage  extends BaseClass
{

	@FindBy(xpath="//span[contains(text(),'Account & Lists')]//span[@class='nav-icon nav-arrow']")
	WebElement loginicon;
	
	@FindBy(xpath="//a[@class='nav-action-button' and @data-nav-ref='nav_signin']//span[text()='Sign in']")
	WebElement signbutton;
	
	@FindBy(id="ap_email")
	WebElement userid;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement SignInButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public HomePage signIn(String username,String pass)
	{
		try
		{
		
	    ActionClass.mousemovement(loginicon);
		signbutton.click();
		userid.sendKeys(username);
		continuebutton.click();
		password.sendKeys(pass);
		SignInButton.click();
		return new HomePage();
		}
		catch(Throwable e)
		{
	
			
			ActionClass.mousemovement(loginicon);
			signbutton.click();
			userid.sendKeys(username);
			continuebutton.click();
			password.sendKeys(pass);
			SignInButton.click();
			return new HomePage();
		}
		
	}
		
		
		
	}
	
	
	
	
	

