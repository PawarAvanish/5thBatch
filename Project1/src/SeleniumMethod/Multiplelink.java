package SeleniumMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Multiplelink {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(Options);//upcasting
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<=links.size();i++) {
		System.out.println(links.get(i).getText()+":"+links.get(i).getAttribute("href"));
		}
	
	}

}
