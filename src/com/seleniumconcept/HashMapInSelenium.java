package com.seleniumconcept;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapInSelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/maddy/Documents/Selenium Jars/chromedriver");
		 
		// Initialize browser
		//WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		//driver.get("https://ui.freecrm.com/");
		 
		// Maximize browser
		 
		//driver.manage().window().maximize();
		
		
		System.out.println(getCredentialsMap());
		
		System.out.println(getCredentialsMap().get("Admin").split(":")[0]);
		System.out.println(getCredentialsMap().get("Admin").split(":")[1]);
		
		//driver.quit();
		
		
	}

	public static HashMap<String,String> getCredentialsMap() {
		
		HashMap<String,String> userMap= new HashMap<String,String>();
		
		userMap.put("Admin", "madhur@gmail.com:madhur");
		userMap.put("Seller", "deepali@gmail.com:madhur");
		userMap.put("Customer", "anoosha@gmail.com:madhur");
		userMap.put("CustomerCare", "jayshree@gmail.com:madhur");
		
		return userMap;
		
	}
	
}
