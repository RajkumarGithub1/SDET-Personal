package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipkartTask 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
			
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//search button for giving input
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//entering data in search box
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("laptops");
		
		//search submit button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//Price dropdown box
		WebElement dd=driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
		
		
		//clicking on price dropdown
		dd.click();
		Select sc=new Select(dd);
		
		//selection by value of dropdown
		sc.selectByValue("50000");
		
	
		Thread.sleep(2000);
		//Processor type selection dropdown
		driver.findElement(By.xpath("//div[@title=\"Core i3\"]/descendant::div[@class='_24_Dny']")).click();
		
		Thread.sleep(2000);
		//Laptop brand  Dropdown opening by clicking
		driver.findElement(By.xpath("(//div[@class='_2gmUFU _3V8rao'])[2]")).click();
		
		Thread.sleep(2000);
		//brand DELL selection from dropdown opened
		driver.findElement(By.xpath("//div[@title='DELL']/descendant::div[@class='_24_Dny']")).click();
		
		Thread.sleep(2000);
		//OS Dropdown opening by clicking
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and text()='Operating System']")).click();

		Thread.sleep(2000);
		//OS selection from Dropdownn opened
		driver.findElement(By.xpath("//div[@title=\"Windows 10\"]/descendant::div[@class='_24_Dny']")).click();
		
		Thread.sleep(2000);
		//getting and printing RAM
		WebElement ram=driver.findElement(By.xpath("(//li[@class=\"rgWa7D\"])[2]"));
		System.out.println(ram.getText());
		
		
		
		// getting and printing PRICES of laptops after all filters applied
		Thread.sleep(2000);
		
		WebElement lapPrice =driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[@class='_30jeq3 _1_WHN1'])[1]"));
		System.out.println(lapPrice.getText());
		
		
//		 for(WebElement a:all)
//		 {
//
//			    System.out.println(a.getText());                //for printing all elements
//
//		 }
		
		 
		Thread.sleep(2000);
		driver.close();
		
	}
}
