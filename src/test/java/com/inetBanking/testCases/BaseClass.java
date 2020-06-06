package com.inetBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;
import com.sun.tools.sjavac.Log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	ReadConfig readconfig = new ReadConfig();
	public String baseURL= readconfig.getApplicationURL();
	
	public static WebDriver driver;
	
	
	
	@Parameters("browser")
	@BeforeClass
	public void setupClass(String br)
	{   
		if(br.equals("chrome")) 
		{
			
		  System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		  driver=new ChromeDriver();
		  log.info("chrome browser");
		  
		 	  
		 
		}
		
		else if(br.equals("ie")){
			System.setProperty("webdriver.ie.driver", readconfig.getIEPath());
			driver=new InternetExplorerDriver();
			
		}
		driver.get(baseURL);
				
				
         
	}
	

}
