package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseClass;

public class FindElementsConcept extends BaseClass{
	
	
	
	
	
	public void getAllLinks() 
	{
		//WebElement ele = driver.findElement(By.id("100000"));
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		System.out.println(elements.size());
		
		for (WebElement ele : elements) 
		{
			System.out.println(ele.getText());
		}
		
	}

	
	public static void main(String[] args) {
		
		FindElementsConcept obj = new FindElementsConcept();
		obj.startBrowser("https://www.facebook.com/", "Chrome");
		obj.getAllLinks();
	}
}
