package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Multiplelistbox {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(Options);//upcasting
		
		driver.get("https://www.facebook.com/signup");
		WebElement Month=driver.findElement(By.xpath("//select[@title='Month']"));
		Select s=new Select(Month);
		
		boolean result=s.isMultiple();
		System.out.println(result);
		
		if(result==true) {
			System.out.println("The given listbox is multiselected");
		}
		else {
			System.out.println("listbox is single selected");
		}
	}

}
