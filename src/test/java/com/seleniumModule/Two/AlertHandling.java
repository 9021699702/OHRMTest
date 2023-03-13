package com.seleniumModule.Two;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.findElement(By.name("cusid")).sendKeys("280819");
driver.findElement(By.name("submit")).click();
Thread.sleep(2000);

Alert ok = driver.switchTo().alert();
ok.accept();
Thread.sleep(2000);
Alert ok1 = driver.switchTo().alert();
ok1.accept();
driver.close();



	}

}
