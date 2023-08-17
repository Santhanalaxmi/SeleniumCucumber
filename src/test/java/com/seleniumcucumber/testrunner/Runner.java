package com.seleniumcucumber.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features ="D:\\UDEMY_SELENIUMJAVA\\SeleniumCucumber\\src\\test\\java\\com\\seleniumcucumber\\features\\Amazon.feature"
,glue = "com.seleniumcucumber.stepdefinition",
dryRun = false, 
strict = true,
format = {"pretty", "html:test-output"},
monochrome = true)



public class Runner {

}
