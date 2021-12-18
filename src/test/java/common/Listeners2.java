package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utils.testUtils;

public class Listeners2 extends testUtils implements ITestListener {
	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		 System.out.println(" Test case is starting.....!!");
	}
	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test failed-screenshot Captured");
		try {
			getScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
