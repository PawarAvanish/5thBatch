package Selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigate {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(Options);
		
		driver.get("https://www.meesho.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.flipkart.com//");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);	;
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		driver.close();
	}
	
	
	
	

}
