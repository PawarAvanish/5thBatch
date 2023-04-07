package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getText {
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");

		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(Options);//upcasting
		
		driver.get("https://www.facebook.com/signup");
		
	//WebElement text= driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]"));
	//String result=text.getText();
	//System.out.println(result);
		
	WebElement ele=driver.findElement(By.xpath("//input[@class='inputtext_58mg_5dba_2ph"));
	
	String Attribute=ele.getAttribute("autocomplete");
	System.out.println(Attribute);
	}

}
