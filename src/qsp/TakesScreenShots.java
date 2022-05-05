package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakesScreenShots 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//1. thru TypeCasting
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//path+fileName+Extension
		File dest = new File("F:\\SELENIUM-KCSM11\\ScreenShots\\Google.jpg");
		Files.copy(src, dest);
		
		
		
		
//		//2. thru DownCasting
//		RemoteWebDriver rw=(RemoteWebDriver)driver;
//		
//		File src=rw.getScreenshotAs(OutputType.FILE);
//		File dest=new File("F:\\\\SELENIUM-KCSM11\\\\ScreenShots\\\\gooogle.jpg");
//		Files.copy(src, dest);
		
		
//		//3. thru EvenetFirinngWebdriver Class
//		EventFiringWebDriver ef = new EventFiringWebDriver(driver);
//		File src=ef.getScreenshotAs(OutputType.FILE);
//		
//		File dest=new File("F:\\\\SELENIUM-KCSM11\\\\ScreenShots\\\\Google.png");
//		
//		Files.copy(src, dest);
		
		
		//4. Taking Screenshot of Particular element
//		WebElement glogo = driver.findElement(By.xpath("//img[@alt='Google']"));
//		
//		File src =glogo.getScreenshotAs(OutputType.FILE);
//		File dest =new File("F:\\\\SELENIUM-KCSM11\\\\ScreenShots\\\\GoogleLOGO.jpeg");
//		
//		Files.copy(src, dest);
		
		
		
		
		
		
		
		
	}
}
