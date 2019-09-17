package com.freecrm.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.base.Testbase;
import com.freecrm.qa.pages.Contactcombinedformpage;
import com.freecrm.qa.pages.Contactfullsearchform;
import com.freecrm.qa.pages.Contactspage;
import com.freecrm.qa.pages.Homepage;
import com.freecrm.qa.pages.Loginpage;
import com.freecrm.qa.utility.Testutil;

public class Contactfullsearchtest extends Testbase {
	
	Loginpage lp;
	Homepage hp;
	Contactspage cp;
	Contactcombinedformpage ccf;
	Contactfullsearchform cfs;
	Testutil tu;
	
	@BeforeMethod
	public void setup()
	{
		
		Initialization();
		lp=new Loginpage();
		hp=new Homepage();
		cp=new Contactspage();
		ccf=new Contactcombinedformpage();
		tu=new Testutil();
		hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		tu.switchToFrame();
	    cfs= hp.newcontactfullsearchform();
	    
	    
	    
		
		
		
	}
	
	@Test
	public void verifycontactfullsearchtest()
	{
		
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		
	}
	
	

}
