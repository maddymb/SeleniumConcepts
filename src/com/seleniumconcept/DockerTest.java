package com.seleniumconcept;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.io.IOException;
import java.net.URL;

public class DockerTest {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DesiredCapabilities cap = new DesiredCapabilities();
		 
		cap.setBrowserName(BrowserType.CHROME);
		
		// Initialize browser
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"), cap);
		 
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