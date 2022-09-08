package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.testBase.TestBase;

public class HomePage extends TestBase{

	public HomePage () {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy (linkText="Register a patient")
	private WebElement registerPatient;
	
	public void clickOnRegisterPatient () throws InterruptedException {
		registerPatient.click();
		Thread.sleep(2000);
	}
	
	@FindBy (linkText="Find Patient Record")
	private WebElement findPatient;
	
	public void clickOnFindPatient () throws InterruptedException {
		findPatient.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="//a[@href='/openmrs/appui/header/logout.action?successUrl=openmrs']")
	private WebElement logout;
	

	public void logoutBtn() throws InterruptedException {
		logout.click();
		Thread.sleep(2500);
	}
	
	
	
}
