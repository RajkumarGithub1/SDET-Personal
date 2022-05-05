package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Task2Qspscreenshot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.qspiders.com/");
				
		Thread.sleep(2000);
		WebElement x=driver.findElement(By.xpath("//span[text()='Telangana']"));
		
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.moveToElement(x).perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Hyderabad - KPHB']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Batches'])[last()]")).click();
		
		Thread.sleep(3000);
		WebElement y=driver.findElement(By.xpath("//p[text()='Core java']/ancestor::div[@class='card']/descendant::span[text()='Enroll']"));
		y.click();
		
		Thread.sleep(2000);
		WebElement z = driver.findElement(By.xpath("//input[@placeholder=\"Your Name\"]"));
		z.sendKeys("abcd");
		
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.doubleClick(z).perform();
		z.sendKeys(" ");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Your Mobile Number\"]")).sendKeys("125dbvdjf");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Your Email\"]")).sendKeys("dkj5");
		
		Thread.sleep(2000);
		
		WebElement v = driver.findElement(By.xpath("//p[text()='Batch Enroll Form']/ancestor::div[@class='card']"));
		
		File src=v.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\SELENIUM-KCSM11\\ScreenShots\\QspiderEnrollpage.jpeg");
		
		Files.copy(src, dest);
		
		
		
		
		
		
		
	}
}
