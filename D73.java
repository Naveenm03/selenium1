package com.selenium.s1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class D73 {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  Thread.sleep(3000);
	  WebElement un=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	  un.sendKeys("Admin");
	  	
		WebElement pwd=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		pwd.sendKeys("admin123");
		WebElement ln=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		ln.click();
		String link1="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String link2="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String link3=driver.getCurrentUrl();
		
		Assert.assertEquals(link2,link3);
		System.out.println("successfull");	
		
		
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  	ChromeOptions co=new ChromeOptions();
	  	co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
