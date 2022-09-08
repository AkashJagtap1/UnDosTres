package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.testBase.TestBase;

public class UtilClass extends TestBase{

	public static void takeSS (String name) {
		
		try {
			TakesScreenshot ss = (TakesScreenshot)driver ;
			File src = ss.getScreenshotAs(OutputType.FILE);
			String path="D:\\AKASH JAGTAP\\VelocityTraining\\Setups\\UndosTres\\LocalRepo\\UnDosTres\\InfoMeeting\\Screenshots\\";
			File des = new File (path+name+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e) {
			System.out.println("Please provide correcct path");
		}
	}
}
