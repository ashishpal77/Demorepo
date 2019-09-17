package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Companycombinedform extends Testbase {

	//pagefactory
	@FindBy(xpath="//input[@name='company_name']")
	WebElement companynametb;
	@FindBy(xpath="//input[@name='industry']")
	WebElement industrytb;
	@FindBy(xpath="//input[@name='annual_revenue']")
	WebElement annualrevenuetb;
	@FindBy(xpath="//input[@name='num_of_employees']")
	WebElement noemptb;
	@FindBy(xpath="//select[@name='category']")
	WebElement categoryddl;
	@FindBy(xpath="//select[@name='priority']")
	WebElement priorityddl;
	@FindBy(xpath="(//select[@name='source'])[1]")
	WebElement sourceddl;
	@FindBy(xpath="//input[@name='company_identifier']")
	WebElement companyidentifierddl;
	@FindBy(xpath="//input[@name='vat_number']")
	WebElement vatnumbertb;
	@FindBy(xpath="//input[@name='company_phone']")
	WebElement companyphonetb;
	@FindBy(xpath="//input[@name='company_fax']")
	WebElement comfaxtb;
	@FindBy(xpath="//input[@name='website']")
	WebElement websitetb;
	@FindBy(xpath="//input[@name='company_email']")
	WebElement emailtb;
	@FindBy(xpath="//input[@name='symbol']")
	WebElement symboltb;
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement clientlookuptb;
	@FindBy(xpath="//textarea[@name='service']")
	WebElement servicetb;
	@FindBy(xpath="//select[@name='title']")
	WebElement tittleddl;
	@FindBy(xpath="//input[@name='first_name']")
	WebElement Firstnametb;
	@FindBy(xpath="//input[@name='middle_initial']")
	WebElement middleinitialtb;
	@FindBy(xpath="//input[@name='surname']")
	WebElement surnametb;
	@FindBy(xpath="//select[@name='suffix']")
	WebElement suffixtb;
	@FindBy(xpath="//input[@name='contact_nickname']")
	WebElement nicknametb;
	@FindBy(xpath="//input[@name='company_position']")
	WebElement positiontb;
	@FindBy(xpath="//input[@name='department']")
	WebElement departmenttb;
	@FindBy(xpath="//input[@name='supervisor_contact_id']")
	WebElement supervisortb;
	@FindBy(xpath="//input[@name='assistant_contact_id']")
	WebElement assistantcontactidtb;
	@FindBy(xpath="//input[@name='referred_by']")
	WebElement referredbytb;
	@FindBy(xpath="//select[@name='contact_category']")
	WebElement contcategoryddl;
	@FindBy(xpath="//select[@name='contact_status']")
	WebElement contstatusddl;
	@FindBy(xpath="//input[@name='tags']")
	WebElement tagstb;
	@FindBy(xpath="//input[@name='contact_phone']")
	WebElement contacttb;
	@FindBy(xpath="//input[@name='mobile']")
	WebElement mobiletb;
	@FindBy(xpath="//input[@name='home_phone']")
	WebElement homephonetb;
	@FindBy(xpath="//input[@name='contact_fax']")
	WebElement faxtb;
	@FindBy(xpath="//input[@name='contact_email']")
	WebElement contactemailtb;
	@FindBy(xpath="//input[@name='receive_email']")
	WebElement receiveemalradiobtn;
	@FindBy(xpath="(//input[@name='allows_call'])[1]")
	WebElement allowcallradiobtn;
	@FindBy(xpath="//input[@name='im_id']")
	WebElement msngrtb;
	@FindBy(xpath="//select[@name='im_netowrk']")
	WebElement networkddl;
	@FindBy(xpath="//input[@name='skype_id']")
	WebElement skypeidtb;
	@FindBy(xpath="(//select[@name='source'])[1]")
	WebElement consourceddl;
	@FindBy(xpath="//input[@name='contact_identifier']")
	WebElement conidentifiertb;
	@FindBy(xpath="//textarea[@name='description']")
	WebElement textareatb;
	@FindBy(xpath="//input[@name='address_title']")
	WebElement addresstitletb;
	@FindBy(xpath="//select[@name='type'][@class='select']")
	WebElement typeddl;
	@FindBy(xpath="//textarea[@name='address']")
	WebElement addresstb;
	@FindBy(xpath="//input[@name='city']")
	WebElement citytb;
	@FindBy(xpath="//input[@name='state']")
    WebElement statetb;
	@FindBy(xpath="//input[@name='postcode']")
	WebElement postcodetb;
	@FindBy(xpath="//input[@name='country']")
	WebElement countrytb;
	@FindBy(xpath="//select[@name='company_status']")
	WebElement statusddl;
	
	
	@FindBy(xpath="(//input[@type='submit'])[3]")
	WebElement savebtn;
	
	public Companycombinedform()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Enterdataincombinedform(String cname,String industry,String annualrev,
			String emp,String category,String status,String priority,String source,String identifier,String vat,
			String phone,String fax,String website,String email,String symbol,
			String cleintname,String service,String tittle,String fname,
			String  middleinitial,String  surname,String suffix,String nickname,
			String position,String department,String supervisor,String  asscont,
			String reffered,String compcat,String compstatus,String tags,String contact,
			String mobile,String homephone,String confax,String contactemail,String msn,String network,
			String skypeid,String compsource,String comidentifier,String area,
			String addtittle,String type,String address,String city,String state,String postcode,String country  )
	
	    
	{
		companynametb.sendKeys(cname);
		industrytb.sendKeys(industry);
		annualrevenuetb.sendKeys(annualrev);
		noemptb.sendKeys(emp);
		categoryddl.sendKeys(category);
		statusddl.sendKeys(status);
		priorityddl.sendKeys(priority);
		sourceddl.sendKeys(source);
		companyidentifierddl.sendKeys(identifier);
		vatnumbertb.sendKeys(vat);
		companyphonetb.sendKeys(phone);
		comfaxtb.sendKeys(fax);
		websitetb.sendKeys(website);
		emailtb.sendKeys(email);
		symboltb.sendKeys(symbol);
		clientlookuptb.sendKeys(cleintname);
		servicetb.sendKeys(service);
		tittleddl.sendKeys(tittle);
		Firstnametb.sendKeys(fname);
		middleinitialtb.sendKeys(middleinitial);
		surnametb.sendKeys(surname);
		suffixtb.sendKeys(suffix);
		nicknametb.sendKeys(nickname);
		positiontb.sendKeys(position);
		departmenttb.sendKeys(department);
		supervisortb.sendKeys(supervisor);
		assistantcontactidtb.sendKeys(asscont);
		referredbytb.sendKeys(reffered);
		contcategoryddl.sendKeys(compcat);
		contstatusddl.sendKeys(compstatus);
		tagstb.sendKeys(tags);
		contacttb.sendKeys(contact);
		mobiletb.sendKeys(mobile);
		homephonetb.sendKeys(homephone);
		faxtb.sendKeys(confax);
		contactemailtb.sendKeys(contactemail);
		receiveemalradiobtn.click();
		allowcallradiobtn.click();
		msngrtb.sendKeys(msn);
		networkddl.sendKeys(network);
		skypeidtb.sendKeys(skypeid);
		consourceddl.sendKeys(compsource);
		conidentifiertb.sendKeys(comidentifier);
		textareatb.sendKeys(area);
		addresstitletb.sendKeys(addtittle);
		typeddl.sendKeys(type);
		addresstb.sendKeys(address);
		citytb.sendKeys(city);
		statetb.sendKeys(state);
		postcodetb.sendKeys(postcode);
		countrytb.sendKeys(country);
		
		
		
	}
}
	
	
	
	

