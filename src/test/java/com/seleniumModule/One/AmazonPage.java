package com.seleniumModule.One;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement username = driver.findElement(By.id("ap_email"));
		 username.sendKeys("desaipriyanka2018@gmail.com");
		 
		 driver.findElement(By.name("password")).sendKeys("Abhipriya@11");
		 
		 driver.findElement(By.name("login")).click();
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("FireBoltt");
 		WebElement searchResult = driver.findElement(By.id("a-popover-root"));
		searchResult.click();

	}


}
