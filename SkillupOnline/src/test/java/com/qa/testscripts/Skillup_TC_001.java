package com.qa.testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.SkillupPages;


public class Skillup_TC_001 extends TestBase {
	SkillupPages sk;

	@Parameters({"Browser","Url"})
    @Test
    public void testSkillup(String Browser,String Url) throws InterruptedException
    {
		sk=new SkillupPages(driver);
		sk.Signup().click();
		sk.Email().sendKeys("harshibala06@gmail.com");
		sk.Name().sendKeys("Harshini B");
		sk.Password().sendKeys("Harshini@17");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
    
    }

}
