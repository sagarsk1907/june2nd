package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Baseclass.BaseClass;

public class amazon1page extends BaseClass{
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchtext;		

	@FindBy(css=".nav-input[type='submit']")
	WebElement submit1;
	
	public amazon1page() {
	PageFactory.initElements(driver, this);
	}
	
	public void entertext(String xxx) {
		searchtext.sendKeys(xxx);
		searchtext.submit();
	}
	
	public static String validatepagetitle() {
		return driver.getTitle();
	}
}
