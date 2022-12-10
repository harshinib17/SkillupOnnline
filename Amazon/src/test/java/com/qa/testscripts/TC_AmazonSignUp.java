package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmPagesSi;
import com.qa.pages.AmazPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_AmazonSignUp extends TestBase {
	AmazPages am;
	@Parameters({"Browser","Url"})
	@Test
	public void SignUp(String Browser,String Url) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://www.amazon.in/");
		AmazPages am=new AmazPages(driver);
		System.out.println("Page landed on "+driver.getTitle());
//		Thread.sleep(2000);
//		am.ClickH().click();
//		Thread.sleep(2000);
		am.StartC().click();
		//Thread.sleep(3000);
		am.Name().sendKeys("Riya");
		am.PhNO().sendKeys("9360015420");
		am.EMail().sendKeys("harshibala06@gmail.com");
		am.Password().sendKeys("RiyaShini@11");
		System.out.println(driver.getTitle());
		am.Continue().click();
	}

}
