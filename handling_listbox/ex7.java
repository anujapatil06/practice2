package handling_listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex7 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\velocity\\file\\103\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/user/Desktop/VELOCITY/table.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	int size=driver.findElements(By.xpath("//tr")).size();
	System.out.println(size);
	
	List<WebElement> alldata = driver.findElements(By.xpath("//tr[1]/th"));
	for(WebElement data:alldata)
	{
		System.out.print(data.getText()+" ");
	}
	
	List<WebElement> columdata = driver.findElements(By.xpath("//tr/td[2]"));
	for(WebElement data1:columdata)
	{
		System.out.println(data1.getText());
	}
	
}
}
