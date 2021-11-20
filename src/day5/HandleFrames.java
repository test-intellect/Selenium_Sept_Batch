package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseClass;

public class HandleFrames extends BaseClass{

	public void enterDetailsInSubscribe() throws InterruptedException 
	{

		//driver.switchTo().frame(0); // int = index value - index starts from 0

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='zpiframe ']")); // Webelement
		driver.switchTo().frame(frame);

		//driver.switchTo().frame("ID/Name"); String - ID or Name Attribute value

		WebElement email = driver.findElement(By.id("CONTACT_EMAIL"));
		email.sendKeys("Balamurugan");
		
		// to come out of frames
		driver.switchTo().defaultContent();
		
		
		//driver.switchTo().parentFrame(); // Swtich between parent and child frames 
	
		
		Thread.sleep(5000);
		WebElement seleniumLink = driver.findElement(By.xpath("//a[text()='Selenium Webdriver ']"));
		seleniumLink.click();
	}

	public static void main(String[] args) throws InterruptedException {
		HandleFrames obj = new HandleFrames();
		obj.startBrowser("http://testintellect.zohosites.com/", "chrome");
		obj.enterDetailsInSubscribe();
	}
}
