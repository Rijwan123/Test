package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
//	@BeforeTest
//	public void loginToApplication() {
//		
//		System.out.println("Login to Application");
//		
//	}
//	@AfterTest
//      public void logoutFromApplication() {
//		
//		System.out.println("Logout from Application");
//		
//	}
	
	
	
	@BeforeMethod
	public void connectToDB() {
	    System.out.println("DB Connected");
	}
	
	@AfterMethod
	public void DisconnectFromDB() {
		System.out.println("DB DisConnected");
		
	}
	
	

	@Test(priority = 1,description = "This is login Test",groups = "regression")
	public void blogin() {
		
		
		System.out.println("Login is successful");
	}
	
	@Test(priority = 2,description = "This is logout test")
    public void alogout() {
		
		
		System.out.println("Logout is successful");
	}
}
