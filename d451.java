package com.selenium.s1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d451 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		String t1=driver.getCurrentUrl();
		String t2="https://j2store.net/free/";
		System.out.println(t1);
		if(t1.equals(t2)) {
			System.out.println("Correct Url");
		}else {
			System.out.println("InCorrect Url");
		}
		WebElement clo=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
		clo.click();
		String s1=driver.getCurrentUrl();
		System.out.println(s1);
		String s2="https://j2store.net/free/index.php/shop?filter_catid=11";
		if(s1.equals(s2)) {
			System.out.println("Correct  2nd Url");
		}else {
			System.out.println("InCorrect 2nd Url");
		}
	}

}
