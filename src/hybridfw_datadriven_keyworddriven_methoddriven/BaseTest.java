package hybridfw_datadriven_keyworddriven_methoddriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConsts
{
	public static WebDriver driver;
	public void openBrowser() throws Throwable
	{
		Filelib flib=new Filelib();
		
		String browserName=flib.readPropertyData(PROP_PATH, "browser");
		
		
		if(browserName.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
		}
		
		else if (browserName.equals("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Enter Proper Browser Name");
			
		}
		
		driver.manage().window().maximize();
		String appUrl = flib.readPropertyData(PROP_PATH, "url");
		
		driver.get(appUrl);
			
		WebDriverCommonLib wlib= new WebDriverCommonLib();
		wlib.verify("actiTIME - Login",wlib.getpageTitle(), "Login Page");
	}
	
	public void closeBrowser()
		{
			driver.quit();
		}
		
	
}

