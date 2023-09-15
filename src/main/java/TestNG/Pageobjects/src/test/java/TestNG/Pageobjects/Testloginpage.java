package TestNG.Pageobjects;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Testloginpage {
    @Test
	public void Testloginpage1() {

    	ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        

        Loginpage1 loginpages = new Loginpage1 (driver);
       
        
        loginpages.Enterusername("student");
        loginpages.Enterpassword("Password123");
        loginpages.submit(); 
	}
}


