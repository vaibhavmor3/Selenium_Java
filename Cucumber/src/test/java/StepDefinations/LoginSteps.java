package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("User is on login Page"); 
	}

	@When("user enters uername and password")
	public void user_enters_uername_and_password() {
		System.out.println("User enter username & password");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("User clicks on login button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("User redirectd to home page");
	}
}
