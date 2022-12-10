package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchA {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		String browser = "chrome";
		if(browser.equalsIgnoreCase("Chrome"));
		{
			System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 11");
		
		WebElement magbn=driver.findElement(By.id("nav-search-submit-button"));
		magbn.click();
		
		Thread.sleep(5000);
		title=driver.getTitle();
		System.out.println(title);
		
		//WebElement 
	}

}
