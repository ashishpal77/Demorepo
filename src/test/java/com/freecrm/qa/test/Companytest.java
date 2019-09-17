package com.freecrm.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.freecrm.qa.base.Testbase;
import com.freecrm.qa.pages.Companypage;
import com.freecrm.qa.pages.Homepage;
import com.freecrm.qa.pages.Loginpage;
import com.freecrm.qa.utility.Testutil;

public class Companytest  extends  Testbase{
	
	Homepage hmp;
	Loginpage lp;
	Companypage cmp;
	Testutil util;
	public String sheetName="Company";
	
	public Companytest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setupmethod()
	{
		Initialization();
		lp=new Loginpage();
		hmp=new Homepage();
		cmp=new Companypage();
		util=new Testutil();
		hmp=lp.login(prop.getProperty("username"),prop.getProperty("password"));
     //	cmp=hmp.clickoncompanypage();
   }
	
	@AfterMethod
	public void teardown()
	{
	   driver.quit();
	}
	@DataProvider
	public Object[][] getcrmdata()
	{
		Object data[][]=util.getTestData(sheetName);
		return data;
		
		
	}
	@Test(dataProvider="getcrmdata")
	public void verifycompanytest(String status,String category,String cname,String extname,String Notes,String owner,String Parentcompany,String Tags,String priority,String industry )
	{
		util.switchToFrame();
		cmp=hmp.clickoncompanypage();
		//cmp.createcompany("active","client","Softwatecompany","it","test","naveenautomation","google","tags","high","software");
		cmp.createcompany(status, category, cname, extname, Notes, owner, Parentcompany, Tags, priority, industry);
	}

}
