package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebElementCommands {

	
	WebDriver driver;
	
	
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
	
	
	public void loginToFB() 
	{
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("Bala@test.com");
		emailField.clear();
		emailField.sendKeys("Balamurugan@testintellect.com");		
		WebElement passwordField= driver.findElement(By.name("pass"));
		passwordField.sendKeys("test@234567899");
		
		WebElement LoginButton= driver.findElement(By.name("login"));
		LoginButton.click();
	}
	
	public void loginToGmail() 
	{
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("balatm1489@gmail.com");
		
		WebElement Next = driver.findElement(By.xpath("//span[text()='Next']"));
		Next.click();
		
		WebElement Password= driver.findElement(By.name("password"));
		Password.sendKeys("Test@1234567890");
	}
	
	public void closeBrowser() 
	{
		driver.close();
	}
	
	public static void main(String[] args) {
		
		
		WebElementCommands obj = new WebElementCommands();
		obj.startBrowser("https://en-gb.facebook.com/","CHROME");
		obj.loginToFB();
		//obj.closeBrowser();
	}
	
	
}
