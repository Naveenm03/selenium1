package com.selenium.s1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class D92 {
	WebDriver driver;

    @Test
    public void testcase1() throws InterruptedException {

    	WebDriverManager.chromedriver().setup();
	  	ChromeOptions co=new ChromeOptions();
	  	co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
        String url = "https://www.godaddy.com/en-in";
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        String Actual_url = "https://www.godaddy.com/en-in";
        String Expected_url = driver.getCurrentUrl();

        String Actual_title = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
        String Expected_title = driver.getTitle();

        Assert.assertEquals(Actual_title,Expected_title);
        Assert.assertEquals(Actual_url,Expected_url);

        driver.close();
    }

    @Test
    public void testcase2() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
	  	ChromeOptions co=new ChromeOptions();
	  	co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
        String url =  "https://www.godaddy.com/en-in";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement domain = driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button"));
        domain.click();

        WebElement dns =driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a"));
        dns.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.close();

    }

    
}
