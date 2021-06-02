package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.Baseclass.BaseClass;
import com.qa.pages.amazon1page;
import com.qa.pages.amazon2page;

import junit.framework.Assert;

public class Amazon1Test extends BaseClass{

	amazon1page page1;
	amazon2page page2;
	
	public Amazon1Test() {
		super();
	}
	@BeforeMethod
	public void openurl() {
		init();
		page1 = new amazon1page();
			
	}
	
	//@Test
	public void t1() {
		String t = amazon1page.validatepagetitle();
		Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",t);
		System.out.println("ok");
	}
	
	@Parameters(value= {"productname"})
	@Test
	public void t2(String product) {
		
		page1.entertext(product);
		String ss = amazon2page.validatepagetitle();
		Assert.assertEquals("Amazon.in : samsung",ss);
	
}
	//@Test
	public void t3() {
		page1.entertext("samsung");
		//String qwe = page2.m1();
		//Assert.assertEquals("Samsung Galaxy M51 - Meet the Meanest Monster Ever",qwe);
		Assert.assertTrue(page2.m1().contains("Samsung Galaxy M51 - Meet the Meanest Monster Ever"));
		System.out.println("oo");
	}
	//@Test
	public void t4() {
		page1.entertext("iphone");
		String ss1 = amazon2page.validatepagetitle();
		Assert.assertEquals("Amazon.in : iphone",ss1);
		System.out.println("ok");
	}
	
	//@Test
	public void t5() {
		page1.entertext("samsung");
		WebElement a = driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/span[2]"));
	    String p = a.getText();
	    System.out.println(p);
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}