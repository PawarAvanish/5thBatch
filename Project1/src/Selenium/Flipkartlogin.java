package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkartlogin {

	
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			
			ChromeOptions  Options= new ChromeOptions();
			Options.addArguments("--remote-allow-origins=*");

			WebDriver driver= new ChromeDriver(Options);//upcasting
			driver.get("https://affiliate.flipkart.com/login");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pawarpk2018redif@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd456");
			Thread.sleep(2000);
			  driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
	}


