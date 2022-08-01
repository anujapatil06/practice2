package handling_listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\velocity\\file\\103\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("poko");
	String expected ="poco x4 pro 5g";
	List<WebElement> alloption = driver.findElements(By.xpath("//div[@class='OBMEnb']//li"));
	
	for(WebElement option:alloption)
	{
		String act =option.getText();
		if(act.equals(expected))
		{
			option.click();
		}
		
	}
}
}
