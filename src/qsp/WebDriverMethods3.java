
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods3 
{
	private static int height;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();      // object creation will open the particular browser
		
//		giving particular URL input to open
		
		driver.get("https://www.facebook.com/");
		
//		driver.get("https://www.instagram.com/");
//		System.out.println(driver.getPageSource()); // to get page source code
		
//		System.out.println(driver.getTitle());   // to get page title of the page
//		String expectedTitle = "Instagram";		
//		String actualTitle = driver.getTitle();
//		
//		if (actualTitle.equals(expectedTitle))
//		{
//			System.out.println("Instagram Login page displayed, PASS");
//		}
//		else
//		{
//			System.out.println("Instagram Page not Displayed, FAILED");
//		}
//		
		driver.close();
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);						// thread sleep is used to delay the time between the slides/windows
//		
//		driver.manage().window().maximize();	// to maximize the current opened window
//		
//		Thread.sleep(2000);
//		driver.manage().window().minimize(); 	// to minimize window which is open
//		
		Dimension dim=new Dimension(400, 250);	// giving dimensions to get new window of specified size
		driver.manage().window().setSize(dim);	// command to get specified sized window of browser
		
		Thread.sleep(2000);
		Point p=new Point(700,500);      //getting window to be at specified location in display
		driver.manage().window().setPosition(p);	
		
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		driver.navigate().to("https://accounts.google.com/");	//navigate.to is also helps to get url
											
		Thread.sleep(2000);
		driver.navigate().back(); 	// to go back to the previous page
		
		Thread.sleep(2000);
		driver.navigate().forward();	// to move forward from current page
		
		Thread.sleep(2000);
		driver.navigate().refresh(); 	// to refresh the currennt page
				
		
		
	}
}












