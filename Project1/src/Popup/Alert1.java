package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_Win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	
	String x= driver.getWindowHandle();
	System.out.println(x);
	}
}
