package hybridfw_datadriven_keyworddriven_methoddriven;

import keyWordDrivenFramework.LoginPOMclass;

public class ValidLoginTest_MAIN extends BaseTest
{
	public static void main(String[] args) throws Throwable 
	{
		
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		LoginPage lp = new LoginPage();
		Filelib flib = new Filelib();
		
		String u = flib.readPropertyData(PROP_PATH, "username");
		String p = flib.readPropertyData(PROP_PATH, "password");
		
		lp.typeUn(u);
		lp.typePw(p);
		lp.clickLoginBtn();
		
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		
		wlib.waitForPageTitle("actiTIME - Enter Time-Track");
		
		wlib.verify("actiTIME - Enter Time-Track", wlib.getpageTitle(), "Home Page");
		
		
	}
}
