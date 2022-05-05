package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPopups 
{	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/DELL/Desktop/popup.html");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it ']")).click();
		
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		
		
	}

}
