package com.selenium.s1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;
public class D72 {
	
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c;
	    @Test(priority=1)
	    public void add(){
	        c=a+b;
	        Assert.assertEquals(c,a+b);
	        System.out.println(c);
	    }
	    @Test(priority=2)
	    public void sub(){
	        c=a-b;
	        Assert.assertEquals(c,a-b);
	        System.out.println(c);
	    }
	    @Test(priority=3)
	    public void mul(){
	        c=a*b;
	        Assert.assertEquals(c,a*b);
	        System.out.println(c);
	    }
	    @Test(priority=4)
	    public void div(){
	        c=a/b;
	        Assert.assertEquals(c,a/b);
	        System.out.println(c);
	    }
	}
