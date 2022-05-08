package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLogin {

	@Given("Using Amazon Url user have to open Amazon Login Page")
	public void using_Amazon_Url_user_have_to_open_Amazon_Login_Page() {
		System.out.println("Test Method 1");
	}

	@When("Using Valid Email Valid Password")
	public void using_Valid_Email_Valid_Password() {
		System.out.println("Test Method 2");
	}

	@When("Click ON Login button")
	public void click_ON_Login_button() {
		System.out.println("Test Method 3");
	}

	@Then("Homepage Should be Displayed")
	public void homepage_Should_be_Displayed() {
		System.out.println("Test Method 4");
	}


}
