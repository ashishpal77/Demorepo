package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Casefullsearchpage extends Testbase {
	
	//pagefactory
	
	 @FindBy(xpath="//input[@name='cs_keyword']")
	 WebElement tittletb;
	 @FindBy(xpath="//select[@name='cs_closed']")
	 WebElement stateddl;
	 @FindBy(xpath="//select[@name='cs_by_assigned']")
	 WebElement userassignedddl;
	 @FindBy(xpath="//select[@name='by_user']")
	 WebElement ownerddl;
	 @FindBy(xpath="//select[@name='cs_deadline_operator']")
	 WebElement deadlineddl;
	 @FindBy(xpath="//input[@name='cs_deadline']")
	 WebElement deadlinetb;
	 @FindBy(xpath="//input[@name='cs_created_at_from']")
	 WebElement creationdatefromtb;
	//    @FindBy(xpath="//input[@name='cs_created_at_from']")
	 @FindBy(xpath="//input[@name='cs_created_at_to']")
	 WebElement creationtotb;
	 @FindBy(xpath="//input[@name='cs_last_modified_from']")
	 WebElement modifiedfromtb;
	 @FindBy(xpath="//input[@name='cs_last_modified_to']")
	 WebElement modifiedtotb;
	 @FindBy(xpath="//input[@name='cs_close_date']")
	 WebElement closedatetb;
	 @FindBy(xpath="//input[@name='tag']")
	 WebElement tagtb;
	 @FindBy(xpath="//textarea[@name='cs_notes']")
	 WebElement notestb;
	 @FindBy(xpath="//select[@name='cs_priority']")
	 WebElement priorityddl;
	 @FindBy(xpath="//select[@name='cs_status']")
	 WebElement statusddl;
	 @FindBy(xpath="//select[@name='cs_type']")
	 WebElement typeddl;
	 @FindBy(xpath="//input[@name='cs_identifier']")
	 WebElement identifiertb;
	 @FindBy(xpath="//input[@name='cs_extended']")
	 WebElement extendedtb;
	 @FindBy(xpath="//input[@name='cs_company_name']")
	 WebElement companynametb;
	 @FindBy(xpath="//input[@name='cs_contact_name']")
	 WebElement contactnametb;
	 @FindBy(xpath="(//input[@value='Search Cases' and  @type='submit'])[2]")
     WebElement searchbtn;
	 
	 
	 public Casefullsearchpage()
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 
	 
	 
	 

}
