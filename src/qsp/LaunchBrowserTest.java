package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserTest 
{

	public static void main(String[] args) 
	{
		//Very important interview question
		//Question: how to open browser automatically
		//Answer: create an object of that Browser class
		//set system property
		 System.setProperty("webdriver.chrome.driver", 
		 "F:\\SELENIUM-KCSM11\\Automation Project\\drivers\\chromedriver.exe");
		
		//open the browser
		
		ChromeDriver driver =new ChromeDriver();
		driver.close();   
		
	//	System.setProperty("webdriver.gecko.driver", 
	//	"F:\\SELENIUM-KCSM11\\Automation Project\\drivers\\geckodriver.exe");
		
	//	FirefoxDriver fox =new FirefoxDriver();
		
	//	fox.close();
			
		
//		System.setProperty("webdriver.edge.driver", 
//				"F:\\SELENIUM-KCSM11\\Automation Project\\drivers\\msedgedriver.exe");
//	    new EdgeDriver();
		
		

	}
	
}
