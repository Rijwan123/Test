package test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingScreenshotsDemo {
	
	
    public static void main(String[] args) throws IOException {
    	
    	Date currentDate= new Date();
    	System.out.println(currentDate);
    	String screenshotFileName= currentDate.toString().replace(" ", "-").replace(":", "-");
    	System.out.println(screenshotFileName);
    	
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("http://www.ebay.com");
    	
    	File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(screenshotfile,new File(".//screenshot//"+screenshotFileName+".png"));
    	
    	
    }
}
