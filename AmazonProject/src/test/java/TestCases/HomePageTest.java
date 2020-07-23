package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.BaseClass;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class HomePageTest extends BaseClass
{

	public static HomePage home;
	public static LoginPage login;

	public HomePageTest()
	{
		super();
		
		
	}
	
	
	@BeforeMethod
	public static void setup()
	{
		login.launchBrowser();
		login=new LoginPage();
		home=login.signIn(p.getProperty("username"), p.getProperty("password"));
	}
	
	
	
	
	
	
	
}
