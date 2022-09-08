package com.qa.testLayer;

import org.testng.annotations.Test;


import com.qa.pageLayer.FindPatientRecord;
import com.qa.pageLayer.HomePage;
import com.qa.testBase.TestBase;

public class FindPatientRecordTest extends TestBase{

	@Test (priority=2)
	public void verifyPatientFinding () throws InterruptedException {
		HomePage home = new HomePage();
		home.clickOnFindPatient();
		Thread.sleep(3000);

		FindPatientRecord findPatient=new FindPatientRecord();
		findPatient.serachPatient();
		findPatient.clickOnPatientName();
		Thread.sleep(3000);

		home.logoutBtn();
		Thread.sleep(2000);
	}


}
