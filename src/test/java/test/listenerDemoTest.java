package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class listenerDemoTest  extends BaseTest{

	@Test(retryAnalyzer = common.Retry.class)
	
	public void LaunchingApp() {
		
		driver.get("https://www.ebay.com");
		Assert.assertTrue(false);
	}
}
