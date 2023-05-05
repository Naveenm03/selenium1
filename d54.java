package com.selenium.s1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d54 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		WebElement st=driver.findElement(By.id("source"));
		st.sendKeys("Coimbatore");
		WebElement des=driver.findElement(By.id("destination"));
		des.sendKeys("Trichy");
		Thread.sleep(3000);
		WebElement dat=driver.findElement(By.id("datepicker1"));		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','03-05-2023')",dat);
//		Thread.sleep(3000);
//		WebElement sear=driver.findElement(By.id("seo_search_btn"));
//		sear.click();
	}

}
