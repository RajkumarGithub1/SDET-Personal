package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphismInSelenium 
{
	public static void main(String[] args) 
	{
		WebDriver driver = null;
		
		//Ask the user inputs of Browser name
		
		System.out.println("Please, Enter Browser name");
		
		Scanner sc= new Scanner(System.in);
		String browser=sc.next();
		
		if (browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"./drivers/chromedriver.exe");
			driver = new ChromeDriver();
				
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", 
					"./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Entered Broswer does not exist");
		}
		
		driver.close();
		
	}
}
