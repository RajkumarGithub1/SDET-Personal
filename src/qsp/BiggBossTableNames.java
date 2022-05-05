package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BiggBossTableNames 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/Bigg_Boss_(Telugu_TV_series)");
		
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//tr[*]//td[3]"));
		

		for(WebElement a:list)
		 {

			    System.out.println(a.getText());                //for printing all elements

		 }
			
		
		
		
	}
}
