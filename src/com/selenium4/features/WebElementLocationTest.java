package com.selenium4.features;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLocationTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/maddy/Documents/Selenium Jars/chromedriver");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://www.facebook.com");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
		
		WebElement fbLogo= driver.findElement(By.xpath("//*[@class='fb_logo img sp_W-v012zTIDG sx_4f5409']"));
		
		System.out.println("Size "+fbLogo.getSize());
		System.out.println("Size "+fbLogo.getLocation());
		
		System.out.println("Height "+fbLogo.getRect().getDimension().getHeight());
		System.out.println("Width "+fbLogo.getRect().getDimension().getWidth());
		System.out.println("X Location "+fbLogo.getRect().getX());
		System.out.println("Y Location "+fbLogo.getRect().getY());
		
		
		
		driver.quit();
		
		
	}

}
