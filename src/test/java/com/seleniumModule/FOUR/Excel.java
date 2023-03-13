package com.seleniumModule.FOUR;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel {
  @Test(dataProvider = "getLoginData")
public void ValidateLogin(String uname, String pwd) {
	  WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://demo.guru99.com/v4/");
		 driver.findElement(By.id("message23")).sendKeys(uname);
		 driver.findElement(By.id("message18")).sendKeys(pwd);
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		 
		
  }
  @DataProvider
  public Object[][] getLoginData(){
	  Object[][]data =new Object[2][2];
	  data[0][0] = "admin";
	  data[0][1] = "admin123";
	  data[1][0] = "password";
	  data[1][1] = "password123";
	  return data;
  }
}
 
		 
  

	
	
	





 
		 
		 
	  
  
