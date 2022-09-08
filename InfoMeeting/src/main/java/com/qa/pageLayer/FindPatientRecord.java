package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class FindPatientRecord extends TestBase{

	public FindPatientRecord (){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//input[@id='patient-search']")
	private WebElement enterPatientName;
	
	public void serachPatient () throws InterruptedException {
		enterPatientName.click();
		enterPatientName.sendKeys("Akash Jagtap");
		Thread.sleep(2000);
	}
	
	@FindBy (xpath="//td[text()='Akash Jagtap']")
	private WebElement selectPatient;
	
	public void clickOnPatientName () throws InterruptedException {
		selectPatient.click();
		Thread.sleep(4000);
	}
}
