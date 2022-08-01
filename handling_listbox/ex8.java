package handling_listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8 
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\velocity\\file\\103\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/user/Desktop/VELOCITY/table.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='1234']//tr//*[2]"));
	
	for(WebElement data:alldata)
	{
		System.out.println(data.getText());
	}
	System.out.println();
	
	
	List<WebElement> alldata1 = driver.findElements(By.xpath("//table[@id='1234']"));
	for(WebElement data1:alldata1)
	{
		System.out.print(data1.getText());
	}
	
	     System.out.println();
	
	
	
}
}
