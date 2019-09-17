package com.freecrm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Loginpage extends Testbase {
	
	//pagefactory-OR
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement pass;
	
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validatetittle()
	{
		return driver.getTitle();
	}
	
	
	public Homepage login(String un,String pwd)
	{
		username.sendKeys(un);
		pass.sendKeys(pwd,Keys.ENTER);
		return new Homepage();
		
	}
	


}
