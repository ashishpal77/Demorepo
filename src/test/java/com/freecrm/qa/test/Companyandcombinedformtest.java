package com.freecrm.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.freecrm.qa.base.Testbase;
import com.freecrm.qa.pages.Companycombinedform;
import com.freecrm.qa.pages.Companypage;
import com.freecrm.qa.pages.Homepage;
import com.freecrm.qa.pages.Loginpage;
import com.freecrm.qa.utility.Testutil;
import com.freecrm.qa.utility.Xls_Reader;

public class Companyandcombinedformtest extends Testbase {
	
	Homepage hmp;
	Loginpage lp;
	Companypage cmp;
	Testutil util;
	Companycombinedform ccf;
	public String sheetName="cmpcombtestdata";
	
	public Companyandcombinedformtest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		Initialization();
		lp=new Loginpage();
		hmp=new Homepage();
		cmp=new Companypage();
		util=new Testutil();
		ccf=new Companycombinedform();
		hmp=lp.login(prop.getProperty("username"),prop.getProperty("password"));		
		
   }
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
		
	
	/*
	@Test
	public void verifycombinedformtest()
	{
		util.switchtoframe();
		ccf=hmp.clickoncombinedpage();
	    ccf.Enterdataincombinedform("google", "IT", "2400USD", "1500", "CLIENT", "ACTIVE", "HIGH", "CUSTOMER", "123", "VAT123", "101010", "FAX1", "WWW.GOOGLE.COM", "MAIL.GGOGLE.COM", "GOOGLE", "ADOBE", "SERVICE", "TITTLE", "ASHISH", "MIDDLE", "PAL", "SUFFIX", "NICKNAME", "POSITION", "DEPARTMENT", "SUPERVISOR", "ASSCOT", "REFFERED", "CIMOACT", "compstatus","tags", "contact", "mobile", "homephone", "confax", "contactemail", "msn", "network", "skypeid", "compsource", "comidentifier", "area", "addtittle", "type", "address", "city", "state", "postcode", "country");
	}
	*/
	
	
	@DataProvider
	public Object[][] getcrmdata()
	{
		Object data[][]=util.getTestData(sheetName);
		return data;
		
		
	}
	
	@Test(dataProvider="getcrmdata")
	public void verifycombinedformtest(String cname,String industry,String annualrev,String emp,String category,String status,String priority,String source,String identifier,String vat,String phone,String fax,String website,String email,String symbol,String cleintname,String service,String tittle,String fname,String  middleinitial,String  surname,String suffix,String nickname,String position,String department,String supervisor,String  asscont,String reffered,String compcat,String compstatus,String tags,String contact,String mobile,String homephone,String confax,String contactemail,String msn,String network,String skypeid,String compsource,String comidentifier,String area,String addtittle,String type,String address,String city,String state,String postcode,String country  )
	{
	util.switchToFrame();
	ccf=hmp.clickoncombinedpage();
	
		ccf.Enterdataincombinedform(cname, industry, annualrev, emp, category,status,priority, source, identifier, vat, 
				phone, fax, website, email, symbol, 
				cleintname, service, tittle, fname, 
				middleinitial, surname, suffix, nickname, 
				position, department, supervisor, asscont, reffered, 
				compcat, compstatus, tags, contact, mobile, homephone, confax, 
				contactemail, msn, network, skypeid, compsource, comidentifier, 
				area, addtittle, type, address, city, state, postcode, country);
				
	
		
		
	}
}
