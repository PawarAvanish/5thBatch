package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isselected {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");

		
		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(Options);//upcasting
		
		driver.get("https://www.facebook.com/signup");
		
	WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	female.click();
	
	boolean result=female.isSelected();
	System.out.println(result);
	
	if(result==true) {
		
		System.out.println("Given element is selected");
	}
	else {
		System.out.println("Given element is not selected");
	}
		
	}

}
