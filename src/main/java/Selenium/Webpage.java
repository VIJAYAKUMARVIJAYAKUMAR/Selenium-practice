package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {
	public static void main (String[]arg ) {
		 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		
		driver.get("https://demo.guru99.com/test/upload");
		
		WebElement uploadfile = driver.findElement(By.id("uploadfile_0"));
		uploadfile.sendKeys("C:\\Users\\hipl\\eclipse-workspace\\Mavenpractice\\src\\main\\java\\Selenium\\Text");
		
		
		
		
		
		
		
		
		
		
				
				
				
		
		
	}
	

}
