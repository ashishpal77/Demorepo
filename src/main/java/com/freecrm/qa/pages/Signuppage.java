package com.freecrm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@contains(text(),'Sign Up')]")
	WebElement signuplink;
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement logo;
	@FindBy(xpath="//select[@id='payment_plan_id']")
	WebElement paymentdropdown;
	
	public Signuppage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signinpage(String signinlink,String pardropdown)
	
	{
		signuplink.click();
		paymentdropdown.isDisplayed();
		
	}

}
