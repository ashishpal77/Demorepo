package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.freecrm.qa.base.Testbase;

public class Newcasepage extends Testbase {
	
	//page factory
	
	@FindBy(xpath="//input[@name='title']")
	WebElement tittletb;
	@FindBy(xpath="//select[@name='status']")
	WebElement statusddl;
	@FindBy(xpath="//input[@name='deadline']")
	WebElement deadlinetb;
	@FindBy(xpath="//input[@name='identifier']")
	WebElement identifiertb;
	@FindBy(xpath="//input[@name='tags']")
	WebElement tagstb;
	@FindBy(xpath="//textarea[@name='description']")
	WebElement descriptiontb;
	@FindBy(xpath="//select[@name='priority']")
	WebElement priorityddl;
	
	

}
