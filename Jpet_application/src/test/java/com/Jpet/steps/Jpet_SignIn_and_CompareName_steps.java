package com.Jpet.steps;

import java.io.IOException;

import com.Jpet.pages.Jpet_SignIn_and_CompareName_page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jpet_SignIn_and_CompareName_steps {
	Jpet_SignIn_and_CompareName_page signin = new Jpet_SignIn_and_CompareName_page();
@Given("^launch application homepage$")
public void launchapplication() {
	signin.launchapplication("chrome","https://petstore.octoperf.com/actions/Catalog.action");
}
	@When("^click on signin button$")
	public void click_on_signIn()
	{
		signin.clicksignin();
	}
	@Then("^to check for signin$")
	public void LaunchBrowser() throws IOException, InterruptedException {
		
		signin.signin();
	}
	@Then("^proceed to signin$")
	public void click_signIn() {
		signin.clickonsignIn();
	}
	@Then("^to check for compare name$")
	public void comparename() throws InterruptedException {
		
		signin.compare_name();
	}
	@And("^close browser$")
	public void close() {
		signin.quit();
	}
}