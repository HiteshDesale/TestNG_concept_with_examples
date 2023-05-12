package test.ng.assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example2HardAssert
{
	@Test
	public void TC2()
	{
		int actMarks=35;
		int expMarks=56;
		
		Assert.assertEquals(actMarks, expMarks);
		
		Reporter.log("Running TC2 from Example2", true);
		
		Assert.assertNotNull(actMarks, "The actual result is not null");
		
		System.out.println("Test finshies here");
	}
	
	
	
	
	
	
	

}
