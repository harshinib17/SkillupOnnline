package com.qa.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;

public class TC_Amazon_003 extends TestBase{
	AmazonPages amzpages;
	@Parameters({"Browser","Url"})
	@Test
	public void Search(String Browser,String Url) throws InterruptedException
	{
	    amzpages=new AmazonPages(driver);
	    amzpages.SearchBox().sendKeys("iphone"+Keys.ENTER);
JavascriptExecutor js = (JavascriptExecutor)driver;
//        
//        js.executeScript("arguments[0].scrollIntoView();",amzpages.ScrollLim());
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    Thread.sleep(5000);
	    

}
}
