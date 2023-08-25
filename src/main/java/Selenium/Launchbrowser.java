package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;
public class Launchbrowser {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();		
//		EdgeDriver driver = new EdgeDriver();
//		FirefoxDriver driver = new FirefoxDriver(); 
	 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().refresh(); 
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().minimize(); 
		driver.quit();
	}

}


