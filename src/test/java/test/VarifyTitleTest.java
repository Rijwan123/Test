package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VarifyTitleTest {
	@Test
	public void titleTest() {
		SoftAssert softassert =new SoftAssert();
		String expectedtitle = "adfzfdsElectronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedText= "asSearch";
		 WebDriverManager.chromedriver().setup();
         WebDriver driver =new ChromeDriver();
         driver.get("https://www.ebay.com/");
         String actualTitle = driver.getTitle();
         
         System.out.println(actualTitle);
         
         softassert.assertEquals(actualTitle, expectedtitle,"Title varification failed");
        
        String actualText= driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
        System.out.println(actualText);
        
        softassert.assertEquals(actualText, expectedText,"Text varification failed");
        
        System.out.println("Closing browser");
        driver.close();
        softassert.assertAll();
      
	}

}
