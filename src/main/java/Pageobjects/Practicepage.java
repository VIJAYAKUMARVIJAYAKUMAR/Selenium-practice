package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Practicepage {
WebDriver driver;

    By practice = By.xpath("//a[normalize-space()='Practice']");
    
    By testexceptions = By.xpath("//a[normalize-space()='Test Exceptions']");
    
    
    
    By rows = By.xpath("//button[@id='add_btn']");
    
     

    		
    
    		
   
    
     
    
    public void click() {
    driver.findElement(practice).click();
    	}
    
    public void doubleclick() {
    	driver.findElement(testexceptions).click();	
    }
    
   
    
    public void nextclick() {
    	driver.findElement(rows).click();
   	 }
    
    
    
   
    
    
    public Practicepage(WebDriver ddriver) {
		driver= ddriver;
    }

    	
    
    
    
    

	

}
