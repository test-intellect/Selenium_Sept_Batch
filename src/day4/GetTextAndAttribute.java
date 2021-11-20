package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseClass;

public class GetTextAndAttribute extends BaseClass{


	public void getTextFromFBPage() 
	{
		WebElement ele = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		String actualText=ele.getText();
		System.out.println(actualText);
	}

	
	public void getAttributeFromFB() 
	{
		WebElement ele = driver.findElement(By.id("email"));
		String actualAttributeValue=ele.getAttribute("placeholder");
		System.out.println(actualAttributeValue);
		
		ele.sendKeys("Balamurugan@testintellect.com");
		String actualTextFromInputBox=ele.getAttribute("value");
		System.out.println(actualTextFromInputBox);
		
	}

	public static void main(String[] args) {

		GetTextAndAttribute obj = new GetTextAndAttribute();
		obj.startBrowser("https://en-gb.facebook.com/", "Chrome");
		//obj.getTextFromFBPage();
		obj.getAttributeFromFB();
		obj.closeBrowser();
	}
}
