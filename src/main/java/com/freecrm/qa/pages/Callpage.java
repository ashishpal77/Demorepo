package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Callpage extends Testbase {
	
	//pagefactory
	
	@FindBy(xpath="//input[@id='fieldId_schedule']")
	WebElement fieldscheduletb;
	@FindBy(xpath="(//select[@name='script_id'])[1]")
	WebElement scriptidddl;
	@FindBy(xpath="(//select[@name='user_id'])[1]")
	WebElement useridddl;
	@FindBy(xpath="(//select[@name='reminder_minutes'])[1]")
	WebElement reminderminuteddl;
	@FindBy(xpath="//input[@name='reminder_note']")
	WebElement remindernotetb;
	
	public Callpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
