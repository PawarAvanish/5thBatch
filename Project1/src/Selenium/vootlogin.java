package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class vootlogin {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(Options);//upcasting
		driver.get("https://elogin.voot.com/views/login.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pawarpk2018redif@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("priyanka123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();


	}
}