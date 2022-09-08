package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testBase.TestBase;

public class RegisterPatient extends TestBase {

	public RegisterPatient (){
		PageFactory.initElements(driver,this);
	}
		// Demographics- Name
	@FindBy (xpath="//input[@name='givenName']")
	private WebElement firstName;
	
	public void enterFirstName () {
		firstName.click();
		firstName.sendKeys("Akash");
		
	}
	@FindBy (xpath="//input[@name='familyName']")
	private WebElement lastName;
	
	public void enterLastName () {
		lastName.click();
		lastName.sendKeys("Jagtap");
		
	}
	
	@FindBy (xpath="//button[@class='confirm right']")
	private WebElement nextButton;
	
	public void clickOnNextBtn () {
		nextButton.click();
	}
	
	// Demographics- Gender
	
	@FindBy (id="gender-field")
	private WebElement gender;
	
	public void selectGender() {
		
	Select select=new Select (gender);
	select.selectByVisibleText("Male");

	}

	// Demographics- BirthDate
	@FindBy(xpath="//input[@name='birthdateDay']")
	private WebElement birth_date;
	
	public void enterBirthDate() {
		birth_date.click();
		birth_date.sendKeys("29");
		
	}
	
	@FindBy (id="birthdateMonth-field")
	private WebElement birth_Month;
	
	public void selectBirthMonth() {
		
	Select select=new Select (birth_Month);
	select.selectByVisibleText("October");

	}
	
	@FindBy (xpath="//input[@name='birthdateYear']")
	private WebElement birth_year;
	
	public void enterBirthYear () {
		birth_year.click();
		birth_year.sendKeys("1991");
	}
	
	
	//Contact Info- Address
	
	@FindBy(xpath="//input[@name='cityVillage']")
	private WebElement cityName;
	
	public void enterCityName() {
		cityName.click();
		cityName.sendKeys("Ichalkaranji");
		
	}
	
	@FindBy(xpath="//input[@name='stateProvince']")
	private WebElement stateName;
	
	public void enterstateName() {
		stateName.click();
		stateName.sendKeys("Maharashtra");
	}
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement countryName;
	
	public void enterCountryName() {
		countryName.click();
		countryName.sendKeys("India");
	}
	
	@FindBy(xpath="//input[@name='postalCode']")
	private WebElement postalCode;
	
	public void enterPostalCode() {
		postalCode.click();
		postalCode.sendKeys("416115");
	}
	
	//Contact Info- Address
	@FindBy(xpath="//input[@name='phoneNumber']")
	private WebElement phoneNo;
	
	public void enterPhoneNo() {
		phoneNo.click();
		phoneNo.sendKeys("+91 8180079615");
	}
	
	//relationships-Relative
	
	@FindBy (id="relationship_type")
	private WebElement select_relationship;
	
	public void selectRelationship() {
		
	Select select=new Select (select_relationship);
	select.selectByVisibleText("Sibling");

	}
	
	@FindBy (xpath="//input[@placeholder='Person Name']")
	private WebElement relative_name;
	
	public void enterRelativeName () {
		relative_name.click();
		relative_name.sendKeys("Akshay Jagtap");
	}
	
	//Confirm
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement confirm_Btn;
	
	public void clickOnConfirmBtn() {
		confirm_Btn.click();
	}
}
