package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmPagesLog {
	WebDriver driver;
	@FindBy(xpath="//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[13]/div[2]/a[1]/span[1]")
	WebElement signin;

	public WebElement SignIn() { 
		return signin;
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement phno;
	public WebElement PhNo() {
		return phno;
	}
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement cntn;
	public WebElement Continue() {
		return cntn;
	}
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement passw;
	public WebElement PassWord() {
		return passw;
	}
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement si;
	public WebElement SignSub() {
		return si;
	}
	public AmPagesLog(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
	
	
	
//	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
//	WebElement search;
//	public WebElement Search() {
//		return search;
//	}
//	@FindBy(xpath="//header/div[@id='navbar']/div[@id='nav-flyout-iss-anchor']/div[@id='nav-flyout-searchAjax']/div[2]")
//	List<WebElement> dropdown;
//	public List<WebElement> DropDown(){
//		return dropdown;
//	}
//	@FindBy(xpath="//input[@id='nav-search-submit-button']")
//	WebElement magbtn;
//	public WebElement MagButton() {
//		return magbtn;
//	}
//	
	
