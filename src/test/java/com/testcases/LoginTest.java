package com.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.TestUtil;



public class LoginTest extends TestBase{
	
//	public LoginTest() throws IOException {
//		
//		// TODO Auto-generated constructor stub
//	}
//	LoginPage lp = new LoginPage(driver);
//
//	@BeforeMethod
//
//	public void setup() throws IOException
//	{
//		initialization();
//
//	}
//
//	@Test
//	public void ValidateTitle()
//	{
//		String title=lp.ValidateTitle();
//		System.out.println(title);
//	}
//
//	@Test
//	public void login()
//	{
//		lp.emailid().sendKeys("DemoSalesManager");
//		lp.password().sendKeys("crmsfa");
//		lp.submit().click();
//		lp.crmsfs().click();
//	}
//	@AfterMethod
//
//	public void teardown()
//	{
//		driver.quit();
//	}
	

		public LoginTest() throws IOException {
		
		// TODO Auto-generated constructor stub
	}
		LoginPage lp = new LoginPage(driver);

@DataProvider
public Object[][] getdata() throws IOException {
	Object[][] data =TestUtil.getData("testdata");
	return data;
}

@Test(dataProvider = "getdata")
public void dis(String name, String surname)
{
	System.out.println(name);
	System.out.println(surname);
}

		@Test
		public void login() throws IOException
		{
	System.setProperty("webdiver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
			
			//lp.initialization();
			//System.out.println("initalization done");

	lp.emailid().sendKeys(prop.getProperty("username"));
	lp.password().sendKeys(prop.getProperty("password"));
	lp.submit().click();
	lp.crmsfs().click();
	
		}
}
