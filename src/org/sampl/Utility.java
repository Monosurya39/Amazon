package org.sampl;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {
	
	public static void CaptureScreenshot(WebDriver driver) throws Exception {
		
		try {
			TakesScreenshot screenshot = ((TakesScreenshot) driver);
			File ScreenshotAs=screenshot.getScreenshotAs(OutputType.FILE);
			File f=new File("C:\\Users\\user\\eclipse-workspace\\Client\\Screenshots.jpg");
			 FileUtils.copyFile(ScreenshotAs, f);
		} catch (WebDriverException e) {
			System.out.println("Error while taking Screenshot"+e.getMessage());
		
	}
	
	

}}
