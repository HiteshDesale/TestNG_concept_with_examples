package test.ng.suite;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example2 
{
	@Test
	public void TC4()
	{
		Reporter.log("Running TC4 from Example1", true);
	}
	
	@Test
	public void TC5()
	{
		Reporter.log("Running TC5 from Example1", true);
		Assert.fail();
	}
	
	@Test
	public void TC6()
	{
		Reporter.log("Running TC6 from Example1", true);
		Assert.fail();
	}
	
	
	
	
	

}
