package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException
	{
		prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\sputtapaka\\MyEclispse\\POMTest\\src\\main\\java\\com\\config\\config.properties");
	    prop.load(fis);
	}
	
	public static void initialization()
	{
		String browName = prop.getProperty("browser");
		if(browName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if (browName.equals("firefox"))
		{
			//System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			//driver=new ChromeDriver();
			System.out.println("i dont have code for firefox :P");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_time, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		System.out.println(" am in base");
	}
}

