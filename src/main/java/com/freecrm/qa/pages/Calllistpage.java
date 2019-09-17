package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Calllistpage extends Testbase {

	//page factory
	@FindBy(xpath="//input[@name='cs_name']")
	WebElement nametb;
	@FindBy(xpath="//select[@name='by_user']")
	WebElement uderddl;
	@FindBy(xpath="//input[@value='Search']")
	WebElement searchbtn;
	
	public Calllistpage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void entercalllistpagedetail(String name,String user)
	{
		nametb.sendKeys(name);
		uderddl.sendKeys(user);
		searchbtn.click();
		
		
	}
	
	
	
}
