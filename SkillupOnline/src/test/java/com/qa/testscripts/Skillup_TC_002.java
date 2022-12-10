package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.SkillupPages;

public class Skillup_TC_002 extends TestBase{
	SkillupPages sk;

	@Parameters({"Browser","Url"})
    @Test
    public void testSkillup2(String Browser,String Url) throws InterruptedException
    {
		
		sk=new SkillupPages(driver);
		sk.SearchBox().sendKeys("artificial intelligence");
		sk.MgnBtn().click();
		//Thread.sleep(3000);
		 List<WebElement> allitems=sk.getAll();
			Thread.sleep(5000);
			for(WebElement i:allitems)
			{
				System.out.println(i.getText());
			}
			
			//System.out.println("You have landed on "+driver.getTitle());
    }

}
