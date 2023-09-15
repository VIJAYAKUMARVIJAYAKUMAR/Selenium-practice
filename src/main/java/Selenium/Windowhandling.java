package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Windowhandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		System.out.println(driver.getTitle());

		String window = driver.getWindowHandle();

		Set<String> allwindow = driver.getWindowHandles();

		for (String newwindow : allwindow) {

			System.out.println(newwindow);
			
			if (!newwindow.equalsIgnoreCase(window)) {
				driver.switchTo().window(newwindow);
				System.out.println(driver.getTitle());

			}

		}
	}
}
