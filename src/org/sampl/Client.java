package org.sampl;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Client {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Client\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Menu = driver.findElement(By.id("nav-hamburger-menu"));
		Menu.click();
		
		WebElement Mobiles = driver.findElement(By.xpath("//div[contains(text(),'Mobiles, Computers')]"));
		System.out.println(Mobiles);
        Mobiles.click();	
        
        WebElement AllMobiles = driver.findElement(By.xpath("//a[text()='All Mobile Phones']"));
        AllMobiles.click();
        
		WebElement Samsung = driver.findElement(By.xpath("//span[text()='Samsung']"));
		Samsung.click();
		
		Utility.CaptureScreenshot(driver);
		
		
		String ParentWindow = driver.getWindowHandle();
		System.out.println(ParentWindow);
		
	
		WebElement SamsungGalaxy = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div[1]/span/a/div/img"));
		SamsungGalaxy.click();
		
		Set<String> EveryWindows = driver.getWindowHandles();
		System.out.println(EveryWindows);
		
		for (String EachWindow : EveryWindows) {
			if(!ParentWindow.equals(EveryWindows)) {
			driver.switchTo().window(EachWindow);
		}}
		
		    WebElement AddToKart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			AddToKart.click();
			boolean displayed = driver.findElement(By.xpath("//h1[text()=' About this item ']")).isDisplayed();
			System.out.println(displayed);
			
			Utility.CaptureScreenshot(driver);
			
		    driver.switchTo().window(ParentWindow);
		
		WebElement Apple = driver.findElement(By.xpath("//span[text()='Apple']"));
		Apple.click();
		
		
	}
}
