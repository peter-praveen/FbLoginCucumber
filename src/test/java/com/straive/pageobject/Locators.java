package com.straive.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.straive.baseclass.Base;

public class Locators extends Base{
	
	public static WebElement getUsername() {
		WebElement username = driver.findElement(By.id("email"));
		return username;
	}
	public static WebElement getPassword() {
		WebElement password = driver.findElement(By.id("pass"));
		return password;
	}
	
	public static WebElement getLoginBtn() {
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		return loginBtn;
	}
	
	public static WebElement getFbTitle() {
		WebElement fbTitle = driver.findElement(By.xpath("//img[@alt=\"Facebook\"]"));
		return fbTitle;
	}
	public static WebElement getHomePageLogo() {
		WebElement homeLogo = driver.findElement(By.xpath("//a[@aria-label='Facebook']"));
		return homeLogo;
	}
	
	
}
