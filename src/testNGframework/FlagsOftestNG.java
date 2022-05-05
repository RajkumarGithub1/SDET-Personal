package testNGframework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagsOftestNG 
{
	
	@Test(priority=3, invocationCount=2)
	public void run()
	{
		Reporter.log("RUN - Message", true);
	}	
	
	
	@Test(priority=2, enabled=true)
	public void bun()
	{
		Reporter.log("bun - message", true);
	}
	
	@Test(priority=1, enabled=true)
	public void gun()
	{
		Reporter.log("gun - message", true);
	}
	
	
}
