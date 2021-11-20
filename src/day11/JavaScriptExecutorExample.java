package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import common.BaseClass;

public class JavaScriptExecutorExample extends BaseClass {

	
	
	public void ScrollToElementAndHighlight() throws InterruptedException 
	{
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		
		//to scroll
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		
		js.executeScript("arguments[0].scrollIntoView(true);", next);
		
		//to highlight 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 5px solid red;');", next);
		
		System.out.println(next.getText());
		
		Thread.sleep(5000);
		next.click();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		JavaScriptExecutorExample obj = new JavaScriptExecutorExample();
		obj.startBrowser("https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo%2Cash%2Cank%2Cedy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts&page=1", "Chrome");
		obj.ScrollToElementAndHighlight();
	}
	
	
	
}
