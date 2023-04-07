package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class minmax {
	
	
	public static void main(String[] args) throws InterruptedException {
		
			
			
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			
			ChromeOptions  Options= new ChromeOptions();
			Options.addArguments("--remote-allow-origins=*");
			WebDriver driver= new ChromeDriver(Options);
			driver.get("https://www.flipkart.com//");
			
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			driver.manage().window().minimize();
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
	
	}

}
