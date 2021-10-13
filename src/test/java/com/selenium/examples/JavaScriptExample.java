package com.selenium.examples;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExample {
	@Test
		public void logintest() throws InterruptedException {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://google.com/");
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("alert('HI!')");
			Thread.sleep(3000);
			driver.quit();
		 
	}

}
