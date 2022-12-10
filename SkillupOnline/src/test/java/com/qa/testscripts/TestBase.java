package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.SkillupPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	SkillupPages sk;
	WebDriver driver;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void Setup(String Browser,String Url)throws IOException
	  {
		if(Browser.equalsIgnoreCase("Chrome"))
		  {
			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		  }
		  else if(Browser.equalsIgnoreCase("firefox"))
		  {
			  WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
		  }
		  else if(Browser.equalsIgnoreCase("Edge"))
		  {
			 // WebDriverManager.edgedriver().setup();
			  System.setProperty("webdriver.edge.driver","C:\\WebDrivers\\msedgedriver1.exe");
			  driver=new EdgeDriver();
		  }
		  sk=new SkillupPages(driver);
		  driver.manage().window().maximize();
		  driver.get(Url);
		
	  }
		@AfterClass
		public void TearDown() 
		{
			driver.close();
		}

}
