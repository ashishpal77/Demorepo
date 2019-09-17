package com.freecrm.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.base.Testbase;
import com.freecrm.qa.pages.Companycombinedform;
import com.freecrm.qa.pages.Contactcombinedformpage;
import com.freecrm.qa.pages.Homepage;
import com.freecrm.qa.pages.Loginpage;
import com.freecrm.qa.utility.Testutil;

public class Contactandcombinedformtest extends Testbase {
	
	Loginpage lp;
	Homepage hp;
	Testutil ul;
	Contactcombinedformpage contactcombined;
	
	
	
	
	public Contactandcombinedformtest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		Initialization();
		lp=new Loginpage();
		hp=new Homepage();
		ul=new Testutil();
		contactcombined=new Contactcombinedformpage();
		hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void contactcombinedtest()
	{
		
		ul.switchToFrame();
		hp.clickoncombinedpage();
		contactcombined.entercontactcombineddetail("google", "software", "15000USD", "11000", "client", "active", "high", "customer", "ID", "123", "9540648555", "123456", "www.google.com", "ashishpal77@google.com", "symbol", "pcom", "service", "Dr.", "ashish", "pal", "pal", "jr.", "nickname", "position", "department", "supervisor", "assistant", "reff", "Friend", "Active", "tags", "011126347701", "011126347708", "9810122118", "contfax", "contemail", "altemail", "msn", "immnetwork", "skypeid", "source", "contactidentifier", "description", "", "address", "city", "state", "pcode", "country");
		
	}
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		
		
	}
	
	
	

}
