package com.selenium.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginExample {
	@Test
		public void logintest() throws InterruptedException {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.id("txtUsername"));
			WebElement username=driver.findElement(By.id("txtUsername"));
			username.sendKeys("Admin"); 
			Thread.sleep(3000);
			driver.findElement(By.id("txtPassword"));
			WebElement password=driver.findElement(By.id("txtPassword"));
			password.sendKeys("admin123"); 
			Thread.sleep(3000);
			WebElement login=driver.findElement(By.id("btnLogin"));
			login.click();
			Thread.sleep(3000);
			driver.quit();
		 
	}

}
