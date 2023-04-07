package Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebooklogin {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(Options);//upcasting
		driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pawarpk2018redif@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd456");
		Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@value='1']")).click();
	}

}
