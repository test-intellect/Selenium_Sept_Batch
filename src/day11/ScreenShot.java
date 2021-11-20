package day11;

import common.BaseClass;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class ScreenShot extends BaseClass{
	
	
	
	public void takeScreenShot() throws IOException 
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("./Screenshot/test.png"));
	}

	
	public static void main(String[] args) throws IOException {
		ScreenShot obj = new ScreenShot();
		obj.startBrowser("http://google.com/", "Chrome");
		obj.takeScreenShot();
	}
}
