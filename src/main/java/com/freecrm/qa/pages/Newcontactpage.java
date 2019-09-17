package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Newcontactpage extends Testbase {
	
	//page factory
	
	@FindBy(xpath="//select[@name='title']")
	WebElement tittleddl;
	@FindBy(id="first_name")
	WebElement firstnametb;
	@FindBy(xpath="//input[@name='middle_initial']")
	WebElement middleinitialtb;
	@FindBy(xpath="//input[@name='surname']")
	WebElement surnametb;
	@FindBy(xpath="//select[@name='suffix']")
	WebElement suffixddl;
	@FindBy(xpath="//input[@id='image_file']")
	WebElement choosefilebtn;
	@FindBy(xpath="//input[@name='nickname']")
	WebElement nicknametb;
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement clientlookuptb;
	@FindBy(xpath="//input[@name='company_position']")
	WebElement companypositiontb;
	@FindBy(xpath="//input[@name='department']")
	WebElement departmenttb;
	@FindBy(xpath="//input[@name='supervisor_contact_id']")
	WebElement supervisortb;
	@FindBy(xpath="//input[@name='assistant_contact_id']")
	WebElement assistanttb;
	@FindBy(xpath="//input[@name='referred_by']")
	WebElement refferedbytb;
	@FindBy(xpath="//select[@name='category']")
	WebElement categoryddl;
	@FindBy(xpath="//select[@name='status']")
	WebElement statusddl;
	@FindBy(xpath="//input[@id='phone']")
	WebElement phonetb;
	@FindBy(xpath="//input[@id='mobile']")
	WebElement mobiletb;
	@FindBy(xpath="//input[@id='home_phone']")
	WebElement homephonetb;
	@FindBy(xpath="//input[@id='fax']")
	WebElement faxtb;
	@FindBy(xpath="//input[@id='email']")
	WebElement emailtb;
	@FindBy(xpath="//input[@id='email_alt']")
	WebElement altemailtb;
	@FindBy(xpath="//input[@id='im_id']")
	WebElement mssgnidtb;
	@FindBy(xpath="//select[@name='im_netowrk']")
	WebElement imnetworkddl;
	@FindBy(xpath="//input[@name='skype_id']")
	WebElement skypeidtb;
	@FindBy(xpath="//select[@name='source']")
	WebElement sourcetb;
	@FindBy(xpath="//input[@name='identifier']")
	WebElement identifiertb;
	@FindBy(xpath="//input[@name='address_title']")
	WebElement addresstittletb;
	@FindBy(xpath="(//textarea[@name='address'])[1]")
	WebElement addresstb;
	@FindBy(xpath="//input[@name='city']")
	WebElement citytb;
	@FindBy(xpath="//input[@name='state']")
	WebElement statetb;
	@FindBy(xpath="//input[@name='postcode']")
	WebElement postcodetb;
	@FindBy(xpath="//input[@name='country']")
	WebElement countrytb;
	@FindBy(xpath="//select[@name='time_zone']")
	WebElement timezoneddl;
	@FindBy(xpath="//select[@name='country']")
	WebElement countryddl;
	
	
	public Newcontactpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void eneternewcontactpage(String tittlet,String fname,String minitial,String sname,String suffix,String nname,
			String cleintname,String cposition,String department,String supervisor,String assistant,String refferedby,
			String  category,String status,String phone,String mobile,String homephone,String fax,String email,
			String  altemail,String msn,String imnetwork,String skype,String source,String identifier,
			String addresstittle,String address,String city,String state,String post,String country,String timezone,String contry  )
	{
		tittleddl.sendKeys(tittlet);
		firstnametb.sendKeys(fname);
		middleinitialtb.sendKeys(minitial);
		surnametb.sendKeys(sname);
		suffixddl.sendKeys(suffix);
		choosefilebtn.click();
		nicknametb.sendKeys(nname);;
		clientlookuptb.sendKeys(cleintname);;
		companypositiontb.sendKeys(cposition);;
		departmenttb.sendKeys(department);;
		supervisortb.sendKeys(supervisor);;
		assistanttb.sendKeys(assistant);;
		refferedbytb.sendKeys(refferedby);;
		categoryddl.sendKeys(category);;
		statusddl.sendKeys(status);;
		phonetb.sendKeys(phone);;
		mobiletb.sendKeys(mobile);;
		homephonetb.sendKeys(homephone);;
		faxtb.sendKeys(fax);;
		emailtb.sendKeys(email);;
		altemailtb.sendKeys(altemail);;
		mssgnidtb.sendKeys(msn);;
		imnetworkddl.sendKeys(imnetwork);;
		skypeidtb.sendKeys(skype);;
		sourcetb.sendKeys(source);;
		identifiertb.sendKeys(identifier);;
		addresstittletb.sendKeys(addresstittle);;
		addresstb.sendKeys(address);;
		citytb.sendKeys(city);;
		statetb.sendKeys(state);;
		postcodetb.sendKeys(post);;
		countrytb.sendKeys(country);;
		timezoneddl.sendKeys(timezone);;
		countryddl.sendKeys(contry);;
		
		
		
	}
	
	

}
