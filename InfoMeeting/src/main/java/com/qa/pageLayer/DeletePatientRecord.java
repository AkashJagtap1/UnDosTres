package com.qa.pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class DeletePatientRecord extends TestBase{

	public DeletePatientRecord() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@id='org.openmrs.module.coreapps.deletePatient']")
	private WebElement deleteRecord;

	public void deletePatientRecord () throws InterruptedException {
		deleteRecord.click();
		Thread.sleep(3000);
	}

	@FindBy (xpath="//input[@id='delete-reason']")
	private WebElement deleteReason;

	public void enterDeleteReason () {
		deleteReason.click();
		deleteReason.sendKeys("cured"+Keys.TAB+Keys.ENTER);
		
	}



}
