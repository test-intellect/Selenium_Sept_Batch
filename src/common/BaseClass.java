package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {



	public WebDriver driver;


	public void startBrowser(String URL,String browser) 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", ".\\drivers\\ie.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\gecko.exe");
			driver = new FirefoxDriver();
		}else 
		{
			System.out.println("No Browser matched");
		}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
	}


	public void closeBrowser() 
	{
		driver.close();
	}

}
