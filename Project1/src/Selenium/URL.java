package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class URL {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(Options);
		driver.get("https://www.flipkart.com//");
		
		Thread.sleep(3000);
		
		//driver.close();
		//driver.quit();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String expurl="https://www.flipkart.com//";
		
	if(url.equalsIgnoreCase(expurl)) {
			System.out.println("Navigate to correct page");
		}
		
		else {
			
			System.out.println("Navigate to invalid page");
		}
	}

}
