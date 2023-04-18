package com.straive.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	
	public static void launchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	
	public static void launchURL(String url) {
		driver.get(url);
	}

	public static String readProp(String key) throws IOException {
				File fl=new File("C:\\Users\\Peter Praveen\\eclipse-workspace\\FB\\src\\test\\resources\\Credentials.properties");
	
			FileInputStream fis=new FileInputStream(fl);
			Properties po=new Properties();
			po.load(fis);
			String value = po.getProperty(key);
			return value;
	}
	public static void closeBrowser() {
		driver.quit();
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static boolean isElementDisplayed(WebElement elem) {
		return elem.isDisplayed();
	}
	
	public static void click(WebElement elem) {
		elem.click();
	}
	
	public static void sendKeys(WebElement elem, String keys) {
		elem.sendKeys(keys);
	}
	
	
	public static void jsClick(WebElement elem) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elem);
	}
	
	public static void jsScrollforElement(WebElement elem) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollByView(true)", elem);
	}
	
	public static void jsSendKeys(WebElement elem, String keys) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+keys+"')", elem);
	}
	
	
	
	}
