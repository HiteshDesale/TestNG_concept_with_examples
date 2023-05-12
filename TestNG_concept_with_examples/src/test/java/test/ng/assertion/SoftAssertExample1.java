package test.ng.assertion;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample1 
{
	@Test
	public void TC1()
	{
		
		SoftAssert soft=new SoftAssert();
		
		String acctStuName="Rahul";
		String expStuName="Pankaj";
		
		soft.assertEquals(acctStuName, expStuName);
		
		Reporter.log("Running TC1 from SoftAssertExample1", true);
		
		soft.assertNull(expStuName);
		
		System.out.println("Test finishes here");
		
		soft.assertAll();

		
	}
	


}
