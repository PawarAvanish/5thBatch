package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_Win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
	Set<String> a = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(a);
	
	String cbadd = al.get(1);// child browser address
	
	driver.switchTo().window(cbadd);
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
	driver.switchTo().window(al.get(0));
	
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	
	
	
	}
	
	
	
	
	

}
