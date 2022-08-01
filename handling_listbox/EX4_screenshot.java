package handling_listbox;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EX4_screenshot 
{public static void main(String[] args) throws IOException 
{ 

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\velocity\\file\\103\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\user\\Desktop\\velocity\\AUTOMATION TESTING");
	FileHandler.copy(Source, dest);
	
}
}