package keyWordDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaleElementReferenceException 
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		
		Thread.sleep(2000);
		//Testing by giving sendkeys to the element address after refreshing the page
//		WebElement untb = driver.findElement(By.id("username"));
//		driver.navigate().refresh();
//		untb.sendKeys("admin");
		
		
		//calling LoginPOMClass by creating Object
		LoginPOMclass lp = new LoginPOMclass(driver);
		driver.navigate().refresh();
		
		//giving sendkeys to the element address
		lp.geUntb().sendKeys("admin");
		
		
		
		
		
	}
}
