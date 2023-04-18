package com.straive.stepdefinition;

import com.straive.pageexecution.PageExecution;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends PageExecution {
	
	@Given("Launch chrome browser")
	public void launch_chrome_browser() {
		launchChrome();
	  }

	@When("Navigate to Facebook URL")
	public void navigate_to_facebook_url() {
		launchFacebook();		
	   
	}

	@Then("Verify the login page")
	public void verify_the_login_page() {
		verifyLoginPage();
	   
	}

	@Given("Enter username and password")
	public void enter_username_and_password() {
		enterUsername();
		enterPassword();
	  }

	@When("Click Login button")
	public void click_login_button() {
		clickLoginButton();
	   }

	@Then("Verify the HomePage")
	public void verify_the_home_page() {
		verifyHomePage();
		
	   	}


}
