package com.inetBanking.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;
import com.inetBanking.utilities.ReadConfig;



public class TC_LoginTest_001 extends BaseClass {
	
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	
	ReadConfig readconfig = new ReadConfig();
	
	

	@Test
	public void loginTest() {
		
		
		log.info("Driver is initiated");
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.ClickSubmit();
		driver.switchTo().alert().accept();
		log.info("alert accepted");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertFalse(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		
	}
}
	
