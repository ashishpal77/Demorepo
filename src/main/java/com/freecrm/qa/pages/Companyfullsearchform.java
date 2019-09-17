package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Companyfullsearchform extends Testbase {
	
	//pagefactory
	@FindBy(xpath="//input[@name='cs_name']")
	WebElement companynametb;
	@FindBy(xpath="//input[@name='cs_industry']")
	WebElement industrytb;
	@FindBy(xpath="//input[@name='cs_annual_revenue']")
	WebElement annualrevenuuetb;
	@FindBy(xpath="//input[@name='cs_num_of_employees']")
	WebElement employeestb;
	@FindBy(xpath="//select[@name='cs_status']")
	WebElement statusddl;
	@FindBy(xpath="//select[@name='cs_category']")
	WebElement categoryddl;
	@FindBy(xpath="//select[@name='cs_priority']")
	WebElement priorityddl;
	@FindBy(xpath="//select[@name='cs_source']")
	WebElement sourceddl;
	@FindBy(xpath="//select[@name='by_user']")
	WebElement ownerddl;
	@FindBy(xpath="//input[@name='cs_identifier']")
	WebElement identifiertb;
	@FindBy(xpath="//input[@name='cs_vat_number']")
	WebElement vattb;
	@FindBy(xpath="//input[@name='cs_phone']")
	WebElement phonetb;
	@FindBy(xpath="//input[@name='cs_fax']")
	WebElement faxtb;
	@FindBy(xpath="//input[@name='cs_website']")
	WebElement websitetb;
	@FindBy(xpath="//input[@name='cs_email']")
	WebElement emailtb;
	@FindBy(xpath="//input[@name='cs_symbol']")
	WebElement symboltb;
	@FindBy(xpath="//input[@name='cs_extended']")
	WebElement extendedtb;
	@FindBy(xpath="//input[@name='tag']")
	WebElement tagtb;
	@FindBy(xpath="//select[@name='cs_address_type']")
	WebElement addressddl;
	@FindBy(xpath="//input[@name='cs_default_address']")
	WebElement defaultaddtb;
	@FindBy(xpath="//textarea[@name='cs_address_only']")
	WebElement billadressstb;
	@FindBy(xpath="//input[@name='cs_city']")
	WebElement addcitytb;
	@FindBy(xpath="//input[@name='cs_state']")
	WebElement addstatetb;
	@FindBy(xpath="//input[@name='cs_postcode']")
	WebElement addpostcodetb;
	@FindBy(xpath="//input[@name='cs_country']")
	WebElement addcountrytb;
	@FindBy(xpath="//textarea[@name='cs_service']")
	WebElement descriptiontb;
	@FindBy(xpath="//input[@name='cs_search_extended']")
	WebElement extendedcheckbox;
	@FindBy(xpath="(//input[@value='Search Companies'])[2]")
    WebElement searchcompaniesbtn;
	
	public Companyfullsearchform()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Enterfullsearchform(String cname,String ind,String annrev,String emp,String status,String category,String priority,String source,String owner,
			String identifier,String vat,String phone,String fax,String website,String email,String symbol,String extended,String tag,String address,String defaults,
			String billaddress,String city,String state,String postcode,String country,String description  )
	{
		companynametb.sendKeys(cname);
		industrytb.sendKeys(ind);
		annualrevenuuetb.sendKeys(annrev);
		employeestb.sendKeys(emp);
		statusddl.sendKeys(status);
		categoryddl.sendKeys(category);
		priorityddl.sendKeys(priority);
		sourceddl.sendKeys(source);
		ownerddl.sendKeys(owner);
		identifiertb.sendKeys(identifier);
		vattb.sendKeys(vat);
		phonetb.sendKeys(phone);
		faxtb.sendKeys(fax);
		websitetb.sendKeys(website);
		emailtb.sendKeys(email);
		symboltb.sendKeys(symbol);
		extendedtb.sendKeys(extended);
		tagtb.sendKeys(tag);
		addressddl.sendKeys(address);
		defaultaddtb.sendKeys(defaults);
		billadressstb.sendKeys(billaddress);
		addcitytb.sendKeys(city);
		addstatetb.sendKeys(state);
		addpostcodetb.sendKeys(postcode);
		addcountrytb.sendKeys(country);
		descriptiontb.sendKeys(description);
		extendedcheckbox.click();
		searchcompaniesbtn.click();
		
	}
	
}
