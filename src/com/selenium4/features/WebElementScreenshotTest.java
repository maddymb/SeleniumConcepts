package com.selenium4.features;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebElementScreenshotTest {

	WebDriver driver= null;
	
	@BeforeMethod
	public void setup() {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/maddy/Documents/Selenium Jars/chromedriver");
		 
		// Initialize browser
		driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("https://www.google.co.in");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() throws IOException {
	
		
		WebElement fbLogo= driver.findElement(By.xpath("//*[@class='fb_logo img sp_W-v012zTIDG sx_4f5409']"));
		
		File logo= fbLogo.getScreenshotAs(OutputType.FILE);
		
		File fileDesination = new File("/Users/maddy/eclipse-workspace/Selenium4/ScreenShot/logo.png");
		
		FileUtils.copyFile(logo,fileDesination );
		
		
		
		
	}
	
	@AfterMethod
	public void quit() {
		
		driver.quit();
		
	}

}
