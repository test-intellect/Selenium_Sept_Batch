package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import common.BaseClass;

public class HandleDropdown extends BaseClass{

	
	
	public void clickCreateNewAccount() 
	{
		WebElement ele = driver.findElement(By.linkText("Create New Account"));
		ele.click();
	}

	public void SelectDay() 
	{
		
		WebElement dayElement = driver.findElement(By.id("day"));
		Select st = new Select(dayElement);
		//st.selectByIndex(20);
		//st.selectByValue("11");
		st.selectByVisibleText("17");
		
		String defaultValueFromDropdown=st.getFirstSelectedOption().getText();
		System.out.println(defaultValueFromDropdown);
		
		System.out.println(st.isMultiple());
		
		//st.getOptions();
		
		
		
	}
	
	public static void main(String[] args) {
		
		HandleDropdown obj = new HandleDropdown();
		obj.startBrowser("https://en-gb.facebook.com/", "Chrome");
		obj.clickCreateNewAccount();
		obj.SelectDay();
	}
	
}
