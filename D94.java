package com.selenium.s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class D94 {
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
	  
	  @Parameters("browser")
	  @BeforeMethod
	  public void beforeMethod(String b1) {
		  if(b1.equals("chrome")) {
		  WebDriverManager.chromedriver().setup();
		  	ChromeOptions co=new ChromeOptions();
		  	co.addArguments("--remote-allow-origins=*");
				driver=new ChromeDriver(co);driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
		  }
		  else if(b1.equals("edge")) {
			  WebDriverManager.edgedriver().setup();
			  driver=new EdgeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  }
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }

	}

