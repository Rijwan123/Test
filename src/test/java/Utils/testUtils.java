package Utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest;

public class testUtils extends BaseTest{
	
	public void getScreenShot() throws IOException {
		
		Date currentDate= new Date();
    	
    	String screenshotFileName= currentDate.toString().replace(" ", "-").replace(":", "-");
    
    	File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(screenshotfile,new File(".//screenshot//"+screenshotFileName+".png"));
	}

}
