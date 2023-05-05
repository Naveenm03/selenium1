package com.selenium.s1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d53 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		
		WebElement fn=driver.findElement(By.name("cusid"));
		fn.sendKeys("401");
		WebElement sub=driver.findElement(By.name("submit"));
		sub.click();
		Alert al=driver.switchTo().alert();
		al.dismiss();
        fn.clear();
        WebElement ln=driver.findElement(By.name("cusid"));
		ln.sendKeys("402");
		WebElement subm=driver.findElement(By.name("submit"));
		subm.click();
		al.accept();
		Alert al2=driver.switchTo().alert();
		String s=al2.getText();
		al2.accept();
		System.out.println(s);
	}

}
