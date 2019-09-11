package com.test.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	@Given("^I run the test$")
	public void i_run_the_test() {
		System.out.println("Test Initiated");
	}
	
	@When("I click the run")
	public void i_click_the_run() {
	    System.out.println("I clicked the run button");
	}

	@Then("it prints on console")
	public void it_prints_on_console() {
	    System.out.println("Hello World");
	}

}
