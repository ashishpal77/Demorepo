package com.freecrm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.freecrm.qa.utility.Testutil;

public class Testbase {
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * /
	 */
	
public static WebDriver driver;
public 	static Properties prop;
public 	static FileInputStream ip;
	
	public Testbase()
	{
		 prop=new Properties();
	//	FileInputStream ip=new FileInputStream("E:/seleniumproject/mvnproject/src/test/java/testcase/config.properties");
		
		try {
			ip = new FileInputStream("E:/seleniumproject/Freecrmtest/src/main/java/com/freecrm/qa/config/config.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	public static void Initialization()
	{
		String browsername=prop.getProperty("browser");
		System.out.println(browsername);
		String geturl=prop.getProperty("url");
		System.out.println(geturl);
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(geturl);
		
		
	}
	

}
