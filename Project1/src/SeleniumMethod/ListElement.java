package SeleniumMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ListElement {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(Options);//upcasting
		
		driver.get("https://www.facebook.com/signup");
	
		//WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
  		//Select p=new Select(year);
  		
  		//List<WebElement>option=p.getOptions();
  		
  		//int size=option.size();//to get size of listbox
  		//System.out.println(size);
  		//to print all the option present in listbox
  		
  		//for(int i=0;i<=option.size()-1;i++) {
  			//System.out.println(option.get(i).getText());
  		}
	
	
	}


