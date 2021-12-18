package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;
import net.bytebuddy.asm.Advice.Return;

public class Example1 {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	
     ChromeDriver driver= new ChromeDriver();
     
     driver.get("http://www.google.com");
    
     
     //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     @SuppressWarnings("deprecation")
	WebDriverWait wait= new WebDriverWait(driver, 10);
     
//     wait.until(ExpectedCondition.VisibilityToElementLocated.(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3")));
//     
//     
//   WebElement =driver.findElements(By.xpath("//h3"));
     
     driver.findElement(By.name("q")).sendKeys("Selenium");
     driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
     

	}

}
