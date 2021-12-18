package common;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assignment1 {
	
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
			Thread.sleep(5000);
			driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
			
		}catch (Exception e) {
			System.out.println("Google Search button failed to run");
		}
		
		Thread.sleep(30000);
		
		for(int i=1;i<11;i++) 
		{
		 int ab = driver.findElements(By.xpath("//a[@href='https://en.wikipedia.org/wiki/Selenium_(software)']//h3[contains(text(),'Selenium (software) - Wikipedia')]")).size();
		 int indigoCount =driver.findElements(By.xpath("//span[@class='font14 padL5 black' and contains(text(),'IndiGo')]")).size(); 
		 
		 String xy="";
		 
		 if(ab == 1) {
			  xy="true";
		 }else {
			 
			 xy="False";
		 }
		 
		 System.out.println("Selenium (software) - Wikipedia website exist on page number "+i+" = "+xy);
		 
		 if (ab == 1) {
			 
			 System.out.println("Selenium (software) - Wikipedia website found on page number "+i );
			 Thread.sleep(10000);
			 
			 //String content =driver.findElement(By.xpath("//a[@href='https://en.wikipedia.org/wiki/Selenium_(software)']//h3[contains(text(),'Selenium (software) - Wikipedia')]/../../../div[2]/span/span")).getText();
			 String content =driver.findElement(By.xpath("//h3[contains(text(),'Selenium (software) - Wikipedia')]/../../../div[2]/div/span")).getText();
			                                             
			 System.out.println(content);
			 
			 break;
			 
			 
			 
		 }else {
			 System.out.println("Selenium (software) - Wikipedia website not found on page number "+i+" , Therefore move to next page" );
			 driver.findElement(By.xpath("//div[@role='navigation']//span[contains(text(),'Next')]")).click();
			 Thread.sleep(5000);
			 
		 }
	   }
		
		driver.close();
			
   }
		
}



