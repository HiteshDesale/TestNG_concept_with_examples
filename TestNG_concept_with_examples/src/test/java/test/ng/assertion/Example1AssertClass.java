package test.ng.assertion;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Example1AssertClass
{
	@Test
	public void TC1()
	{
		String actEmployeeName=null;
		String expEmployeeName="Hitesh";
		
		//assertEquals
		//org.testng.Assert.assertEquals(actEmployeeName, expEmployeeName);
		
		//assertNotEquals
		//org.testng.Assert.assertNotEquals(actEmployeeName, expEmployeeName);
		
		//assertTrue
		//org.testng.Assert.assertTrue(true);
		//org.testng.Assert.assertTrue(false, "False : actual result is not as expected");
		
		//assertFalse
		//org.testng.Assert.assertFalse(false);
		//org.testng.Assert.assertFalse(true, "false : actual result is not as expected");
		
		//assertnull
		//org.testng.Assert.assertNull(actEmployeeName);
		//org.testng.Assert.assertNull(actEmployeeName, "Actual result is not null");

		//assertNotNull
		//org.testng.Assert.assertNotNull(expEmployeeName);
		org.testng.Assert.assertNotNull(actEmployeeName, "Actual result is null");
	}
	
	
	
	
	
	
	
	
	

}
