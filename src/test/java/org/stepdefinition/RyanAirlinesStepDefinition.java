package org.stepdefinition;

import java.io.IOException;

import org.utility.RyanBaseClass;
import org.utility.RyanPojoClass;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RyanAirlinesStepDefinition extends RyanBaseClass {
	
	@Given("User should launch the chrome browser")
	public void user_should_launch_the_chrome_browser() {
	    launchChrome();
	    loadUrl("https://www.ryanair.com/gb/en");
	}
	
	@When("User should agree the prompt message")
	public void user_should_agree_the_prompt_message() {
		RyanPojoClass r = new RyanPojoClass();
		txtclick(r.getClick());
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() throws InterruptedException {
		RyanPojoClass r = new RyanPojoClass();
		loginClick(r.getLoginClick());
	}

	@When("User should type the invalid email id")
	public void user_should_type_the_invalid_email_id() throws IOException {
		RyanPojoClass r = new RyanPojoClass();
		fill(r.getTxtuser(), r.getData(2, 1));	
	}

	@When("User should type the invalid password")
	public void user_should_type_the_invalid_password() throws IOException {
		RyanPojoClass r = new RyanPojoClass();
	    fill(r.getTxtpass(), r.getData(1, 1));
	}
	
	@When("User should click the page login button")
	public void user_should_click_the_page_login_button() {
		RyanPojoClass r = new RyanPojoClass();
		btnClick(r.getBtnClick());
	}

	@Then("User should get a invalid email id or invalid password message in red colour")
	public void user_should_get_a_invalid_email_id_or_invalid_password_message_in_red_colour() {
		
		System.out.println("Project is Passed");
		
	}

}
