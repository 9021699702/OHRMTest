package com.seleniumModule.One;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	
	
	public static void main(String[] args) { 
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 WebElement username = driver.findElement(By.id("email"));
		 username.sendKeys("Aaradhy");
		 
		 driver.findElement(By.id("pass")).sendKeys("TestUsername");
		 
		 driver.findElement(By.name("login")).click();
		 
		 driver.close();
		 
		 
		 
		 
		 
	}

}
