package ImplicitAndExplicitwait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebooklogin {

	
public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_Win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();//upcasting
		
		driver.get("https://www.facebook.com/login.php/");
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//deprecated method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pawarpk2018redif@gmail.com");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).clear();

		//Th

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pawarpk2018redif@gmail.com");
		
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd456");
		
		//Thread.sleep(2000);
		
		  driver.findElement(By.xpath("//button[@value='1']")).click();
	}



		
		
		
		
		
		
		
		
		
		
		
		
	}

