package com.freecrm.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Contactcombinedformpage extends Testbase {
	
	//pagefactory
	
	@FindBy(xpath="//input[@name='company_name']")
	WebElement companynametb;
	@FindBy(xpath="//input[@name='industry']")
	WebElement industrytb;
	@FindBy(xpath="//input[@name='annual_revenue']")
	WebElement annualrevenuetb;
	@FindBy(xpath="//input[@name='num_of_employees']")
	WebElement employeetb;
	@FindBy(xpath="//select[@name='category']")
	WebElement categoryddl;
	@FindBy(xpath="//select[@name='company_status']")
	WebElement statusddl;
	@FindBy(xpath="//select[@name='priority']")
    WebElement priorityddl;
	@FindBy(xpath="(//select[@name='source'])[1]")
	WebElement sourceddl;
	@FindBy(xpath="//input[@name='company_identifier']")
	WebElement identifiertb;
	@FindBy(xpath="//input[@name='vat_number']")
	WebElement vattb;
	@FindBy(xpath="//input[@name='company_phone']")
	WebElement phonetb;
	@FindBy(xpath="//input[@name='company_fax']")
	WebElement faxtb;
	@FindBy(xpath="//input[@name='website']")
	WebElement websitetb;
	@FindBy(xpath="//input[@name='company_email']")
	WebElement emailtb;
	@FindBy(xpath="//input[@name='symbol']")
	WebElement symboltb;
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement parentcompanytb;
	@FindBy(xpath="//textarea[@name='service']")
	WebElement servicetb;
	@FindBy(xpath="//select[@name='title']")
	WebElement tittleddl;
	@FindBy(xpath="//input[@name='first_name']")
	WebElement fnametb;
	@FindBy(xpath="//input[@name='middle_initial']")
	WebElement middlennametb;
	@FindBy(xpath="//input[@name='surname']")
	WebElement surnametb;
	@FindBy(xpath="//select[@name='suffix']")
	WebElement suffixddl;
	@FindBy(xpath="//input[@name='contact_nickname']")
	WebElement nicknametb;
	@FindBy(xpath="//input[@name='company_position']")
	WebElement positiontb;
	@FindBy(xpath="//input[@name='department']")
	WebElement departmenttb;
	@FindBy(xpath="(//input[contains(@type,'button')])[10]")
	WebElement button;
	@FindBy(xpath="//input[@name='search']")
	WebElement searchbox;
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	@FindBy(xpath="//a[contains(.,'ABC XYZ')]")
	WebElement selectvalue;
	@FindBy(xpath="//input[@name='supervisor_contact_id']")
//	driver.executescript("arguments[0].click();", element)
	WebElement supervisortb;
	@FindBy(xpath="//input[@name='lookup_updated_assist']")
	WebElement asssistanttb;
	@FindBy(xpath="//input[@name='contact_lookup_ref']")
	WebElement reftb;
	@FindBy(xpath="//select[@name='contact_category']")
	WebElement caregoryddl;
	@FindBy(xpath="//select[@name='contact_status']")
	WebElement contactstatusddl;
	@FindBy(xpath="//input[@name='tags']")
	WebElement tagstb;
	@FindBy(xpath="//input[@name='contact_phone']")
	WebElement contactphonetb;
	@FindBy(xpath="//input[@name='mobile']")
	WebElement contactmobiletb;
	@FindBy(xpath="//input[@name='home_phone']")
	WebElement contacthphonetb;
	@FindBy(xpath="//input[@name='contact_fax']")
	WebElement contactfaxtb;
	@FindBy(xpath="//input[@name='contact_email']")
	WebElement contactemailtb;
	@FindBy(xpath="//input[@name='contact_email_alt']")
	WebElement altemailtb;
	@FindBy(xpath="//input[@name='im_id']")
	WebElement msntb;
	@FindBy(xpath="//select[@name='im_netowrk']")
	WebElement imnetworkddl;
	@FindBy(xpath="//input[@name='skype_id']")
	WebElement skypeidtb;
	@FindBy(xpath="(//select[@name='source'])[2]")
	WebElement contactsourceddl;
	@FindBy(xpath="//input[@name='contact_identifier']")
	WebElement contactidetifiertb;
	@FindBy(xpath="//textarea[@name='description']")
	WebElement descriptiontb;
	@FindBy(xpath="//input[@name='address_title']")
	WebElement addresstittletb;
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
	@FindBy(xpath="//input[@name='birthday']")
	WebElement date;
	@FindBy(xpath="(//input[@type='submit'])[3]")
	WebElement savebtn;
	
	public Contactcombinedformpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonbutton()
	{
		
		
		
	}
	
	public void entercontactcombineddetail(String cname,String indname,String annrev,String emp,String cat,String status,
			String priority,String source,String identifier,String vat,String phone,String fax,String website,String email
			,String symbol,String pcom,String service,String tittle,String firstname,String middlename,String surname,
			String suffix,String nickname,String position,String department,String supervisor,String assistant,String reff,
			String category,String contactstatus,String tag,String conphone,String contmobile,String contphone,String  contfax,
			String contemail,String altemail,String msn,String imnetwork,String skype,String contsource,String contidentifier,
			String description,String addtittle,String address,String city,String state,String pcode,String country )
	{
		
		 
		companynametb.sendKeys(cname);
		industrytb.sendKeys(indname);
		annualrevenuetb.sendKeys(annrev);
		employeetb.sendKeys(emp);
		categoryddl.sendKeys(cat);
		statusddl.sendKeys(status);
		priorityddl.sendKeys(priority);
		sourceddl.sendKeys(source);
		identifiertb.sendKeys(identifier);
		vattb.sendKeys(vat);
		phonetb.sendKeys(phone);
		faxtb.sendKeys(fax);
		websitetb.sendKeys(website);
		emailtb.sendKeys(email);
		symboltb.sendKeys(symbol);
		parentcompanytb.sendKeys(pcom);
		servicetb.sendKeys(service);
		tittleddl.sendKeys(tittle);
		fnametb.sendKeys(firstname);
		middlennametb.sendKeys(middlename);
		surnametb.sendKeys(surname);
		suffixddl.sendKeys(suffix);
		nicknametb.sendKeys(nickname);
		positiontb.sendKeys(position);
		departmenttb.sendKeys(department);
	//	button.click();
	//	Set<String> handler=driver.getWindowHandles();
	//	Iterator<String> it=handler.iterator();
	//	String parent=it.next();
	//	System.out.println(parent);
	//	String child=it.next();
	//	System.out.println(child);
	//	driver.switchTo().window(child);
	//	searchbox.sendKeys("a");
	//	submit.click();
	//	selectvalue.click();
	//	driver.navigate().back();
	//	supervisortb.sendKeys(supervisor);
		//driver.close();
		//driver.navigate().back();
	//	driver.switchTo().window(parent);
	//	button.click();
	//	Set<String> handler1=driver.getWindowHandles();
	//	Iterator<String> it1=handler1.iterator();
	//	String parent1=it1.next();
	//	System.out.println(parent);
	//	String child1=it1.next();
	//	System.out.println(child1);
	//	driver.switchTo().window(child1);
	//	searchbox.sendKeys("a");
	//	submit.click();
	//	selectvalue.click();
	//	asssistanttb.sendKeys(assistant);
	//	reftb.sendKeys(reff);
		caregoryddl.sendKeys(category);
		contactstatusddl.sendKeys(contactstatus);
		tagstb.sendKeys(tag);
		contactphonetb.sendKeys(conphone);
		contactmobiletb.sendKeys(contmobile);
		contacthphonetb.sendKeys(contphone);
		contactfaxtb.sendKeys(contfax);
		contactemailtb.sendKeys(contemail);
		altemailtb.sendKeys(altemail);
		msntb.sendKeys(msn);
		imnetworkddl.sendKeys(imnetwork);
		skypeidtb.sendKeys(skype);
		contactsourceddl.sendKeys(contsource);
		contactidetifiertb.sendKeys(contidentifier);
		descriptiontb.sendKeys(description);
		addresstittletb.sendKeys(addtittle);
		addresstb.sendKeys(address);
		citytb.sendKeys(city);
		statetb.sendKeys(state);
		postcodetb.sendKeys(pcode);
		countrytb.sendKeys(country);
		savebtn.click();
	
	}
	
}
