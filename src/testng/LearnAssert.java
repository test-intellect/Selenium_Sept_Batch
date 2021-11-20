package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssert {

	
	
	@Test(enabled = false)
	public void hardAssert() 
	{
		
		int i =100;
		int j=200;
		if(i==j)
		{
			System.out.println("I and J values are equal");
		}else
		{
			System.out.println("I and J values are not equal");
			Assert.fail(); // hard assert
		}
		
		System.err.println("End of testcase");
	}
	
	@Test
	public void softAssert() 
	{
		
		SoftAssert sa = new SoftAssert();
		
		int i =200;
		int j=100;
		if(i==j)
		{
			System.out.println("I and J values are equal");
		}else
		{
			System.out.println("I and J values are not equal");
			sa.fail();
		}
		
		System.err.println("End of testcase");
		
		sa.assertAll();
	}
	
}
