package test;

import org.apache.hc.core5.http.io.entity.ByteArrayEntity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProvider2 {
	
	@org.testng.annotations.Test(dataProvider = "create")
	
	public void Test(String usrname, String password)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(usrname);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
	    
		driver.close();
	}
	
	@DataProvider(name ="create")
	public Object[][] dataSet() {
		return new Object[][] 
	    {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
			
		};
	}
	

}