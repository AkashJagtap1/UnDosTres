package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.DeletePatientRecord;
import com.qa.pageLayer.FindPatientRecord;
import com.qa.pageLayer.HomePage;
import com.qa.testBase.TestBase;

public class DeleteRecordTest extends TestBase{

	@Test (priority=4)
	public void verifyRecordDelete () throws InterruptedException {
		HomePage home = new HomePage();
		home.clickOnFindPatient();
		Thread.sleep(2000);
				
		FindPatientRecord findPatient=new FindPatientRecord();
		findPatient.serachPatient();
		findPatient.clickOnPatientName();
		Thread.sleep(3000);
		
		 DeletePatientRecord deleteRecord=new DeletePatientRecord();
		deleteRecord.deletePatientRecord();
		deleteRecord.enterDeleteReason();
		Thread.sleep(5000);
		
		home.logoutBtn();
		Thread.sleep(2000);
	}
	
	
	
}
