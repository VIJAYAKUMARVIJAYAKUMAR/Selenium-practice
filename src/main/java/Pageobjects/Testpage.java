package Pageobjects;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testpage {
	
	

	    

		public static void main(String[] args) {

	    	ChromeDriver driver = new ChromeDriver();
	        
	        driver.get("https://practicetestautomation.com/practice-test-login/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        

	        Loginpage loginpages = new Loginpage (driver);
	       
	        
	        loginpages.Enterusername("student");
	        loginpages.Enterpassword("Password123");
	        loginpages.submit();
	        
	        Homepage  homepage = new Homepage (driver);
	        homepage.click();
	        homepage.Entername("vijay");
	        homepage.fillemail("youremail");
	         
	        Practicepage practicepage = new Practicepage (driver);
	        practicepage.click();
	        practicepage.doubleclick();
	        practicepage.nextclick();
	        
	       
	        
	        
	    
	       
	        
		}
	        
	    }

	
			
		
	


