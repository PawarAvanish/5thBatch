package SeleniumMethod;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Scrreenshot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(Options);//upcasting
		
		driver.get("https://www.facebook.com/signup");
	
		for(int i=1;i<=10;i++) {
			
		
		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String random=RandomString.make(2);
		File destinction=new File("C:\\Scrrenshot\\Test123"+random+".jpg");
		
		FileHandler.copy(source, destinction);
	}
	}
}
