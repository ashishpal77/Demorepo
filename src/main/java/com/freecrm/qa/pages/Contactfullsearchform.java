package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Contactfullsearchform extends Testbase {
	
	//page Factory
	
	@FindBy(xpath="//select[@name='cs_title']")
	WebElement tittleddl;
	@FindBy(xpath="//input[@name='cs_first_name']")
	WebElement firstnametb;
	@FindBy(xpath="cs_middle_initial")
	WebElement middlenametb;
	@FindBy(xpath="//input[@name='cs_surname']")
	WebElement lastnametb;
	@FindBy(xpath="//input[@name='cs_company_name']")
	WebElement companynametb;
	@FindBy(xpath="//input[@name='cs_company_position']")
	WebElement positiontb;
	@FindBy(xpath="//input[@name='cs_department']")
	WebElement departmenttb;
	@FindBy(xpath="//input[@name='supervisor_contact_id']")
	WebElement supervisortb;
	@FindBy(xpath="//input[@name='contact_lookup_ref']")
	WebElement reftb;
	@FindBy(xpath="//input[@name='assistant_contact_id']")
	WebElement assistanttb;
	@FindBy(xpath="//select[@name='by_user']")
	WebElement userddl;
	@FindBy(xpath="//input[@name='cs_created_at_from']")
	WebElement creationdatefromtb;
	@FindBy(xpath="//input[@name='cs_created_at_to']")
	WebElement creationdatetotb;
	@FindBy(xpath="//input[@name='cs_last_modified_from']")
	WebElement modifiedfromtb;
	@FindBy(xpath="//input[@name='cs_last_modified_to']")
	WebElement modifiedtotb;
	@FindBy(xpath="//input[@name='tag']")
	WebElement tags;
	@FindBy(xpath="//input[@name='cs_identifier']")
	WebElement identifiertb;
	@FindBy(xpath="//textarea[@name='cs_address_only']")
	WebElement addresstb;
	@FindBy(xpath="//input[@name='cs_city']")
	WebElement citytb;
	@FindBy(xpath="//input[@name='cs_state']")
	WebElement statetb;
	@FindBy(xpath="//input[@name='cs_postcode']")
	WebElement postcodetb;
	@FindBy(xpath="//input[@name='cs_country']")
	WebElement countrytb;
	@FindBy(xpath="//textarea[@name='cs_description']")
	WebElement descriptiontb;
	@FindBy(xpath="//select[@name='cs_category']")
	WebElement categoryddl;
	@FindBy(xpath="//select[@name='cs_status']")
	WebElement statusddl;
	@FindBy(xpath="//select[@name='cs_campaignList']")
	WebElement campaignddl;
	@FindBy(xpath="//input[@name='cs_phone']")
	WebElement phonetb;
	@FindBy(xpath="//input[@name='cs_mobile']")
	WebElement mobiletb;
	@FindBy(xpath="//input[@name='cs_home_phone']")
	WebElement homephonetb;
	@FindBy(xpath="//input[@name='cs_fax']")
	WebElement faxtb;
	@FindBy(xpath="//input[@name='cs_email']")
	WebElement emailtb;
	@FindBy(xpath="//input[@name='cs_email_alt']")
	WebElement altemailtb;
	@FindBy(xpath="//input[@name='cs_im_id']")
	WebElement imidtb;
	@FindBy(xpath="//select[@name='cs_im_netowrk']")
	WebElement imnetworkddl;
	@FindBy(xpath="//input[@name='cs_skype_id']")
	WebElement skypeidtb;
	@FindBy(xpath="//select[@name='cs_source']")
	WebElement sourceddl;
	@FindBy(xpath="//input[@name='cs_birthday']")
	WebElement birthdayfromtb;
	@FindBy(xpath="//input[@name='cs_birthday_to']")
	WebElement birthdaytotb;
	@FindBy(xpath="//select[@name='cs_birthday_month']")
	WebElement birthdaymon;
	@FindBy(xpath="(//input[@value='Search Contacts'])[2]")
	WebElement searchcontactsbtn;
	
	
	public Contactfullsearchform()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void Enterfullsearchform(String tittle,String fname,String mname,String lname,String cnmae,
	String position,String department,String supervisor,String ref,String assistant,String user,String creationdatefrom
	,String creationdateto,String  modifiedfrom,String modifiedto,String tag,String identifier,String address,String city,
	String state,String pcode,String country,String description,String category,String status,String campaign,String phone,
	String mobile,String homeph,String fax,String email,String altemail,String imid,String imnetwork,String skypeid,String sorce,
	String bfrom,String bto,String bmon  )
	{
		tittleddl.sendKeys(tittle);
		firstnametb.sendKeys(fname);
		middlenametb.sendKeys(mname);
		lastnametb.sendKeys(lname);
		companynametb.sendKeys(cnmae);;
		positiontb.sendKeys(position);;
		departmenttb.sendKeys(department);;
		supervisortb.sendKeys(supervisor);;
		reftb.sendKeys(ref);;
		assistanttb.sendKeys(assistant);;
		userddl.sendKeys(user);;
	    creationdatefromtb.sendKeys(creationdatefrom);;
	    creationdatetotb.sendKeys(creationdateto);;
		modifiedfromtb.sendKeys(modifiedfrom);
		modifiedtotb.sendKeys(modifiedto);
		tags.sendKeys(tag);;
		identifiertb.sendKeys(identifier);
		addresstb.sendKeys(address);;
		citytb.sendKeys(city);;
		statetb.sendKeys(state);;
	    postcodetb.sendKeys(pcode);;
	    countrytb.sendKeys(country);;
	    descriptiontb.sendKeys(description);;
         categoryddl.sendKeys(category);;
        statusddl.sendKeys(status);;
        campaignddl.sendKeys(campaign);;
        phonetb.sendKeys(phone);;
        mobiletb.sendKeys(mobile);;
        homephonetb.sendKeys(homeph);;
		faxtb.sendKeys(fax);;
		emailtb.sendKeys(email);;
		altemailtb.sendKeys(altemail);;
		imidtb.sendKeys(imid);;
		imnetworkddl.sendKeys(imnetwork);;
		skypeidtb.sendKeys(skypeid);;
		sourceddl.sendKeys(sorce);;
		birthdayfromtb.sendKeys(bfrom);;
		birthdaytotb.sendKeys(bto);;
		birthdaymon.sendKeys(bmon);;
		searchcontactsbtn.click();;
		}
	
	
	
	
	
	

}
