package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrainyQuoteAuthor 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
		
		driver.get("https://www.brainyquote.com/");
		
		Thread.sleep(2000);
		
		// TOP Authors Link
		driver.findElement(By.xpath("(//a[@class='txnav nav-link'])[2]")).click();
	
		System.out.println("Enter Author Name");
		Scanner sc=new Scanner(System.in);
		String given=sc.nextLine();
		
		List<WebElement> authors = driver.findElements(By.xpath("//span[@class='authorContentName']"));
		
		for(int i=1; i<=authors.size()-1; i++)
		{
			String actual=authors.get(i).getText();

			if(given.equalsIgnoreCase(actual))
			{
				System.out.println(i);
				
				WebElement sel = authors.get(i);
				Point loc = sel.getLocation();
				System.out.println(loc);
//				
//				RemoteWebDriver rwd=(RemoteWebDriver)driver;
//				rwd.executeScript("window.scrollBy"+loc);
//				Thread.sleep(2000);
//				sel.click();
//				break;
//				WebElement addr = driver.findElement(By.xpath("(//span[@class='authorContentName'][i])"));
				
				Actions ac= new Actions(driver);
				ac.moveToElement(sel).perform();
				sel.click();
				break;
			}
			
			
			
		}
		
	}

	
	}
