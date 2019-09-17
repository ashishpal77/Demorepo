package com.freecrm.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.base.Testbase;
import com.freecrm.qa.pages.Callpage;
import com.freecrm.qa.pages.Campaignpage;
import com.freecrm.qa.pages.Casespage;
import com.freecrm.qa.pages.Contactspage;
import com.freecrm.qa.pages.Dealspage;
import com.freecrm.qa.pages.Emailpage;
import com.freecrm.qa.pages.Homepage;
import com.freecrm.qa.pages.Loginpage;
import com.freecrm.qa.pages.Newcompanypage;
import com.freecrm.qa.pages.Taskpage;
import com.freecrm.qa.pages.Textsmspage;
import com.freecrm.qa.utility.Testutil;

public class Newcompanytest extends Testbase {
	
	Loginpage loginp;
	Homepage homepg ;
	Testutil util;
	Contactspage cpntactpg;
	Newcompanypage ncompage;
	
	public Newcompanytest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
	
		Initialization();
		util=new  Testutil();
		cpntactpg=new Contactspage();
		loginp=new Loginpage();
		ncompage=new Newcompanypage();
		homepg=loginp.login(prop.getProperty("username"),prop.getProperty("password"));
		util.switchToFrame();
		
		
	}
	@Test
	public void verifynewcompanylink()
	{
		ncompage.verifynewcompany();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
