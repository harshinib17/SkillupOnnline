package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_AmazonSearch_002 extends TestBase {
	AmazPages am;
	@Parameters({"Browser","Url"})
@Test
public void SearchAmazon(String Browser,String Url) throws InterruptedException{
//	WebDriverManager.chromedriver().setup();
//	//WebDriverManager.firefoxdriver().setup(); // no need for geckodriver()
//	//WebDriverManager.edgedriver().setup();
//	WebDriver driver=new ChromeDriver();
//	//WebDriver driver=new FirefoxDriver();
//	//WebDriver driver=new EdgeDriver(); //not coming
//	driver.get("https://www.amazon.in/");
		
		AmazPages am=new AmazPages(driver);
	System.out.println("Page landed on "+driver.getTitle());
	am.getSearchBox().sendKeys("Samsung mobiles");
	Thread.sleep(5000);
   List<WebElement> All=am.getAll();
	Thread.sleep(5000);
	for(WebElement i:All)
	{
		System.out.println(i.getText());
	}
	
}
}
