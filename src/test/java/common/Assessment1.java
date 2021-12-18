package common;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.matcher.EqualityMatcher;

public class Assessment1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		try {
			driver.get("https://www.google.com");
		} catch (Exception e) {
			System.out.println("Failed to open the link");
		}
		try {
			driver.findElement(By.name("q")).sendKeys("seleniumhq");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		}catch (Exception a) {
			System.out.println("Google Search button failed to run");
		}
			
		   Thread.sleep(30000);
     
			for (int i = 1; i < 11; i++) 
			{
			  boolean ab = driver.findElement(By.xpath("//h3[contains(text(),'Selenium (software) - Wikipedia')]")).isDisplayed();
			
			  System.out.println(" Selenium (software) - Wikipedia exist on page number "+i+" = "+ab);

				if (ab == true) {
                    
					System.out.println("Selenium (software) - Wikipedia website found on page number " + i);
					Thread.sleep(5000);
					String content = driver.findElement(By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[7]/div/div/div[2]/span/span")).getText();
					System.out.println(content);
					break;
				} else {
					System.out.println("Selenium (software) - Wikipedia not found on page number "+i+", Therefore move to next page  ");
					driver.findElement(By.xpath("//div[@role='navigation']//span[contains(text(),'Next')]")).click();

				}
			}
     
	}
}
