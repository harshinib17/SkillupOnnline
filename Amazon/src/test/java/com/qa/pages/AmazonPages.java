package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class AmazonPages 
	{
	     WebDriver Driver;
	     @FindBy(xpath="/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")
	     WebElement searchbox;
	     public WebElement SearchBox()
	     {
	         return searchbox;
	     }
	     @FindBy(xpath="//select[@id='searchDropdownBox']")
	     WebElement dropdown;
	     public WebElement DropDown()
	     {
	         return dropdown;
	     }
	     @FindBy(xpath="//select[@id='searchDropdownBox']")
	     WebElement Dropdown;
	     public WebElement Dropdownbox()
	     {
	         return Dropdown;
	     }
	     @FindBy(xpath="//input[@id='nav-search-submit-button']")
	     WebElement SearchBtn;
	     public WebElement SearchButton() {
	            return SearchBtn;
	        }
	         
	     public AmazonPages(WebDriver Driver)
	     {
	         this.Driver=Driver;
	        PageFactory.initElements(Driver,this); 
	     }

		
	}
	
/*<test thread-count="5" name="Test Chrome" parallel="classes">
  <parameter name="Browser" value="Chrome"/>
   <classes>
      <class name="com.qa.testscripts.TC_AmazonSearch_001"/>
     </classes>
  </test> <!-- Test --> */
