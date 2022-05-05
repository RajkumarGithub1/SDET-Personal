package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollingDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		
		//UpCasting from driver class to webDriver Interface
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
				
		Thread.sleep(3000);
		
		//Thru TypeCasting
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)");
		
		
//		//thru downCasting
//		RemoteWebDriver rwd = (RemoteWebDriver)driver;
//		rwd.executeScript("window.scrollBy(0,2000)");
//		
//		Thread.sleep(2000);
//		rwd.executeScript("window.srollBy(0, 2000)");
		
		
		
		
		
	}
}
