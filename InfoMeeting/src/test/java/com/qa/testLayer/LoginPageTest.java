package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;

public class LoginPageTest extends TestBase {

	
	@Test
	public void verifyloginPageTest () throws InterruptedException {
		LoginPage login = new LoginPage ();
		login.enterUsername();
		login.enterPassword();
		login.selectLocation();
		login.clickOnLoginBtn();
		Thread.sleep(3000);
	}
	
	
	
}
