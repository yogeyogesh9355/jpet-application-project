package com.Jpet.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.cucumber.listener.Reporter;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Jpet_feature/Jpet_Application.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},		
		tags = {"@TC01_SignIn_and_CompareName,@TC02_PrintBill_and_MyOrdersTable,@TC03_Addproducts_and_RemoveFromCart"},
		glue = {"com.Jpet.steps"},
		monochrome = true	
		)
public class Jpet_application_runner {
	@AfterClass
	  public static void extendReport()
	{
		Reporter.loadXMLConfig("src\\test\\resources\\extent-config.xml");
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	      Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	      Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	      Reporter.setSystemInfo("Selenium", "3.141.59");
	      Reporter.setSystemInfo("Maven", "4.0.0");
	      Reporter.setSystemInfo("Java Version", "1.8.0_131");
	}
}