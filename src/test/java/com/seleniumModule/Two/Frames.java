package com.seleniumModule.Two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://demo.guru99.com/test/guru99home/");
		 driver.manage().window().maximize();
		 driver.switchTo().frame("Jmeter720");
		 System.out.println("...........we are switch to iframe...........");
		 driver.findElement(By.xpath("/html/body/a/img")).click();
System.out.println("....done...");
	}

}
