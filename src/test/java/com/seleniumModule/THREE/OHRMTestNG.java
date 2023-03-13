package com.seleniumModule.THREE;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OHRMTestNG {

	
	private By driver;
	//Login Function
	@BeforeMethod 
	public void homepage() {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test
	public void login() {
		
		WebElement username = driver.findElement((SearchContext) By.name("username"));
		username.sendKeys("Admin");
		 
		 WebElement password = driver.findElement((SearchContext) By.name("password"));
		 password.sendKeys("admin123");
		 
		 WebElement login = driver
				 .findElement((SearchContext) By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		 login.click();
		
	}
	//Forgot password function
	@Test
	public void forgotpass() {
		driver = null;
		WebElement actualmsg = driver
				.findElement((SearchContext) By.xpath("//div[@id='forgotPasswordLink']/a"));
		String actual=actualmsg.getText();
		System.out.println("Actual message:"+actual);
		
		String expected="Forgot your password?";
		
		if(actual.equals(expected))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
	}
	
	//Search Dash board Function
	@Test
	public void search() {
		WebElement search = driver
				.findElement((SearchContext)By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input"));
		search.sendKeys("PIM");
 		WebElement searchResult = driver
 				.findElement((SearchContext) By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span"));
		searchResult.click();
	}
	
	// For add new employee login
	@Test
	public void addemployee() {
		WebElement addemployee = driver.findElement((SearchContext)By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/div[1]/li/a"));
		addemployee.click();
		WebElement fname = driver.findElement((SearchContext) By.name("firstName"));
		fname.sendKeys("Priyanka");	
		WebElement lname = driver.findElement((SearchContext) By.name("lastName"));
		lname.sendKeys("D");
		WebElement save = driver.findElement((SearchContext) By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
		save.click();
		
	}
	
	// Search Employee Contact
	 @Test
	 public void directoryemployee() {
		 WebElement clickable = driver
				 .findElement((SearchContext) By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a"));
	     clickable.click();
	     WebElement name = driver
	    		 .findElement((SearchContext) By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
	     name.sendKeys("Priyanka D");
	     WebElement job = driver
	    		 .findElement((SearchContext) By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]"));
	     job.click();
	     Actions act = new Actions((WebDriver) driver);
	     act.scrollToElement(job).keyDown("QAEnegineer").contextClick().build().perform();
	     WebElement location = driver
	    		 .findElement((SearchContext) By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i"));
	     location.click();
	     Actions locaction = new Actions((WebDriver) job);
	     locaction.scrollToElement(job).keyDown("Candian Regional HQ").contextClick().build().perform();
	     WebElement button =driver
	    		 .findElement((SearchContext) By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
	     button.click();
	    	 
	 }
	 //Fill Contact Information
	@Test
	public void contactinfo() {
		WebElement myinfo =driver
	    		 .findElement((SearchContext) By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a"));
	     myinfo.click();
	     WebElement contact =driver
	    		 .findElement((SearchContext) By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a"));
	     contact.click();
	     WebElement address =driver
	    		 .findElement((SearchContext) By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"));
	     address.sendKeys("Dhaori"); 
	     WebElement country =driver
	    		 .findElement((SearchContext) By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i"));
	     country.click(); 
	     Actions countryact = new Actions((WebDriver) driver);
	     countryact.scrollToElement(country).keyDown("indian").contextClick().build().perform();
	     WebElement sbutton =driver
	    		 .findElement((SearchContext) By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button"));
	     sbutton.click(); 
		
	}
}


