package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(Options);
		driver.get("https://www.flipkart.com//");
		
		//Thread.sleep(3000);
		
		//driver.close();
		//driver.quit();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String exptitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
				
		if(title.equalsIgnoreCase(exptitle)) {
			System.out.println("Navigate to correct page");
		}
		else {
			System.out.println("Navigate to invalid page");
		}
		}
		
         }
	


