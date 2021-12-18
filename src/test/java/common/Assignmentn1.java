package common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentn1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		try {
			driver.get("https://www.google.com");
			
		}catch (Exception e) {
			System.out.println("Failed to open the link");
		}
		
		try {
			driver.findElement(By.name("q")).sendKeys("seleniumhq");
			driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
			
			
		}catch (Exception e) {
			System.out.println("Google Search button failed to run");
		}
		
		Thread.sleep(30000);
		
		 driver.findElement(By.xpath("//div[@role='navigation']//span[contains(text(),'Next')]")).click();
		 Thread.sleep(5000);
		 String content =driver.findElement(By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/span/span")).getText();
		
		 System.out.println(content);
		 
		 Thread.sleep(10000);
		 driver.close();
		
		 
//			
//		 System.out.println("Selenium (software) - Wikipedia website exist on page number "+i+" = "+ab);
//		 
//		
//			 
//			 System.out.println("Selenium (software) - Wikipedia website found on page number "+i );
//			 
//			 Thread.sleep(5000);
//			 
//			 String content = driver.findElement(By.xpath("//h3[contains(text(),'Selenium (software) - Wikipedia')]/../../../div[2]/span/span")).getText();
//			 
//			 System.out.println(content);
//			 
			
			 
//		 }else {
//			 System.out.println("Selenium (software) - Wikipedia website not found on page number "+i+" , Therefore move to next page" );
//			 driver.findElement(By.xpath("//div[@role='navigation']//span[contains(text(),'Next')]")).click();
//			 Thread.sleep(15000);
//			 
//		 }
	 }
			
   }
		



