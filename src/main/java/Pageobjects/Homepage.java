package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver; 
	
	By homepage = By.xpath("//a[normalize-space()='Home']");
	
	By name = By.xpath("//input[@id='form_first_name_7']");
	
	By email = By.xpath("//input[@id='form_email_7']");
	
	
	public void click() {
		driver.findElement(homepage).click();
		
		
	}
	
	public void Entername(String newname) {
		driver.findElement(name).sendKeys("newname");
		
		}

	public void fillemail (String youremail) {
		driver.findElement(email).sendKeys("youremail");
	}
	public Homepage(WebDriver ddriver) {
		driver= ddriver;
}
}

	
	

	

