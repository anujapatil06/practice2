package handling_listbox;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX1 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\velocity\\file\\103\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
	Select s=new Select(date);
	s.selectByValue("6");

	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	Select s2=new Select(month);
	s2.selectByVisibleText("Mar");
	Thread.sleep(2000);
	boolean result=s2.isMultiple();
	System.out.println(result);
	Thread.sleep(2000);
	
	WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
	Select s3=new Select(year);
	s3.selectByValue("1995");
	
	
	Thread.sleep(2000);
	
	WebElement option =s3.getFirstSelectedOption();
	System.out.println(option.getText());
	Thread.sleep(2000);
	
	 List<WebElement> alloption = s3.getOptions();
	 for(WebElement opt:alloption)
	 {
		 System.out.println(opt.getText());
	 }
	
	 Thread.sleep(2000);
	driver.close();
}
}
