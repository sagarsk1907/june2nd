package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Baseclass.BaseClass;

public class googlesearchpage extends BaseClass{
	
	
	@FindBy(name="q")
	WebElement textbox;
	
	public googlesearchpage() {
	PageFactory.initElements(driver, this);
	}
	public void entertext(String a) {
		textbox.sendKeys(a);
		textbox.submit();
	}
	
	public static String validatepagetitle() {
		return driver.getTitle();
	}
	

}
