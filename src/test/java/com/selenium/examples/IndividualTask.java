package com.selenium.examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IndividualTask{
	@Test
		public void logintest() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement username=driver.findElement(By.cssSelector("#user-name"));
			username.sendKeys("standard_user"); 
			Thread.sleep(3000);
			WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys("secret_sauce"); 
			Thread.sleep(3000);
			WebElement login=driver.findElement(By.cssSelector("#login-button"));
			login.click();
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			boolean Logo = driver.findElement(By.className("app_logo")).isDisplayed();//To check whether Logo is displayed or not
	        
	        if (Logo)
	        {
	        	System.out.println("SWAGLABS Logo is displayed");//It used to print the value when logo is displayed
	        }else
	        {
	        	System.out.println("SWAGLABS Logo is not displayed");//It used to print the value when the logo is not displayed
	        }
			WebElement addtocart=driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
			addtocart.click();
			Thread.sleep(3000);
			WebElement yourcart=driver.findElement(By.className("shopping_cart_link"));
			yourcart.click();
			Thread.sleep(3000);
			WebElement checkout=driver.findElement(By.cssSelector("#checkout"));
			checkout.click();
			Thread.sleep(3000);
			WebElement firstname=driver.findElement(By.cssSelector("#first-name"));
			firstname.sendKeys("vinodhini"); 
			Thread.sleep(3000);
			WebElement lastname=driver.findElement(By.cssSelector("#last-name"));
			lastname.sendKeys("Uthandisami"); 
			Thread.sleep(3000);
			WebElement postalcode=driver.findElement(By.cssSelector("#postal-code"));
			postalcode.sendKeys("123456"); 
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement CONTINUE = driver.findElement(By.cssSelector("#continue"));
	        js.executeScript("arguments[0].scrollIntoView();", CONTINUE);
	        CONTINUE.click();
	        Thread.sleep(3000);
	        WebElement FINISH = driver.findElement(By.cssSelector("#finish"));
	        js.executeScript("arguments[0].scrollIntoView();", FINISH);
	        FINISH.click();
	        Thread.sleep(3000);
	        WebElement back=driver.findElement(By.cssSelector("#back-to-products"));
	        back.click();
	        Thread.sleep(3000);
	        WebElement menu=driver.findElement(By.cssSelector("#react-burger-menu-btn"));
	        menu.click();
	        Thread.sleep(3000);
	        WebElement logout=driver.findElement(By.cssSelector("#logout_sidebar_link"));
	        logout.click();
	        Thread.sleep(3000);
			driver.quit();
		 
	}

}
