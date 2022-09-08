package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase {

	
	public LoginPage (){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement username;
	
	public void enterUsername()	{
		username.click();
		username.sendKeys("Admin");
		
	}
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement password;
	
	public void enterPassword() {
		password.click();
		password.sendKeys("Admin123");
		
	}
	
	@FindBy(xpath="//li[text()='Inpatient Ward']")
	private WebElement location;
	
	public void selectLocation() {
		location.click();
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement login_btn;
	
	public void clickOnLoginBtn() {
		login_btn.click();
	
	}
	
}
