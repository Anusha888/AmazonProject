package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.qa.base.BaseClass;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class LoginPageTest extends BaseClass
{

	public  static LoginPage loginob;
	public static HomePage home;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void initialization()
	{
		//BaseClass.launchBrowser();
		loginob=new LoginPage();
	}
	
	@Test(enabled=false)
	public void loginid()
	{
		loginob.signIn(p.getProperty("username"), p.getProperty("password"));

	}
	
	
	
}
