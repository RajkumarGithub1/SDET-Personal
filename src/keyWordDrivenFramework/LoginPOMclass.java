package keyWordDrivenFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;


public class LoginPOMclass 
{

		//@FindBy(locatorName="locatorValue") accessSpecifier returnType elementName;
		
		@FindBy(id="username") private WebElement untb;
		
		public LoginPOMclass(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		
		public WebElement geUntb()
		{
			return untb;
		}
		
				
	}