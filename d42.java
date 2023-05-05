package com.selenium.s1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d42 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");

		WebElement fn=driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
		fn.sendKeys("Maha");
		WebElement ln=driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
		ln.sendKeys("jamindar");
		WebElement em=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		em.sendKeys("jamindar03@gmail.com");
		WebElement pw=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		pw.sendKeys("jamin@03");
		WebElement sub=driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]"));
		sub.click();
	}

}
