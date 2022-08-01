package handling_listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX2 
{
public static void main(String[]args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\velocity\\file\\103\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	 WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
	 Select s1=new Select(date);
	 s1.selectByValue("22");
	 Thread.sleep(2000);
	 System.out.println(s1.isMultiple());
	 Thread.sleep(2000);
	WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
	Select s2=new Select(month);
	s2.selectByIndex(1);
	Thread.sleep(2000);
	List<WebElement> allopt=s2.getOptions();
	for(WebElement opt:allopt)
	{
		System.out.println(opt.getText());
	}
	Thread.sleep(2000);
	WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
	
	Select s3=new Select(year);
	s3.selectByVisibleText("1992");
	Thread.sleep(2000);
     String	first=s3.getFirstSelectedOption().getText();
     System.out.println("first Option: "+first);

	Thread.sleep(2000);
	driver.close();
}
}
