package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Qspidersphotos 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.name("q"));
		a.sendKeys("qspiders hyderabad");
		
		
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		System.out.println(options.size());
		
		for(int i=0; i<=options.size()-1; i++)
		{
			String s=options.get(i).getText();
			System.out.println(s);
		}
		
//		Thread.sleep(2000);
//		a.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//		a.sendKeys(Keys.DOWN);
		
		for(int i=0; i<=options.size()-1; i++)
		{
			String ab=options.get(i).getText();
			if (ab.equals("qspiders hyderabad kphb photos"))
			{
				options.get(i).click();
			}
		}
		
		
	}
}
