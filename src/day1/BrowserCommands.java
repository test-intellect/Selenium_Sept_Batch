package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//launch browser
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//load App URL
		driver.get("https://en-gb.facebook.com/");
		
		
		//Page title
		String actualTitle = driver.getTitle();
		System.out.println("Page Title is :: "+ actualTitle);
		if(actualTitle.equals("Facebook – log in or sign up"))
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		//get Current URL
		String actualURL= driver.getCurrentUrl();
		System.out.println("Actual URL is :: "+ actualURL);
		
		
		String pagesrc=driver.getPageSource();
		
		System.out.println(pagesrc);
		if(pagesrc.contains("requireLazy"))
		{
			System.out.println("requireLazy is available");
		}else 
		{
			System.out.println("requireLazy is not available");
		}
		
		
//		Thread.sleep(2000);
//		driver.navigate().back();
//		
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		
//		Thread.sleep(2000);
//		driver.navigate().refresh();
		
		driver.close(); // Current Browser
		
		
	}
	
	
	

}
