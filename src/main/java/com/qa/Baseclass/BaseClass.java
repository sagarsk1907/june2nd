package com.qa.Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.utils.Utilities;


public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public BaseClass() {
		
		//driver.get("https://www.google.com/");
		
			prop = new Properties();
			
			try {
				prop = new Properties();
				FileInputStream f = new FileInputStream("/Day5Seleniumpomdatadrivenframework/src/main/java/com/qa/constant/config.properties");
				try {
					prop.load(f);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				} 
				
				catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}	
public static void init() {
	String browserName = prop.getProperty("browser");
//	if(browserName.equals("chrome")) {
//		System.setProperty("webdriver.chrome.driver","C:/selenium-driver/chrome/chromedriver.exe");
//		driver = new ChromeDriver();
//	}
//	else if(browserName.equals("ff")) {
//		System.setProperty("webdriver.gecko.driver","C:/selenium-driver/geckodriver.exe");
//		driver = new FirefoxDriver();
//		
//}
	System.setProperty("webdriver.chrome.driver","C:/selenium-driver/chrome/chromedriver.exe");
	driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Utilities.page_load_timeout,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Utilities.implicit_time,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	//driver.get("https://www.google.com/");
	}
}