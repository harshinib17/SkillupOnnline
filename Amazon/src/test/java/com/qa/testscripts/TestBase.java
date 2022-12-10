package com.qa.testscripts;
	import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.AmazPages;


import io.github.bonigarcia.wdm.WebDriverManager;

	public class TestBase 
	{
	    AmazPages am;
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
	      else if(Browser.equalsIgnoreCase("Firefox"))
	      {
	          WebDriverManager.firefoxdriver().setup();
	          driver=new FirefoxDriver();
	      }
	      else if(Browser.equalsIgnoreCase("Edge"))
	      {
	    	  System.setProperty("webdriver.edge.driver","C:\\\\WebDrivers\\\\msedgedriver.exe");
	    	 // WebDriverManager.edgedriver().setup();
	    	  driver=new EdgeDriver();
	      }
	      am=new AmazPages(driver);
	      driver.manage().window().maximize();
	      driver.get(Url);
	    
	  }
	    @AfterClass
	    public void TearDown() 
	    {
	        driver.close();
	    }

}
