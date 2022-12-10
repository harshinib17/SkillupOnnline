package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillupPages {
	WebDriver driver;
	@FindBy(xpath="/html/body/div/div/header/nav/div[1]/div[3]/ul[4]/li[3]/a")//*[@id="headerBody"]/nav/div[1]/div[3]/ul[4]/li[3]/a
	
	WebElement signup;
	public WebElement Signup() {
		return signup;
	}
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	public WebElement Email() {
		return email;
	}
	@FindBy(xpath="//input[@id='name']")
	WebElement name;
	public WebElement Name() {
		return name;
	}
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	public WebElement Password() {
		return password;
	}
	@FindBy(xpath="//header/nav[1]/div[1]/div[3]/ul[2]/li[1]/form[1]/div[1]/input[1]")
	WebElement searchbox;
	public WebElement SearchBox() {
		return searchbox;
	}
	@FindBy(xpath="//header/nav[1]/div[1]/div[3]/ul[2]/li[1]/form[1]/div[1]/span[1]/button[1]/*[1]")
	WebElement mgnbtn;
	public WebElement MgnBtn() {
		return mgnbtn;
	}
	@FindBy(xpath="//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	List<WebElement> allitems;
	public List<WebElement> getAll(){
		return allitems;
	}
	public SkillupPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
