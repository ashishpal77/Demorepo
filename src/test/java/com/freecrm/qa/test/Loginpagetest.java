package com.freecrm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.base.Testbase;
import com.freecrm.qa.pages.Homepage;
import com.freecrm.qa.pages.Loginpage;

public class Loginpagetest extends Testbase {
	Loginpage loginp;
	Homepage homp;
	
	Loginpagetest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		Initialization();
		loginp=new Loginpage();
		
	}
	@Test
	public void validatetittle()
	{
		String result=loginp.validatetittle();
		Assert.assertEquals(result, "CRMPRO - CRM software for customer relationship management, sales, and support.", "testcase passed");
	}
	
	@Test
	public void validatelogo()
	{
		
		
	}
	@Test
	public void login()
	{
		homp=loginp.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	@Test
	public void verifysignuptest()
	{
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
