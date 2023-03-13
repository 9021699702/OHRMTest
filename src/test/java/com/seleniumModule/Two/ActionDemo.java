package com.seleniumModule.Two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get(" https://jqueryui.com/");
		 driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
		driver.switchTo().frame(driver.findElement(By.id("</iframe>")));
		 WebElement Source = driver.findElement(By.id("draggable"));
		// WebElement Target = driver.findElement(By.xpath("droppable"));
		 Actions act = new Actions(driver);
		 act.dragAndDropBy(Source, 161, 9).build().perform();
		 act.moveByOffset(161, 9).click().build().perform();
		 
		// act.dragAndDrop(Source, Target).build().perform();
		 
		 
		 
		 
;	}

}
