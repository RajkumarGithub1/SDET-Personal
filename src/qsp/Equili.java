package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Equili                  //IMP
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/DELL/Desktop/equi.html");
		
	
//		List<WebElement> allcbx = driver.findElements(By.xpath("//input"));
//		
//		int size =allcbx.size();
//		System.out.println(size);
//		
//		for(int i=0; i<size; i++)
//		{
//			allcbx.get(i).click();
//		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		List<WebElement> first = driver.findElements(By.xpath("//input[@id='1234']"));
		
		int one =first.size();
		System.out.println(one);
		
		for(int i=0; i<one; i++)
		{
			first.get(i).click();
		}
		
		
		Thread.sleep(1000);

		driver.navigate().refresh();
				
				
		List<WebElement> all = driver.findElements(By.xpath("//input[@tag='xyz']"));
		
		int sizes =all.size();
		System.out.println(sizes);
		
		for(int i=0; i<sizes; i++)
		{
			all.get(i).click();
		}
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		List<WebElement> second = driver.findElements(By.xpath("//input[@name='abcd']"));
		
		int two =second.size();
		System.out.println(two);
		
		for(int i=0; i<two; i++)
		{
			second.get(i).click();
		}
		
	}
}
