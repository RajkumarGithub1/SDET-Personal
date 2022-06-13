package qsp;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardActions 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		//closing Login window popup
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(4000);
		
		// Moving to Navigation Bar
		WebElement ddd=driver.findElement(By.xpath("//div[text()='More']"));
//		WebElement ddd=driver.findElement(By.xpath("//div[@id='nav-tools']"));
//				
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.moveToElement(ddd).perform();
		
		
				
//		//performing Double click
//		driver.get("https://demo.actitime.com/login.do");
//		
//		Thread.sleep(2000);
//		WebElement u = driver.findElement(By.id("username"));
//		
//		u.sendKeys("admin");
//		
//		Thread.sleep(3000);
//		Actions ac = new Actions(driver);
//		Action q = ac.doubleClick(u).build();
		
		
//		//performing Drag and Drop
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		
//		Thread.sleep(2000);
//		WebElement src = driver.findElement(By.id("box7"));
//		WebElement dest = driver.findElement(By.id("box107"));
//		
//		Actions at = new Actions(driver);
//		at.dragAndDrop(src, dest).perform();
		
		
		
//		
//		//Performing Right Click 
//		//Handling right clicked options by Robot Class
//		driver.get("https://demo.actitime.com/login.do");
//		
//		Thread.sleep(2000);
//		WebElement link = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
//		
//		Actions a = new Actions(driver);
//		a.contextClick(link).perform();
//		
		Thread.sleep(3000);
		Robot r1 = new Robot();
//		r1.keyPress(KeyEvent.VK_T);
//		r1.keyRelease(KeyEvent.VK_T);
		
		r1.keyPress(KeyEvent.VK_T);
		
		
		
		
		
		
		
		
		
		
	}
}
