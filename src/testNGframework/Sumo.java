package testNGframework;

import org.testng.Reporter;
import org.testng.annotations.Test;

//test suite - Collection of test classes
public class Sumo 
{
	@Test
	public void run3()
	{
		Reporter.log("Sumo message", true);
	}
}

