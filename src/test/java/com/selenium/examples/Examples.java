package com.selenium.examples;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Examples {
	static WebDriver driver;
	
	@BeforeTest
	public  void setUp() {
		 WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
	}
	@Test
		 public void Example1() throws InterruptedException { 
			   
				String baseURL = "http://demo.guru99.com/test/newtours/register.php";
				driver.get(baseURL);
				Select drpCountry = new Select(driver.findElement(By.name("country")));
				drpCountry.selectByVisibleText("ANTARCTICA");
				Thread.sleep(3000);
				driver.get("http://jsbin.com/osebed/2");
				Select fruits = new Select(driver.findElement(By.id("fruits")));
				fruits.selectByVisibleText("Banana");
				fruits.selectByIndex(1);
				Thread.sleep(3000);
				
		 }
	@AfterTest() 
	public void Closewindow() 
	{ 
		driver.close(); 
}

	}


