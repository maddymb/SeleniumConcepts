package com.selenium4.features;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabBrowserTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/maddy/Documents/Selenium Jars/chromedriver");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://www.facebook.com");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
		
		//opening new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		//opening google 
		driver.get("http://www.google.co.in");
		
		//opening new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//opening youtube
		
		driver.get("http://www.youtube.com");
		
		
		driver.quit();
		
		
	}

}
