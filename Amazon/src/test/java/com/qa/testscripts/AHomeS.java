package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AHomeS {

	public static void main(String[] args) {
		WebDriver driver = null;
        String browser="Chrome";
        if(browser.equalsIgnoreCase("chrome")) {
     	   System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
    		driver=new ChromeDriver();
     	
        }
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
        driver.findElement(By.partialLinkText("Selenium")).click();
        driver.close();
        
        System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
    
     driver.close();


	}

}
