package com.selenium.s1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d55 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.name("q")).sendKeys("Apple");
		driver.findElement(By.className("gNO89b")).submit();
		String t1=driver.getTitle();
		System.out.println(t1);
		String i1=driver.getWindowHandle();
		System.out.println(i1);
		
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co2=new ChromeOptions();
    	co2.addArguments("--remote-allow-origins=*");
		WebDriver driver1=new ChromeDriver(co2);
		
		driver1.get("https://www.google.com/");
		driver1.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor jse2 = (JavascriptExecutor)driver1;
		jse2.executeScript("window.scrollBy(0,1000)");
		driver1.findElement(By.name("q")).sendKeys("Selenium");
		driver1.findElement(By.className("gNO89b")).submit();
		String t2=driver1.getTitle();
		System.out.println(t2);
		String i2=driver1.getWindowHandle();
		System.out.println(i2);
		
		
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co3=new ChromeOptions();
    	co3.addArguments("--remote-allow-origins=*");
		WebDriver driver2=new ChromeDriver(co3);
		
		driver2.get("https://www.google.com/");
		driver2.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor jse3 = (JavascriptExecutor)driver2;
		jse3.executeScript("window.scrollBy(0,1000)");
		driver2.findElement(By.name("q")).sendKeys("Cucumber");
		driver2.findElement(By.className("gNO89b")).submit();
		String t3=driver2.getTitle();
		System.out.println(t3);
		String i3=driver2.getWindowHandle();
		System.out.println(i3);
		
		//driver.switchTo().newWindow(WindowType.TAB);
//		Set<String> s=driver.getWindowHandles();
//		System.out.println("no.of tabs opened: " +s.size());
		
		
	}

}
