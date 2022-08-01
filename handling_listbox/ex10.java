package handling_listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex10 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\velocity\\file\\103\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//((JavascriptExecutor)driver).executeScript("Window.scrollBy(0,1000)");
	
	WebElement element = driver.findElement(By.xpath("//a[text()='Facebook']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);

	
}
}
