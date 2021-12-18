package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utils.testUtils;

import java.io.IOException;

import org.testng.ITestContext;

public class Listeners implements ITestListener{

	
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case is starting");
	}
	
	public void onTestFailure(ITestResult result) {
			
	    System.out.println("Test failed - screenshot captured");
	    
    }
}
