package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmPagesSi {
	WebDriver driver;
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
	public AmPagesSi(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		
}
