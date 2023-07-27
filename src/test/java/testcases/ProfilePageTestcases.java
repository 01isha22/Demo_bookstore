package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageTestcases {
	
	@BeforeMethod
	public void setup()
	{
		System.out.println("before mtrhid");
		
	}
	
	@AfterMethod
	public void setdown()
	{
		System.out.println("after mtrhid");
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("Testcase1");
		String actual="test";
		String expected="test1";
		Assert.assertEquals(actual, expected);
		//
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("Testcase2");
		String actual="test";
		String expected="test1";
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void testcase3()
	{
		System.out.println("Testcase3");
		String actual="test";
		String expected="test";
		Assert.assertEquals(actual, expected);
	}

}
