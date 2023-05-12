package test.ng.grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example2 
{
	@Test(groups = "Buy")
	public void TC8()
	{
		Reporter.log("Running TC1 from Example2", true);
	}
	
	@Test(groups =  "Sell")
	public void TC9()
	{
		Reporter.log("Running TC2 from Example2", true);
		//Assert.fail();
	}
	
	@Test(groups = "Order")
	public void TC10()
	{
		Reporter.log("Running TC3 from Example2", true);
		//Assert.fail();
	}
	
	@Test(groups = "Payment")
	public void TC11()
	{
		Reporter.log("Running TC4 from Example2", true);
		//Assert.fail();
	}
	
	@Test(groups = "Sell")
	public void TC12()
	{
		Reporter.log("Running TC5 from Example2", true);
		//Assert.fail();
	}
	
	@Test(groups = "Order")
	public void TC13()
	{
		Reporter.log("Running TC6 from Example2", true);
		//Assert.fail();
	}
	
	@Test(groups = "Buy")
	public void TC14()
	{
		Reporter.log("Running TC7 from Example2", true);
		//Assert.fail();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
