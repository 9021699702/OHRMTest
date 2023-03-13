package com.seleniumModule.One;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws InterruptedException  {
		
 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");

		 Thread.sleep(4000);
		 driver.navigate().to("https://www.amazon.in/");
		 Thread.sleep(4000);
		 driver.navigate().back();
		 Thread.sleep(4000);
		 driver.navigate().forward();
		 Thread.sleep(4000);
		 driver.navigate().refresh();
		 Thread.sleep(4000);
		 driver.close();
		 		
		 
		 		
	}

}
