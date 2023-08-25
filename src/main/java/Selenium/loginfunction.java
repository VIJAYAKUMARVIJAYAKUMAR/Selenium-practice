package Selenium;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginfunction {
	public static void main(String[]arg ) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();



		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement usernamefield = driver.findElement(By.name("username"));
		
		
		
		usernamefield.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.tagName("button"));
		
	login.click();
	
	

		
		
		
		
		
		

		
	}

}
 