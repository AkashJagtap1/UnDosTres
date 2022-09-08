package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.BookAppointment;
import com.qa.pageLayer.FindPatientRecord;
import com.qa.pageLayer.HomePage;
import com.qa.testBase.TestBase;

public class BookAppointmentTest extends TestBase {

	@Test
	public void verifyPatientFinding () throws InterruptedException {
		HomePage home = new HomePage();
		home.clickOnFindPatient();
		Thread.sleep(3000);

		FindPatientRecord findPatient=new FindPatientRecord();
		findPatient.serachPatient();
		findPatient.clickOnPatientName();
		Thread.sleep(3000);

		BookAppointment book = new BookAppointment();
		book.bookAnAppointment();
		book.selectServiceType();
		Thread.sleep(3000);
		book.clickOnCheckbox();
		Thread.sleep(2000);
		book.clickOnSearchBtn();
		Thread.sleep(3000);

		home.logoutBtn();
		Thread.sleep(2000);
	}
}
