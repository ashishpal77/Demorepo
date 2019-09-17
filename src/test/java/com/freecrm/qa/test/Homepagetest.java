package com.freecrm.qa.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.base.Testbase;
import com.freecrm.qa.pages.Calllistpage;
import com.freecrm.qa.pages.Callpage;
import com.freecrm.qa.pages.Callscriptpage;
import com.freecrm.qa.pages.Campaignpage;
import com.freecrm.qa.pages.Casefullsearchpage;
import com.freecrm.qa.pages.Casespage;
import com.freecrm.qa.pages.Companycombinedform;
import com.freecrm.qa.pages.Companyfullsearchform;
import com.freecrm.qa.pages.Contactcombinedformpage;
import com.freecrm.qa.pages.Contactfullsearchform;
import com.freecrm.qa.pages.Contactspage;
import com.freecrm.qa.pages.Dealfullsearchpage;
import com.freecrm.qa.pages.Dealspage;
import com.freecrm.qa.pages.Emailpage;
import com.freecrm.qa.pages.Emailsignaturepage;
import com.freecrm.qa.pages.Emailtemplatepage;
import com.freecrm.qa.pages.Homepage;
import com.freecrm.qa.pages.Loginpage;
import com.freecrm.qa.pages.Mailaccountpage;
import com.freecrm.qa.pages.Newcallpage;
import com.freecrm.qa.pages.Newcasepage;
import com.freecrm.qa.pages.Newcompanypage;
import com.freecrm.qa.pages.Newcontactpage;
import com.freecrm.qa.pages.Newemailcampaignpage;
import com.freecrm.qa.pages.Newtaskpage;
import com.freecrm.qa.pages.Productspage;
import com.freecrm.qa.pages.Taskfullsearchform;
import com.freecrm.qa.pages.Taskpage;
import com.freecrm.qa.pages.Textsmscampaignpage;
import com.freecrm.qa.pages.Textsmscreditpage;
import com.freecrm.qa.pages.Textsmspage;
import com.freecrm.qa.pages.Textsmstemplatepage;
import com.freecrm.qa.utility.Testutil;

public class Homepagetest extends Testbase {
	Loginpage loginp;
	Homepage homepg ;
	Testutil util;
	Contactspage cpntactpg;
	Dealspage dealpg;
	Taskpage taskpg;
	Casespage casepg;
	Callpage callpg;
	Emailpage emailpg;
	Textsmspage textsmspg;
	Campaignpage cmppage;
	Newcompanypage ncompg;
	Companycombinedform ccf;
	Companyfullsearchform cff;
	Newcontactpage ncp;
	Contactcombinedformpage concf;
	Contactfullsearchform cfs;
	Dealspage dsp;
	Productspage pp;
	Dealfullsearchpage dfsp;
	Newtaskpage ntp;
	Taskfullsearchform tff;
	Newcasepage cnewcase;
	Casefullsearchpage casefs;
	Newcallpage ncpp;
	Callscriptpage csp;
	Calllistpage clp;
	Newemailcampaignpage newecp;
	Emailtemplatepage cet;
	Mailaccountpage map;
	Emailtemplatepage empage;
	Emailsignaturepage esig;
	Textsmscampaignpage tsc;
	Textsmstemplatepage tstemp;
	Textsmscreditpage tsmscredit;
	
	
	public Homepagetest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		Initialization();
		util=new  Testutil();
		cpntactpg=new Contactspage();
		dealpg=new Dealspage();
		taskpg=new Taskpage();
		casepg=new Casespage();
		loginp=new Loginpage();
		callpg=new Callpage();
		emailpg=new Emailpage();
		textsmspg=new Textsmspage();
		cmppage=new Campaignpage();
		ccf=new Companycombinedform();
		ncompg=new Newcompanypage();
		ncp=new Newcontactpage();
		concf=new Contactcombinedformpage();
		cfs=new Contactfullsearchform();
		dsp=new Dealspage();
		dfsp=new Dealfullsearchpage();
		ntp=new Newtaskpage();
		tff=new Taskfullsearchform();
		cnewcase= new Newcasepage();
		casefs=new Casefullsearchpage();
		ncpp=new Newcallpage();
		csp=new Callscriptpage();
		newecp=new Newemailcampaignpage();
		cet=new Emailtemplatepage();
		map=new Mailaccountpage();
		empage=new Emailtemplatepage();
		esig=new Emailsignaturepage();
		tsc=new Textsmscampaignpage();
		tstemp=new Textsmstemplatepage();
		tsmscredit=new Textsmscreditpage();
		//pp=new Productspage();
		homepg=loginp.login(prop.getProperty("username"),prop.getProperty("password"));
	//	Alert al=new Alert(driver);
		
	}
	@Test(priority=1)
	public void verifthomepagetittletest()
	{
		String homepagetittle=homepg.verifyhomepagetittle();
		Assert.assertEquals(homepagetittle, "CRMPRO","Tittle not found");
	}
	@Test(priority=2)
	public void verifycorrectusernametest()
	{
		util.switchToFrame();
		Assert.assertTrue(homepg.verifyusernamelabel());
	}
	@Test(priority=3)
	public void verifycontactslink()
	{
		util.switchToFrame();
		cpntactpg=homepg.clickoncontactcspage();
	}
	@Test(priority=4)
	public void verifydealslink()
	{
		util.switchToFrame();
		dealpg=homepg.clickondelaspage();
		
		
	}
	@Test(priority=5)
	public void verifytasklink()
	{
		util.switchToFrame();
		taskpg=homepg.clickontaskpage();
	}
	@Test(priority=6)
	public void verifycaselink()
	{
		util.switchToFrame();
		casepg=homepg.clickoncasespage();
	}
	@Test(priority=7)
	public void verifycalllink()
	{
		util.switchToFrame();
		callpg=homepg.clickoncallpage();
		
	}
	@Test(priority=8)
	public void verifyemaillink()
	{
		util.switchToFrame();
		emailpg=homepg.clickonemailpage();
	}
	@Test(priority=9)
	public void verifytextsmslink()
	{
		util.switchToFrame();
		textsmspg=homepg.clickontextsmspage();
	}
	@Test(priority=10)
	public void verifycampaignpage()
	{
		util.switchToFrame();
		cmppage=homepg.clickoncampaignpage();
	}
	@Test(priority=11)
	public void verifynewcompanytest()
	{
		util.switchToFrame();
		Actions act=new Actions(driver);
		
		WebElement main=driver.findElement(By.xpath("//a[contains(text(),'Companies')]"));
		act.moveToElement(main).build().perform();
		ncompg=	homepg.cliconewcompanypage();
	}
	@Test(priority=12)
	public void verifyncomcombinedform()
	{
		util.switchToFrame();
		ccf=homepg.clickoncombinedpage();
	}
	@Test(priority=13)
	public void verifycompanyfullsearchform()
	{
		util.switchToFrame();
		cff= homepg.clickoncompanyfullsearchform();
	}
	@Test(priority=14)
	public void verifynewcontactform()
	{
		util.switchToFrame();
		ncp=homepg.newcontactlinks();
	}
	
	@Test(priority=15)
	public void verifynewcontactcombinedformlink()
	{
		util.switchToFrame();
		concf=homepg.newcontactcombinedform();
		
	}
	@Test(priority=16)
	public void verifynewcontactfullsearchformlink()
	{
		util.switchToFrame();
		homepg.newcontactfullsearchform();
		
	}
	@Test(priority=17)
	public void verifynewdealslink()
	{
		util.switchToFrame();
		dsp=homepg.verifynewdeallink();
		
	}
	@Test(priority=18)
	public void verifyproductpage()
	{
		util.switchToFrame();
		homepg.verifyproductlink();
	}
	@Test(priority=19)
	public void verifydealfullsearchform()
	{
		util.switchToFrame();
		homepg.verifydealfullsearchlink();
	}
	@Test(priority=20)
	public void verifynewtaskform()
	{
		util.switchToFrame();
		homepg.verifynewtasklink();
	}
	@Test(priority=21)
	public void verifynewtaskfullsearch()
	{
		util.switchToFrame();
		homepg.verifynewteaskfullsearcgform();
	}
	@Test(priority=22)
	public void verifynewcaselink()
	{
		util.switchToFrame();
		homepg.clickonnewcase();
		
	}
	@Test(priority=23)
	public void verifycasefullsearch()
	{
		util.switchToFrame();
		homepg.clickoncasefullsearch();
		
	}
	@Test(priority=24)
	public void verifynewcallpagetest()
	{
		util.switchToFrame();
		homepg.clickonnewcallpage();
		
	}
	@Test(priority=25)
	public void verifycallscriptpage()
	{
		util.switchToFrame();
		homepg.clickoncallscriptspage();
		
	}
	@Test(priority=26)
	public void verifycalllistpage()
	{
		util.switchToFrame();
		homepg.clickoncalllistpage();
		
	}
	@Test(priority=27)
	public void verifynewemailcampaign()
	{
		util.switchToFrame();
		homepg.clickonnewemailcampaignlink();
		
	}
	@Test(priority=28)
	public void verifyemailaccount()
	{
		util.switchToFrame();
		homepg.clickonmailaccountlink();
		
	}
	@Test(priority=29)
	public void verifycustomizemaillink()
	{
		util.switchToFrame();
		homepg.clcikoncustomizeemaillink();
		
	}
	@Test(priority=30)
	public void verifymailsignature()
	{
		util.switchToFrame();
		homepg.clickonemailsignaturelink();
		
	}
	
	@Test(priority=31)
	public void verifytextsmscampaign()
	{
		util.switchToFrame();
		homepg.clickonnewtextsmscampaign();
		
	}
	@Test(priority=32)
	public void verifytextsmatemplate()
	{
		util.switchToFrame();
		homepg.clickonnewtextsmscampaign();
		
	}
	@Test(priority=33)
	public void verifytextsmscredits()
	{
		util.switchToFrame();
		homepg.clickontextsmscredits();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
