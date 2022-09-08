package com.qa.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


import com.qa.pageLayer.BookAppointment;
import com.qa.pageLayer.DeletePatientRecord;
import com.qa.pageLayer.FindPatientRecord;
import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static LoginPage login;
	public static HomePage home;
	public static BookAppointment book;
	public static FindPatientRecord findPatient;
	public static DeletePatientRecord deleteRecord;
	
	@BeforeMethod
	public void setUp()
	{
		String br= "chrome";
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("This is not the correct browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.openmrs.org/openmrs/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		login= new LoginPage ();
		login.enterUsername();
		login.enterPassword();
		login.selectLocation();
		login.clickOnLoginBtn();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
