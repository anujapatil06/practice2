package handling_listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex9 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\velocity\\file\\103\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("poco m4 5g");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	String text = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[2]//span)[4]")).getText();
	System.out.println(text);
	
	
	
	
	
}
}
