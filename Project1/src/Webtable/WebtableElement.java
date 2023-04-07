package Webtable;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_Win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//upcasting
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		Thread.sleep(1000);
		
	  List<WebElement> noofRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	    
			System.out.println(noofRows.size());
			
		List<WebElement> noofcells = driver.findElements(By.xpath("//table[@id='customers']//tr[\"+(i+1)+\"]//td"));
			
		System.out.println(noofcells.size());
		
	}

}
