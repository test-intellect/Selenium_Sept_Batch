package day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common.BaseClass;

public class ActionsClassExample extends BaseClass{
	
	
	
	
	public void clickSeleniumOption() 
	{
		
		//WebElement canclePopuP= driver.findElement(By.id("onesignal-slidedown-cancel-button"));
		//canclePopuP.click();
		
		WebElement tutorialEle = driver.findElement(By.xpath("//span[text()='Tutorials']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(tutorialEle).perform();
		
		WebElement seleniumEle = driver.findElement(By.xpath("(//a[text()='Selenium'])[1]"));
		
		act.moveToElement(seleniumEle).click().build().perform();
	}
	
	public void rightClickEvent() throws Exception 
	{
		WebElement blogEle = driver.findElement(By.xpath("//a[text()='Blog']"));
		Actions act = new Actions(driver);
		act.moveToElement(blogEle).contextClick().build().perform();
		
		Thread.sleep(2000);
		
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
	}

	public void doubleClick() 
	{
		WebElement ele = driver.findElement(By.id("10"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).doubleClick().build().perform();
	}
	
	public void DragAndDrop() 
	{
		WebElement src = driver.findElement(By.id("10"));
		WebElement tagret = driver.findElement(By.id("20"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, tagret).perform();
	}
	
	public static void main(String[] args) throws Exception {
		
		ActionsClassExample obj = new ActionsClassExample();
		obj.startBrowser("https://www.softwaretestingmaterial.com/", "Chrome");
		//obj.clickSeleniumOption();
		obj.rightClickEvent();
	}
}
