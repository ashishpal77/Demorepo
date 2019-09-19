package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Taskpage extends Testbase {
	
	//pagefactory
	
	@FindBy(xpath="//input[@name='cs_keyword']")
	WebElement keywordtb;
	@FindBy(xpath="//input[@name='cs_extended']")
	WebElement extendedtb;
	@FindBy(xpath="//input[@name='cs_completion']")
	WebElement completiontb;
	@FindBy(xpath="//select[@name='cs_status']")
	WebElement statusddl;
	@FindBy(xpath="//select[@name='cs_task_type']")
	WebElement typeddl;
	@FindBy(xpath="//input[@name='cs_notes']")
	WebElement notestb;
	@FindBy(xpath="//input[@name='cs_company_name']")
	WebElement companytb;
	@FindBy(xpath="//input[@name='tag']")
	WebElement tagtb;
	@FindBy(xpath="//select[@name='cs_by_assigned']")
	WebElement assignedddl;
	//@FindBy(xpath="//select[@name='cs_by_assigned']")
	
	
	
	public Taskpage()
	{
	   	
		PageFactory.initElements(driver, this);
	}
	
	public void save()
	{
		
	}
	
	
	

}
