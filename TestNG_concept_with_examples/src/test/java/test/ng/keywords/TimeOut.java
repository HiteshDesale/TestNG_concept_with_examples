package test.ng.keywords;

import static org.testng.Assert.fail;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TimeOut 
{
	
	@Test(timeOut = 1000)
	public void test1() throws InterruptedException
	{
		System.out.println("Execution of test1");
		Thread.sleep(3000);
	}
	
	@Test(dependsOnMethods = {"Test1"})
	public void test2() throws InterruptedException
	{
		System.out.println("Execution of test2");
		Thread.sleep(1000);
	}
	

}
