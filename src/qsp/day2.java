package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String actTitle = driver.getTitle();
		String expTitle = "actiTIME - Login";
		
		if (actTitle.equals(expTitle))
		{
			System.out.println("Login Page displayed, PASS");
		}
		else
		{
			System.out.println("Login Page NOT Diaplayed, FAIL");
		}
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
	}

}
