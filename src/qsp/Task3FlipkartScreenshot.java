package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Task3FlipkartScreenshot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		//search button for giving input
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//entering data in search box
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptops");
		
		//search submit button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(4000);
		// Taking screenshot of page 
		WebElement fullpage = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']"));
		
		Thread.sleep(1000);
		File src=fullpage.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\SELENIUM-KCSM11\\ScreenShots\\Flipkartfullpage3.jpg");
		
		Files.copy(src, dest);
		System.out.println("Screenshot Done");
		
		
		// getting price and print
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
		Thread.sleep(5000);
		WebElement price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		String a=price.getText();
		System.out.println(a);
		
		
		
		
		
	}
}
