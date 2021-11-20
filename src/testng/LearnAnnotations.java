package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations
{
	@Test(dependsOnMethods = "test2")
	public void test1() 
	{
		System.out.println("Welcome to TestNG test 1");
		Reporter.log("Welcome to TestNG test 1");
	}

	@Test(priority = 2, enabled = true)
	public void test2() 
	{
		System.out.println("Welcome to TestNG test 2");
		Reporter.log("Welcome to TestNG test 2");
	}

	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Open browser");
	}

	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("Close Browser");
	}
	
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("before class");
	}

	@AfterClass
	public void afterClass() 
	{
		System.out.println("after class");
	}
	

	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("before Test");
	}

	@AfterTest
	public void afterTest() 
	{
		System.out.println("after Test");
	}
	
	
	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("before suite");
	}

	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("after Suite");
	}


}
