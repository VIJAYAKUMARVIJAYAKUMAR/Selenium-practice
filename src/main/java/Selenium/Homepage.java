package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	    
	    driver.findElement(By.cssSelector("#username")).sendKeys("student");
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	   driver.findElement(By.id("submit")).click();
	   driver.findElement(By.linkText("Log out")).click();
	   
	   
	    

	}

}
