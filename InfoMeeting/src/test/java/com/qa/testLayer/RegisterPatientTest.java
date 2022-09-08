package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.RegisterPatient;
import com.qa.testBase.TestBase;

public class RegisterPatientTest extends TestBase  {
	@Test (priority=1)
	public void verifyPatientRegistering () throws InterruptedException {
		HomePage home = new HomePage();
		home.clickOnRegisterPatient();
		Thread.sleep(2000);
			
		RegisterPatient register = new RegisterPatient ();
		register.enterFirstName();
		register.enterLastName();
		register.clickOnNextBtn();
		Thread.sleep(2000);
		
		register.selectGender();
		register.clickOnNextBtn();
		Thread.sleep(2000);
		
		register.enterBirthDate();
		register.selectBirthMonth();
		register.enterBirthYear();
		register.clickOnNextBtn();
		Thread.sleep(2000);
		
		register.enterCityName();
		register.enterstateName();
		register.enterCountryName();
		register.enterPostalCode();
		register.clickOnNextBtn();
		Thread.sleep(2000);
		
		register.enterPhoneNo();
		register.clickOnNextBtn();
		Thread.sleep(2000);
		
		register.selectRelationship();
		register.enterRelativeName();
		register.clickOnNextBtn();
		Thread.sleep(2000);
		
		register.clickOnConfirmBtn();
		Thread.sleep(5000);
		
		home.logoutBtn();
		Thread.sleep(3000);
	}
}
