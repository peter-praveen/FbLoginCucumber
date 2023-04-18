package com.straive.pageexecution;

import java.io.IOException;

import org.junit.Assert;

import com.straive.baseclass.Base;
import com.straive.pageobject.Locators;

public class PageExecution extends Locators{
	
	public static void launchChrome() {
		Base.launchChromeBrowser();
	}
	
	public static void launchFacebook() {
		try {
			Base.launchURL(Base.readProp("Facebook"));
		} catch (IOException e) {
			System.out.println("The Exception is "+e);
		}
	}
public static void verifyLoginPage() {
	
	Assert.assertTrue(Base.isElementDisplayed(getFbTitle()));
	System.out.println("Login page is verified successfully");
}
	
public static void enterUsername() {
	try {
		Base.jsSendKeys(getUsername(), Base.readProp("Username"));
	} catch (IOException e) {
		System.out.println("The Exception of entering username "+e);
	}
}

public static void enterPassword() {
	try {
		Base.jsSendKeys(getPassword(), Base.readProp("Password"));
	} catch (IOException e) {
		System.out.println("The Exception of entering password "+e);
	}
}

public static void clickLoginButton() {
	Base.click(getLoginBtn());
}

public static void verifyHomePage() {	
	Assert.assertTrue(Base.isElementDisplayed(getHomePageLogo()));
	System.out.println("HomePage is Verified");
	try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Base.closeBrowser();
	
	
}


}
