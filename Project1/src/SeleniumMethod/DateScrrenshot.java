package SeleniumMethod;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class DateScrrenshot {

	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(Options);//upcasting
		
		driver.get("https://www.facebook.com/signup");
	
		DateFormat  dateFormat= new  SimpleDateFormat("dd-MM-yyyy h-m-s");
		
		Date date=new Date();
		
		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

File destinction=new File("C:\\Scrrenshot\\sdt"
		+dateFormat.format(date)+".jpg");
		
		FileHandler.copy(source, destinction);
	}
		
	


}


