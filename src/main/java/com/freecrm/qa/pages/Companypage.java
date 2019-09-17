package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Companypage extends Testbase {
	
	//pagefactory for company page
	
	@FindBy(xpath="//select[@name='cs_status']")
	WebElement scstatusdropdown;
	@FindBy(xpath="//select[@name='cs_category']")
	WebElement cscategorylink;
	@FindBy(xpath="//input[@name='cs_name']")
	WebElement csname_link;
	@FindBy(xpath="//input[@name='cs_extended']")
    WebElement extendedtextboxlink;
	@FindBy(xpath="//input[@name='cs_notes']")
	WebElement csnotestextboxlink;
	@FindBy(xpath="//select[@name='by_user']")
	WebElement csbyusertextboxlink;
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement clientlookuplink;
	@FindBy(xpath="//input[@name='tag']")
    WebElement taglink;
	@FindBy(xpath="//select[@name='cs_priority']")
	WebElement csprioritydropdownlistlink;
	@FindBy(xpath="//input[@name='cs_industry']")
	WebElement csindustrytextboxlink;
	@FindBy(xpath="//input[@name='cs_address']")
	WebElement csaddresstextboxlink;
	@FindBy(xpath="//select[@name='cs_address_type']")
	WebElement scaddressdropdownlistlink;
	@FindBy(xpath="//input[@name='cs_default_address']")
	WebElement csdefaultaddresslink;
	
	public Companypage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createcompany(String status,String category,String cname,String extname,String Notes,String owner,String Parentcompany,String Tags,String priority,String industry)
	{
		scstatusdropdown.sendKeys(status);
		cscategorylink.sendKeys(category);
		csname_link.sendKeys(cname);
		extendedtextboxlink.sendKeys(extname);
		csnotestextboxlink.sendKeys(Notes);
		csbyusertextboxlink.sendKeys(owner);
		clientlookuplink.sendKeys(Parentcompany);
		taglink.sendKeys(Tags);
		csprioritydropdownlistlink.sendKeys(priority);
		csindustrytextboxlink.sendKeys(industry);
		
		
		
		
		
	}
	
	
}
