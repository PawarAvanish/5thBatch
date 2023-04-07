package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizedListbox1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_Win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//upcasting
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(login).perform(); // moving angular brace to login element
		
		WebElement orders =driver.findElement(By.xpath("//div[text()='Orders']"));
		
		
		act.click(orders).perform()	;
		
		
		
		
		
		
		
		
		
		
	}

}
