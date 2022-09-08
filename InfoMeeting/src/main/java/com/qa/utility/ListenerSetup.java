package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test execution has been started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case failed");
		UtilClass.takeSS(result.getName()+System.currentTimeMillis());
		System.out.println("Screenshot Taken");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test case skipped");
	}


	@Override
	public void onStart(ITestContext context) {
	
		System.out.println("Test execution started");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Test execution completed");
	}

}
