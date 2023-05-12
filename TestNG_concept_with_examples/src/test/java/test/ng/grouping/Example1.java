package test.ng.grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1
{
	
	@Test(groups = "Buy")
	public void TC1()
	{
		Reporter.log("Running TC1 from Example1", true);
	}
	
	@Test(groups =  "Sell")
	public void TC2()
	{
		Reporter.log("Running TC2 from Example1", true);
		//Assert.fail();
	}
	
	@Test(groups = "Order")
	public void TC3()
	{
		Reporter.log("Running TC3 from Example1", true);
		//Assert.fail();
	}
	
	@Test(groups = "Payment")
	public void TC4()
	{
		Reporter.log("Running TC4 from Example1", true);
		//Assert.fail();
	}
	
	@Test(groups = "Sell")
	public void TC5()
	{
		Reporter.log("Running TC5 from Example1", true);
		//Assert.fail();
	}
	
	@Test(groups = "Order")
	public void TC6()
	{
		Reporter.log("Running TC6 from Example1", true);
		//Assert.fail();
	}
	
	@Test(groups = "Buy")
	public void TC7()
	{
		Reporter.log("Running TC7 from Example1", true);
		//Assert.fail();
	}
	
	
	
	
	
	
	
	

}
