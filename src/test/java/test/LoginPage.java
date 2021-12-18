package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static String browser ="Chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
	          driver =new ChromeDriver();
		
		}
		if (browser.equals("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
	          driver =new FirefoxDriver();
			
	          
		}

//         driver.get("https://www.selenium.dev/documentation/en/getting_started_with_webdriver/");
//         driver.findElement(By.linkText("Quick tour")).click();
         
//         driver.get("https://www.selenium.dev/documentation/en/getting_started_with_webdriver/");
//         driver.findElement(By.partialLinkText("Quick")).click();
		
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//      driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
//      //driver.close();
         
//  For above()      
//		   driver.get("https://www.saucedemo.com/");
//         WebElement password = driver.findElement(By.id("password"));
//         driver.findElement(withTagName("input").above(password)).sendKeys("testing");
    
  // starts with             
//         driver.get("https://www.saucedemo.com/");
//         //WebElement password = driver.findElement(By.id("password"));
//         driver.findElement(By.xpath("//input[starts-with(@placeholder,\"Username\")]")).sendKeys("Testing");
//contains		
//		driver.get("https://developer.salesforce.com/signup");
//		driver.findElement(By.xpath("//input[contains(@name,\"first_name\")]")).sendKeys("testing");
//text();		
//		driver.get("https://developer.salesforce.com/signup");
//		driver.findElement(By.xpath("//a[text()=\" Terms of Use\"]")).click();
//and & OR		
//		driver.get("https://developer.salesforce.com/signup");
//		driver.findElement(By.xpath("//input[@type=\"text\" and @id=\"last_name\"]")).sendKeys("Shekh");
// css selector-by id		
//		driver.get("https://developer.salesforce.com/signup");
		//driver.findElement(By.cssSelector("input[name=\"user[first_name]\"]")).sendKeys("Testman");
//		driver.findElement(By.cssSelector("input#first_name")).sendKeys("Testman2");
// css selector -by class	
		driver.get("https://developer.salesforce.com/signup");
		driver.findElement(By.cssSelector("input.signup")).click();
	
	}

}
