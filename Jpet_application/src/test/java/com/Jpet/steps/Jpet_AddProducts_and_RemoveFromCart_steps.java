package com.Jpet.steps;

import java.io.IOException;

import com.Jpet.pages.Jpet_AddProducts_and_RemoveFromCart_page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jpet_AddProducts_and_RemoveFromCart_steps {
	Jpet_AddProducts_and_RemoveFromCart_page cart = new Jpet_AddProducts_and_RemoveFromCart_page();
	@Given("^launch application homepage for cart$")
	public void launchapplication() {
		cart.launchapplication("chrome","https://petstore.octoperf.com/actions/Catalog.action");
	}
	
	@When("^select product category$")
	public void select_catogory() {
		cart.selectcategory();
	}
	@Then("^select product$")
	public void select_product() {
		cart.selectproduct();
	}
	@Then("^To check for add to cart$")
	public void addtocart() throws IOException, InterruptedException {
		 
		cart.addtocart();
	}
	@Then("^to check for remove from cart$")
	public void signin() throws IOException, InterruptedException {
		cart.removefromCart();
		cart.takescreenshot1("src/test/resources/screenshot/removefromcart.png");
	}
	@And("^close browser for remove from cart$")
	public void exit() {
		cart.quit();
	}
}
