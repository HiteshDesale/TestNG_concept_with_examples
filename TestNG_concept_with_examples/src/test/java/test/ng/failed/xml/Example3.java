package test.ng.failed.xml;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example3 
{
	@Test
	public void TC7()
	{
		Reporter.log("Running TC7 from Example1", true);
	}
	
	@Test
	public void TC8()
	{
		Reporter.log("Running TC8 from Example1", true);
		AssertJUnit.fail();
	}
	
	@Test
	public void TC9()
	{
		Reporter.log("Running TC9 from Example1", true);
		AssertJUnit.fail();
	}
	
	
	

}
