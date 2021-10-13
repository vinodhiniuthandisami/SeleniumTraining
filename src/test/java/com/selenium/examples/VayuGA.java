package com.selenium.examples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VayuGA {
	 
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
		driver.get("https://opensource-demo.orangehrmlive.com/");   
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		Thread.sleep(3000);
	    WebElement password = driver.findElement(By.name("txtPassword")); 		
		password.sendKeys("admin123");
		Thread.sleep(3000);
	    WebElement submit = driver.findElement(By.className("button"));
	    submit.click(); Thread.sleep(3000);
	    WebElement leave = driver.findElement(By.xpath("//b[contains(text(),'Leave')]")); 
		leave.click(); 
		Thread.sleep(2000); 
		WebElement configure =driver.findElement(By.cssSelector("#menu_leave_Configure"));
		configure.click(); 
		Thread.sleep(3000);
		WebElement holiday=driver.findElement(By.partialLinkText("Holida"));
		holiday.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
        // Scroll Up using Robot class
		/*
		 * robot.keyPress(KeyEvent.VK_PAGE_UP); robot.keyRelease(KeyEvent.VK_PAGE_UP);
		 */
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	    //js.executeScript("window.scrollBy(0,-250)", "");
		//WebElement Welcome = driver.findElement(By.linkText("Welcome Boney?"));
        //js.executeScript("arguments[0].scrollIntoView();", Welcome);
        //Thread.sleep(3000);
		//Boolean eleSelect = driver.findElement(By.linkText("New Year's Day")).isDisplayed();
        WebElement welcome=driver.findElement(By.linkText("Welcome Boney"));
        welcome.click();
        Thread.sleep(3000);
        WebElement logout=driver.findElement(By.tagName("input"));
        logout.click();
		Thread.sleep(3000);
		  driver.quit();
	}

}
