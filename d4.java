package com.selenium.s1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Hello");
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.className("gNO89b")).submit();
		driver.quit();
		}

}
