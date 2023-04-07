package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframebasic {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_Win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
	WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(iframe);//changed selenium focus from main page to iframe
		
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.switchTo().defaultContent();//selenium focus changed to main page
		
		//driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
	}

}
