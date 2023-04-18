package com.straive.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\Peter Praveen\\eclipse-workspace\\FB\\src\\test\\resources\\Features" },
				glue = {"com.straive.stepdefinition"},
				dryRun = false, 
				plugin = { "html:Reports/HtmlReports.html",	"json:Reports/JsonReports.json"}, 
				monochrome = true, 
				publish = true)

public class Runner {

}
