package common;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment {

	
	public static String browser="chrome";
	
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flightradar24.com/data/airports/pnq");
		//driver.findElement(By.xpath("//*[@id=\"cnt-data-content\"]/div/div[2]/div/aside[1]/div[1]/label/a")).click();
		
		String delhi=driver.findElement(By.xpath("//*[@id=\"cnt-data-content\"]/div/div[2]/div/aside[1]/div[1]/table/tbody/tr[15]/td[3]/div[1]/span")).getText();
		String status1= driver.findElement(By.xpath("//*[@id=\"cnt-data-content\"]/div/div[2]/div/aside[1]/div[1]/table/tbody/tr[15]/td[7]/span")).getText();
		
		System.out.println(delhi +" : "+status1);
	}
}
