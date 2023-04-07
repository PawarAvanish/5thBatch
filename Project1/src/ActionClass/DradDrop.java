package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DradDrop {
	
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_Win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//upcasting
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		
     WebElement source = driver.findElement(By.xpath("//a[@class='button button-orange'])[4]"));
     
                   WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

		
		Actions act= new Actions(driver);
		
		Thread.sleep(3000);
		
		//act.moveToElement(source.clickAnHold().moveToElement(destination).release().build().perform();
		
		act.dragAndDrop(source, destination).perform();
		
		
		
	}

}
