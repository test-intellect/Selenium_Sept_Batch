package day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseClass;

public class HandleAlerts extends BaseClass
{
	
	
	public void acceptAlert() throws InterruptedException 
	{
		WebElement btn = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		btn.click();
		
		Thread.sleep(3000);

		Alert at = driver.switchTo().alert();
		
		String txt =at.getText();
		System.out.println(txt);
		at.accept();
		
	}
	
	
	public void dismissAlert() throws InterruptedException 
	{
		WebElement btn = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		btn.click();
		
		Thread.sleep(3000);

		Alert at = driver.switchTo().alert();
		
		at.dismiss();
		
	}
	
	public void sendKeysAlert() throws InterruptedException 
	{
		WebElement btn = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		btn.click();
		
		Thread.sleep(3000);

		Alert at = driver.switchTo().alert();
		
		at.sendKeys("Balamurugan");
		at.accept();
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		HandleAlerts obj = new HandleAlerts();
		obj.startBrowser("https://shareselenium.herokuapp.com/Alerts.html", "Chrome");
		//obj.acceptAlert();
		//obj.dismissAlert();
		obj.sendKeysAlert();
	}

}
