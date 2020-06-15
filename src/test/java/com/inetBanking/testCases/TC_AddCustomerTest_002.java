package com.inetBanking.testCases;

import static org.testng.Assert.assertTrue;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.AddCustomerPage;
import com.inetBanking.pageObject.LoginPage;

public class TC_AddCustomerTest_002 extends BaseClass {

	
	@Test
	public void addNewCustomer() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.ClickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		addcust.custName("Linta");
		addcust.custGender("male");
		addcust.custdob("10", "15", "1985");
		Thread.sleep(3000);
		addcust.custAddress("India");
		addcust.custcity("Cochin");
		addcust.custstate("Kerala");
		addcust.custpinno("768899");
		addcust.custphoneno("45565763345");
		
		 String email = randomstring()+"@gmail.com";
		 addcust.custemailid(email);
		 addcust.custpassword("dfgfggg");
		 addcust.custsubmit();
		 Thread.sleep(3000);
		 boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

		 
		 
			
	}
	
	public String randomstring() {
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
		
	}
}
