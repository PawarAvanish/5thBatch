package Webtable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupDown {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_Win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//upcasting
		driver.get("https://the-goonies.webflow.io/");
		
		Thread.sleep(1000);
		
	           JavascriptExecutor scroll = (JavascriptExecutor)driver;
	           
	          scroll.executeScript("window.scrollBy(0,300)"); //scroll down
	          Thread.sleep(3000);
		
	          scroll.executeScript("window.scrollBy(0,-300)"); //scroll up
	          Thread.sleep(3000);
		
	          scroll.executeScript("window.scrollBy(3000,0)"); //scroll right
	          Thread.sleep(3000);
		
	          scroll.executeScript("window.scrollBy(-3000,0)"); //scroll left
	          Thread.sleep(3000);
		
		
		
		
		
		
		
	}

}



