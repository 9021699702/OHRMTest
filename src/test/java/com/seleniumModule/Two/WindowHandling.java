package com.seleniumModule.Two;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://demo.guru99.com/popup.php");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("/html/body/p/a")).click();
		 
		 
		 String ParentWindow = driver.getWindowHandle();
		 
		 Set<String> s1=driver.getWindowHandles();		
		String ChildWindow = null;
		
		 for(String abc : s1) {
			 if(abc.equals(ParentWindow)) {
			 }
			 else {
					ChildWindow = abc;
					
				}
				 driver.switchTo().window(ChildWindow);
				
				 driver.findElement(By.name("emailid")).sendKeys("desaipriyanka2018@gmail.com");
				 driver.findElement(By.name("btnLogin")).click();
				 		
			 }
			
		}
	       
		 
		 
		 
		 
}