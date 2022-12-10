package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomepageA {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		System.out.println(driver.getTitle());
		
		 System.setProperty("webdriver.edge.driver","C:\\WebDrivers\\msedgedriver.exe");
			
			WebDriver driver1 = new EdgeDriver();
			driver1.get("http://www.amazon.in");
			System.out.println(driver1.getTitle());
			
           System.setProperty("webdriver.gecko.driver","C:\\WebDrivers\\geckodriver.exe");
			
			WebDriver driver2 = new FirefoxDriver();
			driver2.get("http://www.amazon.in");
			System.out.println(driver2.getTitle());

	}

}
