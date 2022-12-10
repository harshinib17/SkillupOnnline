package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.AmPagesLog;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_AmazonSignIn {
	@Test
	public void Signin() throws InterruptedException   {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		AmPagesLog log=new AmPagesLog(driver);
		driver.get("https://www.amazon.in");
		System.out.println("PAGE LANDED ON "+driver.getTitle());
		Thread.sleep(2000);
		log.SignIn().click();
		log.PhNo().sendKeys("9150947347");
		log.Continue().click();
		Thread.sleep(2000);
		log.PassWord().sendKeys("Harshini@17");
		log.SignSub().click();
	}
}	
		
		
		
		
		
//		log.Search().sendKeys("iphone");
//		log.MagButton().click();
	//	System.out.println(driver.getTitle());
//		Thread.sleep(3000);
//		List<WebElement> dropdown=log.DropDown();
//		Thread.sleep(3000);
//		for(WebElement i:dropdown)
//		{
//			System.out.println(i.getText());
//		}
//	}
	
//	@Test
//	public void Search() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		AmPagesLog l=new AmPagesLog(driver);
//		driver.get("https://www.amazon.in");
//		System.out.println("PAGE LANDED ON "+driver.getTitle());
//		l.Search().sendKeys("iphone");
//		List<WebElement> dropdown=l.DropDown();
//		Thread.sleep(3000);
//		for(WebElement i:dropdown)
//		{
//			System.out.println(i.getText());
//		}
//	}

