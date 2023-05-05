package com.selenium.s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		
				WebDriverManager.chromedriver().setup();
		    	ChromeOptions co=new ChromeOptions();
		    	co.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(co);
		    	//open link and maximize
		    	driver.get("https://j2store.net/free/index.php/shop?filter_catid=11");
		    	driver.manage().window().maximize();
		    	WebElement sort1=driver.findElement(By.name("sortby"));
		    	sort1.click();
		    	Select s1=new Select(sort1);
		    	s1.selectByIndex(2);
		    	
		    	
		    	
		    	
			}

		}

	
