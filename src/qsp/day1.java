package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day1 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();      // object creation will open the particular browser
		
		driver.get("file:///C:/Users/DELL/Desktop/equi.html");
		
		
		driver.findElement(By.xpath("(//input)[last()])")).click();
		

	}
	
	
}
