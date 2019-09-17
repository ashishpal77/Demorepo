package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.freecrm.qa.base.Testbase;

public class Productspage extends Testbase {
	
	//page factory
	
	@FindBy(xpath="//input[@value='New Product']")
	WebElement npbtn;
	@FindBy(xpath="//input[@id='name']")
	WebElement nametb;
	

}
