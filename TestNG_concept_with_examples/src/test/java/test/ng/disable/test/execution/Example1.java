package test.ng.disable.test.execution;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1 
{
	@Test
	public void TC1()
	{
		Reporter.log("Running TC1 from Example1", true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Running TC2 from Example1", true);
		//Assert.fail();
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("Running TC3 from Example1", true);
		//Assert.fail();
	}
	
	@Test
	public void TC4()
	{
		Reporter.log("Running TC4 from Example1", true);
		//Assert.fail();
	}
	
	@Test
	public void TC5()
	{
		Reporter.log("Running TC5 from Example1", true);
		//Assert.fail();
	}
	
	
	
	
	
	
	
	

}
