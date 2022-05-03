package org.stepdefinition;

import org.pojo.AgodaHomePage;

import io.cucumber.java.en.*;

public class LoginStepDefinition extends AgodaHomePage {


	@Given("^User launches the browser$")
	public void user_launches_the_browser() throws Throwable {
		browserLaunch();
		url("https://www.agoda.com/");	   
	}

	@Then("^User should navigate to the home page and close the browser$")
	public void user_should_navigate_to_the_home_page_and_close_the_browser() throws Throwable {
		String homeUrl = driver.getCurrentUrl();

		if (homeUrl.contains("https://www.agoda.com/")) {

			System.out.println("User in the home Page" + homeUrl);

		}
		driver.close();
	}
	
	
	
	
}
