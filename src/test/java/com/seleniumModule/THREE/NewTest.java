package com.seleniumModule.THREE;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;




public class NewTest {
	
	private WebDriver driver;
	
	@BeforeTest
	 public void initializeDriver() {
		//System.setProperty("webdriver.chrome.driver", "path of driver");
		  WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/login.html");
	}
  
	@Test
	public void login(By driver) {
		WebElement username = driver.findElement((SearchContext)(By.id("authentication")));
				username.sendKeys("usename");
		WebElement password = driver.findElement((SearchContext)(By.id("passwd")));
				password.sendKeys("use123");
		WebElement signin = driver.findElement((SearchContext) By.id("SubmitLogin"));
		signin.click();
		
		String actualUrl="https://demo.guru99.com/test/login.html";
		
		AssertJUnit.assertEquals(null,actualUrl);
		
	  
  }
  
  
  
  
   
  
 @AfterTest
  public void closeDriver() {
	  driver.close();

  }

}
