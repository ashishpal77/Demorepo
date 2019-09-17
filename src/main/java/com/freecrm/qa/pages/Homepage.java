package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class Homepage extends Testbase {
	//pagefactory--OR
   @FindBy(xpath="//td[contains(text(),'Naveen AutomationLabs')]")
   WebElement usernamelabellink;
   @FindBy(xpath="//a[contains(.,'Companies')]")
   WebElement companieslink;
   @FindBy(xpath="//a[contains(text(),'Contacts')]")
   WebElement contanctslink;
   @FindBy(xpath="//a[contains(.,'Deals')]")
   WebElement dealslink;
   @FindBy(xpath="//a[contains(.,'Tasks')]")
   WebElement tasklink;
   @FindBy(xpath="//a[contains(text(),'Cases')]")
   WebElement caselink;
   @FindBy(xpath="(//a[contains(.,'Call')])[1]")
   WebElement calllink;
   @FindBy(xpath="(//a[contains(.,'Email')])[1]")
   WebElement emaillink;
   @FindBy(xpath="(//a[contains(@title,'Text/SMS')])[1]")
   WebElement textsmslink;
   @FindBy(xpath="(//a[contains(@title,'Campaigns')])[1]")
   WebElement campagnslink;
   @FindBy(xpath="//a[contains(text(),'New Company')]")
   WebElement ncompany;
   @FindBy(xpath="(//a[contains(.,'Combined Form')])[1]")
   WebElement ncomcombinedform;
   @FindBy(xpath="(//a[contains(.,'Companie')])[1]")
   WebElement company;
   @FindBy(xpath="(//a[contains(.,'Full Search Form')])[1]")
   WebElement companyfullsearchlink;
   @FindBy(xpath="//a[contains(.,'New Contact')]")
   WebElement newcontactlink;
   @FindBy(xpath="(//a[contains(text(),'Combined Form')])[2]")
   WebElement contactcombinedformlink;
   @FindBy(xpath="(//a[contains(text(),'Full Search Form')])[2]")
   WebElement contactfullsearchformlink;
   @FindBy(xpath="//a[contains(text(),'New Deal')]")
   WebElement newdeallink;
   @FindBy(xpath="(//a[contains(text(),'Products')])[1]")
   WebElement productslink;
   @FindBy(xpath="(//a[contains(text(),'Full Search Form')])[3]")
   WebElement dealfullsearchlink;
   @FindBy(xpath="//a[contains(text(),'New Task')]")
   WebElement newtasklink;
   @FindBy(xpath="(//a[contains(text(),'Full Search Form')])[4]")
   WebElement newtaskfullsearchlink;
   @FindBy(xpath="//a[contains(text(),'New Case')]")
   WebElement newcaselink;
   @FindBy(xpath="(//a[contains(text(),'Full Search Form')])[5]")
   WebElement casefullsearchlink;
   @FindBy(xpath="//a[contains(text(),'New Call')]")
   WebElement newcalllink;
   @FindBy(xpath="//a[contains(text(),'Call Scripts')]")
   WebElement callscriptlink;
   @FindBy(xpath="(//a[contains(text(),'Call List')])[1]")
   WebElement calllistlink;
   @FindBy(xpath="(//a[contains(text(),'New Email Campaign')])[1]")
   WebElement newemailcampaignlink;
   @FindBy(xpath="(//a[contains(text(),'Email Templates')])[1]")
   WebElement emailtemplatelink;
   @FindBy(xpath="(//a[contains(text(),'Mail Accounts')])[1]")
   WebElement mailaccountslink;
   @FindBy(xpath="//a[contains(text(),'Customize Email Content')]")
   WebElement customizeemailcontentlink;
   @FindBy(xpath="(//a[contains(text(),'Email Signature')])[1]")
   WebElement emailsignaturelink;
   @FindBy(xpath="(//a[contains(text(),'New Text/SMS Campaign')])[1]")
   WebElement ntsmscampaignlink;
   @FindBy(xpath="(//a[contains(text(),'Text/SMS Templates')])[1]")
   WebElement testsmstemplateslink;
   @FindBy(xpath="(//a[contains(text(),'Text/SMS Credits')])[1]")
   WebElement textsmscreditlink;
   
 //intialize page objects
   public Homepage()
   {
	   PageFactory.initElements(driver, this);
   }
   
   public String verifyhomepagetittle()
   {
	   return driver.getTitle();
   }
   
   public Companypage clickoncompanypage()
   {
	   companieslink.click();
	   return new Companypage();
   }
   
   public Contactspage clickoncontactcspage()
   {
	   contanctslink.click();
	   return new Contactspage();
   }
   public boolean verifyusernamelabel()
   {
	   return usernamelabellink.isDisplayed();
   }
   
   public Dealspage clickondelaspage()
   {
	  dealslink.click();
      return new Dealspage();	   
   }
   
   public Taskpage clickontaskpage()
   {
	   tasklink.click();
	   return new Taskpage();
   }
   public Casespage clickoncasespage()
   {
	   caselink.click();
	   return new  Casespage();
   }
   
   public Callpage clickoncallpage()
   {
	   calllink.click();
	   return new Callpage();
   }
   
   public Emailpage clickonemailpage()
   {
	   emaillink.click();
	   return new Emailpage();
   }
   public Textsmspage clickontextsmspage()
   {
	   textsmslink.click();
	   return new Textsmspage();
	}
   public Campaignpage clickoncampaignpage()
   {
	   campagnslink.click();
	   return new Campaignpage();
   }
   public Newcompanypage cliconewcompanypage()
   {
	   ncompany.click();
	   return new Newcompanypage();
   }
  public Companycombinedform clickoncombinedpage()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(company).build().perform();
	   ncomcombinedform.click();
	   return new Companycombinedform();
   }
   public Companyfullsearchform clickoncompanyfullsearchform()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(company).build().perform();
	   companyfullsearchlink.click();
	   return new Companyfullsearchform();
   }
   public Newcontactpage newcontactlinks()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(contanctslink).build().perform();
	   newcontactlink.click();
	   return new Newcontactpage();
	   
   }
   public Contactcombinedformpage newcontactcombinedform()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(contanctslink).build().perform();
	   contactcombinedformlink.click();
	   return new Contactcombinedformpage();
	   
   }
   public Contactfullsearchform newcontactfullsearchform()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(contanctslink).build().perform();
	   contactfullsearchformlink.click();
	   return new Contactfullsearchform();
	   
   }
   
   public Dealspage verifynewdeallink()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(dealslink).build().perform();
	   newdeallink.click();
	   return new Dealspage();  
	   
   }
   
   public Productspage verifyproductlink()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(dealslink).build().perform();
	   productslink.click();
	   return new Productspage();  
	   
   }
   
   public Dealfullsearchpage verifydealfullsearchlink()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(dealslink).build().perform();
	   dealfullsearchlink.click();
	   return new Dealfullsearchpage();
   }
   public Newtaskpage verifynewtasklink()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(tasklink).build().perform();
	   newtasklink.click();
	   return new Newtaskpage();
   }
   public Taskfullsearchform verifynewteaskfullsearcgform()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(tasklink).build().perform();
	   newtaskfullsearchlink.click();
	   return new Taskfullsearchform();
   }
   
   public Newcasepage clickonnewcase()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(caselink).build().perform();
	   newcaselink.click();
	   return new Newcasepage(); 
   }
   public Casefullsearchpage clickoncasefullsearch()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(caselink).build().perform();
	   casefullsearchlink.click();
	   return new Casefullsearchpage(); 
	   
   }
   public Newcallpage clickonnewcallpage()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(calllink).build().perform();
	   newcalllink.click();
	   return new Newcallpage(); 
   }
   
   public Callscriptpage clickoncallscriptspage()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(calllink).build().perform();
	   callscriptlink.click();
	   return new Callscriptpage(); 
   }
   
   
   public Calllistpage clickoncalllistpage()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(calllink).build().perform();
	   calllistlink.click();
	   return new Calllistpage();  
	}
   
   public Newemailcampaignpage clickonnewemailcampaignlink()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(emaillink).build().perform();
	   newemailcampaignlink.click();
	   return new Newemailcampaignpage();   
	}
   
   
   public Emailtemplatepage clickonemailtemplate()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(emaillink).build().perform();
	   emailtemplatelink.click();
	   return new Emailtemplatepage();
	   
   }
   
   public Mailaccountpage clickonmailaccountlink()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(emaillink).build().perform();
	   mailaccountslink.click();
	   return new Mailaccountpage(); 
   }
   
   public Customizemailpage clcikoncustomizeemaillink()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(emaillink).build().perform();
	   customizeemailcontentlink.click();
	   return new Customizemailpage();
	   
   }
   public Emailsignaturepage clickonemailsignaturelink()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(emaillink).build().perform();
	   emailsignaturelink.click();
	   return new Emailsignaturepage();
	   
   }
   
   public Textsmscampaignpage clickonnewtextsmscampaign()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(textsmslink).build().perform();
	   ntsmscampaignlink.click();
	   return new Textsmscampaignpage();
	   
	   
   }
   
   public Textsmstemplatepage clickontextsmstemplatelink()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(textsmslink).build().perform();
	   testsmstemplateslink.click();
	   return new Textsmstemplatepage();
	   
   }
   
   
   public Textsmscreditpage clickontextsmscredits()
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(textsmslink).build().perform();
	   textsmscreditlink.click();
	   return new Textsmscreditpage();
	   
   }
}

