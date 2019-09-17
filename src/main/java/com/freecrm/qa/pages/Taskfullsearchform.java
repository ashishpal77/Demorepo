package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Taskfullsearchform extends Testbase {
	
	//page factory
	
	@FindBy(xpath="//input[@name='cs_keyword']")
	WebElement tittletb;
	@FindBy(xpath="//select[@name='cs_priority']")
	WebElement priprityddl;
	@FindBy(xpath="//select[@name='cs_task_type']")
	WebElement typeddl;
	@FindBy(xpath="//input[@name='cs_extended']")
	WebElement extendedtb;
	@FindBy(xpath="//input[@name='cs_created_at_from']")
	WebElement creationdatefromtb;
	@FindBy(xpath="//input[@name='cs_created_at_to']")
	WebElement creationdatetotb;
	@FindBy(xpath="//input[@name='cs_last_modified_from']")
	WebElement modifiedfromtb;
	@FindBy(xpath="//input[@name='cs_last_modified_to']")
	WebElement modifiedtotb;
	@FindBy(xpath="//input[@name='tag']")
	WebElement tagtb;
	@FindBy(xpath="//input[@name='cs_case']")
	WebElement casetb;
	@FindBy(xpath="//input[@name='cs_deal']")
	WebElement dealtb;
	@FindBy(xpath="//textarea[@name='cs_notes']")
	WebElement notestb;
	@FindBy(xpath="//input[@name='cs_completion']")
	WebElement completiontb;
	@FindBy(xpath="//select[@name='cs_status']")
	WebElement statusddl;
	@FindBy(xpath="//select[@name='cs_by_assigned']")
	WebElement assignedddl;
	@FindBy(xpath="//select[@name='by_user']")
	WebElement userddl;
	@FindBy(xpath="//input[@name='cs_identifier']")
	WebElement identifiertb;
	@FindBy(xpath="//input[@name='cs_company_name']")
	WebElement companynametb;
	@FindBy(xpath="//input[@name='cs_contact_name']")
	WebElement contactnametb;
	@FindBy(xpath="//input[@name='cs_deadline']")
	WebElement deadlinetb;
	@FindBy(xpath="(//input[@value='Search Tasks'])[2]")
	WebElement searchtb;
	
	public Taskfullsearchform()
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
