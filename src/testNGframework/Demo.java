package testNGframework;

import org.testng.Reporter;

public class Demo 
{
	public void run()
	{
		System.out.println("only Console");
		Reporter.log("Only Report");
//		Reporter.log("Both Report + Console", true);
		
		
		Reporter.log("Demo message", true);
	}
}
