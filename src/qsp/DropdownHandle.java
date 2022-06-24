package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///F:/EXP/Selenium/MultiDropdown.html");
		
		Thread.sleep(2000);
		WebElement dd =driver.findElement(By.name("hotel"));
		
		Select se= new Select(dd);
		
		se.selectByVisibleText("DOSA");
		se.selectByValue("f");
		se.selectByIndex(4);
//		dd.click();
		se.selectByVisibleText("IDLY");
//		Thread.sleep(3000);
//		
//		se.deselectByVisibleText("IDLY");   //No Exception In multiple selection Dropdown
		 
		if(se.isMultiple())
		{
			System.out.println("It is a Multiple-select Dropdown");
		}
		else
		{
			System.out.println("It is a Single-select Dropdown");
		}
		
		se.selectByVisibleText("IDLY");
		se.selectByVisibleText("DOSA");
		se.selectByVisibleText("PURI");
		se.selectByVisibleText("VADA");
		
		Thread.sleep(2000);
		
		se.deselectByVisibleText("VADA");
		se.deselectAll();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
