package com.seleniumModule.THREE;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AssignmentThree {
	private By driver;



	@Test(priority = 0)
	public void initialization() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demoqa.com/");
	driver.manage().timeouts().getImplicitWaitTimeout();
	
}
	@Test(priority = 1)
	public void driver(){

	By driver = null;
	extracted(driver).findElement((SearchContext) By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/svg/g/path")).click();
		System.out.println("click on form");
		
	}
	private By extracted(By driver) {
		return driver;
	}
	
		
	
	@Test(priority = 2)
	public void clickPracticeForm() {
		driver = null;
		driver.findElement((SearchContext) By.xpath("//*[@id=\"item-0\"]")).click();
		
	}
}

