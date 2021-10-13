package com.selenium.examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class VerifyWordpressLogin 
{
 
 
@Test
public void verifyValidLogin() throws InterruptedException
{
	WebDriverManager.firefoxdriver().setup();
 
    WebDriver driver=new FirefoxDriver();
 
    driver.manage().window().maximize();
 
    driver.get("https://opensource-demo.orangehrmlive.com/");
 
	LoginPage login=new LoginPage(driver);
	login.typeUserName("Admin");
	Thread.sleep(3000);
	login.typePassword("admin123");
	Thread.sleep(3000);
	login.clickOnLoginButton();
 
	driver.quit();
 
}
 
 
}