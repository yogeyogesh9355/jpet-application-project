package com.Jpet.steps;

import java.io.IOException;

import com.Jpet.pages.Jpet_PrintBill_and_MyOrdersTable_page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jpet_PrintBill_and_MyOrdersTable_steps {
	Jpet_PrintBill_and_MyOrdersTable_page table = new Jpet_PrintBill_and_MyOrdersTable_page();
	@Given("^launch application homepage for print table$")
	public void launchapplication() {
		table.launchapplication("chrome","https://petstore.octoperf.com/actions/Catalog.action");
	}
		@When("^click on signin button to print talbe$")
		public void click_on_signIn()
		{
			table.clicksignin();
		}
		@Then("^to check for signin to print table$")
		public void LaunchBrowser() throws IOException, InterruptedException {
			
			table.signin();
		}
		@Then("^proceed to signin for print table$")
		public void click_signIn() {
			table.clickonsignIn();
		}
		@Then("^select a product for bill$")
		public void selectproduct()
		{
	     table.selectaproduct();
		}
		@Then("^to check for printbill$")
		public void applicationhomepage() throws IOException, InterruptedException {
			
			 table.Printbill("src/test/resources/screenshot/bill.png");
		}
		@Then("^To print myorders table$")
		public void print_myorder_table () throws IOException, InterruptedException {
			
			table.print_Myordertable();
			table.takescreenshot1("src/test/resources/screenshot/myorder.png");
		}
		@And("^close browser for print table$")
		public void end() {
			table.quit();
		}
}
