package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Signuppage {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(Options);//upcasting
		
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[contains(@class,'_2ph-')])[1]")).sendKeys("priyanka");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[contains(@class,'_2ph-')])[2]")).sendKeys("pawar");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[contains(@class,'_2ph-')])[3]")).sendKeys("pawarpk2018redif@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[contains(@class,'_2ph-')])[4]")).sendKeys("pawarpk2018redif@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[contains(@class,'_2ph-')])[5]")).sendKeys("abcd456");
		
		
		
		
	}

}
