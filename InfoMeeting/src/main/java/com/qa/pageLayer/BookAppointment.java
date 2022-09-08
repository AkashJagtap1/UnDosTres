package com.qa.pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class BookAppointment extends TestBase {

	public BookAppointment (){
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@class='right']")
	private WebElement appointmentBooking;

	public void bookAnAppointment () throws InterruptedException {
		appointmentBooking.click();
		Thread.sleep(2000);

	}

	@FindBy (xpath="//input[@ng-model='appointmentType']")
	private WebElement selectService;

	public void selectServiceType () {
		selectService.click();
		selectService.sendKeys("General Medicine"+ Keys.TAB+Keys.ENTER);


	}

	@FindBy(xpath="//input[@class='ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched']")
	private WebElement checkbox;

	public void clickOnCheckbox () {
		checkbox.click();
	}

	@FindBy(xpath="//button[@class='confirm']")
	private WebElement search_Btn;

	public void clickOnSearchBtn() throws InterruptedException {
		search_Btn.click();
		Thread.sleep(2000);
	}

}
