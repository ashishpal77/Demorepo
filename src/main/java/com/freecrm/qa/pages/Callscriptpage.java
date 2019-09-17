package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Callscriptpage extends Testbase {
	
	//page factory
	
	@FindBy(xpath="//input[@name='script_name']")
	WebElement nametb;
	@FindBy(xpath="//textarea[@name='script_desc']")
	WebElement descriptiontb;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement savebtn;
	
	public Callscriptpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void entercallscriptpage(String name,String description)
	{
		nametb.sendKeys(name);
		descriptiontb.sendKeys(description);
		savebtn.click();
		
	}
	
	

}
