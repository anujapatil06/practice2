package handling_listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX3 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\velocity\\file\\103\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/user/Desktop/velocity/select.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement country=driver.findElement(By.xpath("//select[@id='1234']"));
	Select s1=new Select(country);
	s1.selectByIndex(1);
	s1.selectByIndex(0);
	s1.deselectByIndex(1);
	System.out.println(s1.isMultiple());
	s1.selectByIndex(3);
	s1.selectByIndex(2);
	String fopt=s1.getFirstSelectedOption().getText();
	System.out.println("FirstOption:"+fopt);
     List<WebElement> allopt = s1.getAllSelectedOptions();
     for(WebElement al:allopt)
     {
       System.out.println("all Selected opt: "+al.getText());
      }
      Thread.sleep(2000);
      s1.deselectAll();
      System.out.println("all options");
     List<WebElement> allopn = s1.getOptions();
     for(WebElement opn:allopn)
     {
    
    	 System.out.println(opn.getText());
     }
      
      driver.close();
	
}
}
