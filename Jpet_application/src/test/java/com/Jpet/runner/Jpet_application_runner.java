package com.Jpet.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Jpet_feature/Jpet_Application.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC01_SignIn_and_CompareName,@TC02_PrintBill_and_MyOrdersTable,@TC03_Addproducts_and_RemoveFromCart"},
		glue = {"com.Jpet.steps"},
		monochrome = true	
		)
public class Jpet_application_runner {

}
