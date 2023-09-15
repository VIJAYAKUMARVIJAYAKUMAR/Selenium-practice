package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardactions {
	public static void main(String[]args ) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.co.in/inputtools/try/");
		
		driver.findElement(By.id("demobox")).sendKeys("Good");
		driver.findElement(By.id("demobox")).sendKeys(Keys.SEMICOLON);
	    driver.findElement(By.id("demobox")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("demobox")).sendKeys("Morning");
	    driver.findElement(By.id("demobox")).sendKeys(Keys.UP);
	    driver.findElement(By.id("demobox")).sendKeys(Keys.DOWN);
	
	
	    
		
		
		
		
		
		
		
		
		
	}

}
