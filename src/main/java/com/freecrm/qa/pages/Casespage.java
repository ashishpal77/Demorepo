package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Casespage extends Testbase  {
	
	//page factory
	
	@FindBy(xpath="//input[@name='cs_keyword']")
	WebElement keywordtb;
	@FindBy(xpath="//input[@name='cs_extended']")
	WebElement extendedtb;
	@FindBy(xpath="//select[@name='cs_closed']")
	WebElement stateddl;
	@FindBy(xpath="//select[@name='cs_status']")
	WebElement statusddl;
	@FindBy(xpath="//select[@name='cs_type']")
	WebElement typeddl;
	@FindBy(xpath="//select[@name='cs_priority']")
	WebElement priorityddl;
	@FindBy(xpath="//input[@name='cs_notes']")
	WebElement notestb;
	@FindBy(xpath="//input[@name='cs_company_name']")
	WebElement companytb;
	@FindBy(xpath="//input[@name='tag']")
	WebElement tagtb;
	@FindBy(xpath="//select[@name='cs_deadline_operator']")
	WebElement deadlineddl;
	@FindBy(xpath="//input[@name='cs_deadline']")
	WebElement deadlinetb;
	@FindBy(xpath="//select[@name='cs_by_assigned']")
	WebElement userassignddl;
	@FindBy(xpath="//select[@name='by_user']")
	WebElement ownerddl;
	@FindBy(xpath="(//input[@name='cs_submit'])[2]")
	WebElement searchbtn;
	
	public Casespage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
