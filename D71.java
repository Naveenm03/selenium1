package com.selenium.s1;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class D71 {
	WebDriver driver;
  
@Test
  public void f()  {
	String t1=driver.getTitle();
	System.out.println(t1);
	String t2="Guest Registration Form – User Registration";
	assertEquals(t1,t2);
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
  	ChromeOptions co=new ChromeOptions();
  	co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.manage().window().maximize();
		
  }

  @AfterTest
  public void afterTest() {
	 
  }

}
