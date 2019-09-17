package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Dealspage extends Testbase {
	
	//page factory
	
	@FindBy(xpath="//input[@name='cs_keyword']")
	WebElement keywordtb;
	@FindBy(xpath="//input[@name='cs_extended']")
	WebElement extendedtb;
	@FindBy(xpath="//input[@name='cs_probability']")
    WebElement probabilitytb;
	@FindBy(xpath="//select[@name='cs_type']")
	WebElement typrddl;
	@FindBy(xpath="//input[@name='cs_notes']")
	WebElement notestb;
	@FindBy(xpath="//input[@name='tag']")
	WebElement tagtb;
	@FindBy(xpath="//input[@name='cs_contact_name']")
	WebElement contacttb;
	@FindBy(xpath="//select[@name='cs_source']")
	WebElement sourceddl;
	@FindBy(xpath="//select[@name='by_user']")
	WebElement userddl;
	@FindBy(xpath="(//input[@name='cs_submit'])[2]")
	WebElement submitbtn;
	
	
	public Dealspage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
}
