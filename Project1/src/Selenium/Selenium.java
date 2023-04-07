package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(Options);//upcasting
		driver.get("https://www.flipkart.com//");
		Thread.sleep(5000);
		//Dimension d=new Dimension(200,300);
		//driver.manage().window().setSize(d);
		
		//Thread.sleep(5000);
		
		
		//Point p=new Point(500,200);
		//driver.manage().window().setPosition(p);
		
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		
		System.out.println(driver.manage().window().getSize());
		
	}





}

