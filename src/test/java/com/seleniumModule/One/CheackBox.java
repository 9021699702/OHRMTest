package com.seleniumModule.One;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheackBox {

	public static void main(String[] args) throws InterruptedException {
		checkBoxes();
		

	}

	private static void checkBoxes() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://demo.guru99.com/test/radio.html");
		 //Find Option 1
		 driver.findElement(By.xpath("//*[@id=\"vfb-7-1\"]")).click();
		 Thread.sleep(5000);
		 //Find Chechbox2 and Chechbox3
		 driver.findElement(By.xpath("//*[@id=\"vfb-6-1\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"vfb-6-2\"]")).click();
		 Thread.sleep(5000);
		 driver.close();
	}
	
		
		
	}
	

