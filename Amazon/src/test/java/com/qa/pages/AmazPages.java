package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazPages {
	WebDriver driver;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchbox;
	public WebElement getSearchBox() {
		return searchbox;
	}
	@FindBy(xpath="//header/div[@id='navbar']/div[@id='nav-flyout-iss-anchor']/div[@id='nav-flyout-searchAjax']/div[2]")
	List<WebElement> All;
	
	public List<WebElement> getAll(){
		return All;
	}
	
	@FindBy(xpath="//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]")
	WebElement click;
	public WebElement ClickH() {
		return click;
	}
	@FindBy(xpath="//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[13]/div[2]/div[1]/a[1]")
	WebElement start;
	public WebElement StartC() {
		return start;
	}
	@FindBy(xpath="//input[@id='ap_customer_name']")
	WebElement name;
	public WebElement Name() {
		return name;
	}
	@FindBy(xpath="//input[@id='ap_phone_number']")
	WebElement phno;
	public WebElement PhNO() {
		return phno;
	}
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email;
	public WebElement EMail() {
		return email;
	}
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement passwd;
	public WebElement Password() {
		return passwd;
	}
	@FindBy(xpath="//input[@id='continue']")
	WebElement contn;
	public WebElement Continue() {
		return contn;
	}
	
	public AmazPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
