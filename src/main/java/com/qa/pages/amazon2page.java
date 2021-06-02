package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Baseclass.BaseClass;

public class amazon2page extends BaseClass{

	
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/span[2]")
	//static
	WebElement text;
	
	
	public amazon2page() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String m1() {
		 return text.getText();
	}
	public static String validatepagetitle() {
		return driver.getTitle();
	}
}
