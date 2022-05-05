package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice 
// Instagram
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
	
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);  //Login page
		driver.get("https://www.instagram.com/");
		
		//Username Enter
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]")).sendKeys("_____r_a_j_u");
		
		
		//Password enter
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("Rajkumar@1807");
		
		//login button	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm                                                                                                              ']")).click();
	
		//messenger
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"/direct/inbox/\"]")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='J_0ip  Vpz-1  TKi86 ']/ancestor::div[@class='XrOey']")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_        vwCYk ")).sendKeys("Hi ra Iam Sending this message using Automated Software-Selenium ");
		
		
		
		
		
		
		
		
	}
}
