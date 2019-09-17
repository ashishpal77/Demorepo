package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Contactspage extends Testbase {
	
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactlabellink;
	
	public Contactspage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifylabel()
	{
		return contactlabellink.isDisplayed();
	}
	

}
