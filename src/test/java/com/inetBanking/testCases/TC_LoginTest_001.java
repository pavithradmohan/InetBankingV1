package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	
	@Test
	public void loginTest() throws IOException
	{
		
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		
		logger.info("Entered username");
		lp.setUserName(username);
		
		logger.info("Entered password");
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("GTPL Bank Home Page"))
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
		}
		else	
		{
			try {
				captureScreen(driver, "loginTest");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertTrue(false);
			logger.info("Test failed");
		}
	}

}
