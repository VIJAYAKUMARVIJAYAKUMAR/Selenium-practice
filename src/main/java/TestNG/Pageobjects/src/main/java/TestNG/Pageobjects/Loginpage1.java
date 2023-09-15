package TestNG.Pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage1 {
WebDriver driver;
	
	private static final By username = By.xpath("//input[@id='username']");
	
	private static final By password = By.xpath("//input[@id='password']");

	
	private static final By submit = By.xpath("//button[@id='submit']");

		
		
	
	public void Enterusername(String name) {

		driver.findElement(username).sendKeys(name);
	}
	public void Enterpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void submit() {
	
   driver.findElement(submit).click();
	}
		
		public Loginpage1(WebDriver ddriver) {
			driver= ddriver;
	}
	
  }
  