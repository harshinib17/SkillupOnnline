package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginA {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		String browser="chrome";
		if(browser.equalsIgnoreCase("chrome"))
		{
System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
 driver = new ChromeDriver();
		}
driver.get("http://www.amazon.in");
driver.findElement(By.id("nav-link-accountList")).click();
driver.findElement(By.id("ap_email")).sendKeys("9150947347");
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("ap_password")).sendKeys("Harshini@17");
driver.findElement(By.id("signInSubmit")).click();
Thread.sleep(5000);
System.out.println(driver.getTitle());
Thread.sleep(5000);

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
driver.findElement(By.id("nav-search-submit-button")).click();
driver.findElement(By.id("a-autoid-0-announce")).click();
driver.findElement(By.id("s-result-sort-select_2")).click();
Thread.sleep(5000);
System.out.println(driver.getTitle());
Thread.sleep(5000);

WebElement proview=driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 13 Pro (1TB) - Gold')]"));
proview.click();
Thread.sleep(5000);
System.out.println(driver.getTitle());
Thread.sleep(5000);

//WebElement color=driver.findElement(By.xpath("//img[@id='']"));
//color.click();

//WebElement buy=driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='rightCol']/div[@id='desktop_buybox']/div[@id='buybox']/div[@id='desktop_accordion']/div[@id='accordionRows_feature_div']/div[@id='accordionRows']/div[@id='buyBoxAccordion']/div[@id='buyBackAccordionRow']/div[1]/div[1]/a[1]/i[1]"));
//buy.click();
//System.out.println(driver.getTitle());
	}

}
