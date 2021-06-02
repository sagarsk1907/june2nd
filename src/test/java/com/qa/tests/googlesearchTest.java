package com.qa.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;

import com.qa.Baseclass.BaseClass;
import com.qa.pages.googlesearchpage;


@Listeners(value=HTMLReporter.class)
public class googlesearchTest extends BaseClass{

	googlesearchpage search;
	public googlesearchTest() {
		super();
	}
	
	@BeforeMethod
	public void setuo() {
		init();
		
		 search = new googlesearchpage();
		 driver.get(prop.getProperty("url"));
		
	}
	int i = 6;
	@Test
	public void t1() {
		if( i ==6) {
		throw new SkipException("skipping test case");
		}
		//search.entertext("sagar");
		String s = googlesearchpage.validatepagetitle();
		Assert.assertEquals(s, "Google");
	}
	
	@Test(invocationCount=2)
	public void t2() {
		search.entertext("sagar");
		String s1 = googlesearchpage.validatepagetitle();
		Assert.assertEquals(s1, "sagar - Google Search");
		System.out.println(s1);
	}

	@AfterMethod
	public void end() {
		driver.quit();
	}
	
}


