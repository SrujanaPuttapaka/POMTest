package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase{

	public LoginPage(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name="USERNAME")
	WebElement username;
	
	@FindBy(name="PASSWORD")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;
	
	@FindBy(id="button")
	WebElement crmsfaButton;
	
	
public String ValidateTitle()
{
	return driver.getTitle();
}

//public HomePage login(String uname, String pwd) throws IOException
//{
	//username.sendKeys(uname);
	//password.sendKeys(pwd);
	
	//return new HomePage();
	//}
 public WebElement emailid()
 {
	//@CacheLookup -- used to improve script funtionality. used to call when an element example username  is called repeatedly

	 return username;
 }
 public WebElement password()
 {
	 return password;
 }

public WebElement submit() {
	return loginButton;
}
	
public WebElement crmsfs()
{
	return crmsfaButton;
}
	
	


}
