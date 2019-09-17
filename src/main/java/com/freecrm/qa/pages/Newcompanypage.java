package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Newcompanypage extends Testbase {
	
	//page factory
	@FindBy(xpath="//a[contains(text(),'New Company')]")
	WebElement newcompanylink;
	@FindBy(xpath="//legend[contains(text(),'Create New  Company')]")
    WebElement ncompanypage;
	@FindBy(xpath="//input[@id='company_name']")
	WebElement companynametb;
	@FindBy(xpath="//input[@name='industry']")
	WebElement industrytb;
	@FindBy(xpath="//input[@name='annual_revenue']")
	WebElement annualrevtb;
	@FindBy(xpath="//input[@name='num_of_employees']")
	WebElement nemptb;
	@FindBy(xpath="//select[@name='status']")
	WebElement statusdropdn;
	@FindBy(xpath="//select[@name='category']")
	WebElement catdpodn;
	@FindBy(xpath="//select[@name='priority']")
	WebElement prioritydn;
	@FindBy(xpath="//select[@name='source']")
	WebElement sourceddl;
	@FindBy(xpath="//input[@name='identifier']")
	WebElement identifieetb;
	@FindBy(xpath="//input[@name='vat_number']")
	WebElement vatnumtb;
	@FindBy(xpath="//input[@name='phone']")
	WebElement phonetb;
	@FindBy(xpath="//input[@name='fax']")
	WebElement faxtb;
	@FindBy(xpath="//input[@name='website']")
	WebElement websitetb;
	@FindBy(xpath="//input[@name='email']")
	WebElement emailtb;
	@FindBy(xpath="//input[@name='symbol']")
	WebElement symboltb;
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement clientlookup;
	@FindBy(xpath="//input[@name='address_title']")
	WebElement addtittletb;
	@FindBy(xpath="//textarea[@name='address']")
	WebElement addrestb;
	@FindBy(xpath="//input[@name='city']")
	WebElement citytb;
	@FindBy(xpath="//input[@name='state']")
	WebElement statetb;
	@FindBy(xpath="//input[@name='postcode']")
	WebElement postcodetb;
	
	
	public Newcompanypage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Newcompanypage verifynewcompany()
	{
		newcompanylink.click();
		return new Newcompanypage();
	}
	

}
