package day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview {

	
	
	WebDriver driver ;
//	public void takeScreenShot() 
//	{
//		driver.navigate().to("http://google.com/");
//		
//		File src = ((TakesScreenshot))driver.getscreenshotas(outputType.File);
//		Fileutils.copyfile(src, "Path of the image");
//		
//	}
	
	
	
	public void startbrowser(String browser, String URL) 
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(URL);
	}
	public static void main(String[] args) {
		
		
		Interview obj = new Interview();
		obj.startbrowser("Chrome", "https://www.google.com/");
		
	}
	
	
	
	
	
	
}
