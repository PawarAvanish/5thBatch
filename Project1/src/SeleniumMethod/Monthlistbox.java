package SeleniumMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Monthlistbox {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions  Options= new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(Options);//upcasting
		
		driver.get("https://www.facebook.com/signup");
		WebElement Month=driver.findElement(By.xpath("//select[@title='Month']"));
		Select s=new Select(Month);
//System.out.println(s.getFirstSelectedOption().getText());
    List<WebElement>alloptions=s.getAllSelectedOptions();

for(int i=0;i<=alloptions.size()-1;i++) {
	System.out.println(alloptions.get(i).getText());
}
	}
}
