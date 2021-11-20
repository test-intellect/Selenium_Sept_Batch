package day9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseClass;

public class WindowHandle extends BaseClass {

	public void switchToChildWindow() {

		String parentWindowSessionID = driver.getWindowHandle();
		System.out.println("Parent window session id is :: " + parentWindowSessionID);

		WebElement ele = driver.findElement(By.id("home"));
		ele.click();

		Set<String> allWinSessionIDs = driver.getWindowHandles();
		System.out.println("All window session Ids:: " + allWinSessionIDs);


		for (String win : allWinSessionIDs) 
		{ 
			if(!win.equals(parentWindowSessionID))
			{
				driver.switchTo().window(win);
			} 
		}

		System.out.println(driver.getCurrentUrl());
		driver.close(); // current browser where driver control is
		
		
		driver.switchTo().window(parentWindowSessionID);
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		System.out.println(driver);
		
	

	}

	public static void main(String[] args) {
		WindowHandle obj = new WindowHandle();
		obj.startBrowser("https://shareselenium.herokuapp.com/WindowsHandle.html", "Chrome");
		obj.switchToChildWindow();

	}

}
