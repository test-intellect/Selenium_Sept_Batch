package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseClass;

public class ElementConditions extends BaseClass{


	public void isEnabledOrNot() 
	{
		WebElement ele = driver.findElement(By.xpath("(//div[@class='example'])[5]//input"));
		
		if(ele.isEnabled()==true) 
		{
			ele.sendKeys("Bala");
		}else 
		{
			System.out.println("Element is disabled user cant perform any action on it");
		}
	}
	
	public void isSelectedOrNot() 
	{
		
		driver.navigate().to("https://shareselenium.herokuapp.com/CheckBox.html");
		
		WebElement ele = driver.findElement(By.xpath("(//div[@class='example'])[2]//input"));
		if(ele.isSelected()==true)
		{
			System.out.println("Check box is already selected by default");
		}else 
		{
			ele.click();
		}
	}
	
	
	public void isDisplayedOrNot() 
	{
		
		driver.navigate().to("https://shareselenium.herokuapp.com/Buttons.html");
		
		try {
		WebElement ele = driver.findElement(By.id("home_1"));
		
		if(ele.isDisplayed()==true)
		{
			ele.click();
		}
		}catch(Exception e)
		{
			System.out.println("Element not found in the page");
		}
	}
	public static void main(String[] args) {
		
		ElementConditions obj = new ElementConditions();
		obj.startBrowser("https://shareselenium.herokuapp.com/Edit.html", "Chrome");
		//obj.isEnabledOrNot();
		//obj.isSelectedOrNot();
		obj.isDisplayedOrNot();
	}
}
