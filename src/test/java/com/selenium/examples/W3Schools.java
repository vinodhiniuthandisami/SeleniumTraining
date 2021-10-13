package com.selenium.examples;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3Schools {
	 
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
	
		if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		}
			 
		else if (browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		 
		}

		else{
		throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	 
	@Test
	public void testParameterWithXML() throws InterruptedException, AWTException{
		driver.get("https://profile.w3schools.com/");   
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Log in")).click();
		WebElement email = driver.findElement(By.xpath("//input[@id='modalusername']"));
		email.sendKeys("vino0595@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("#current-password"));
		password.sendKeys("Dhanvi@123");
	    WebElement submit= driver.findElement(By.className("_1VfsI _OD95i _3_H0V"));
		//driver.findElement(By.cssSelector("div._MdeUd._3-XBs._1YER7:nth-child(1) div._2j6WO div._20LW8:nth-child(5) div:nth-child(1) > button._1VfsI._OD95i._3_H0V")).click();
		//WebElement submit=driver.findElement(By.tagName("button"));
		//submit.click();
		//Thread.sleep(3000);
		//tutorials_text
		

		driver.quit();
}}
