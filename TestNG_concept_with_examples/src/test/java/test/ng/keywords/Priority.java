package test.ng.keywords;

import org.testng.annotations.Test;

public class Priority 
{
	@Test(priority = 0)
	public void test1()
	{
		System.out.println("Execution of test1");
	}
	
	
	@Test(priority = 1)
	public void test2()
	{
		System.out.println("Execution of test2");
	}
	
	@Test(priority = 3)
	public void test3()
	{
		System.out.println("Execution of test3");
	}
	
	@Test(priority = 4)
	public void test4()
	{
		System.out.println("Execution of test4");
	}

}
