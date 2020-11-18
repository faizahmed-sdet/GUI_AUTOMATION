package StepDefinitions;


//import cucumber.api.java.en.*;
import io.cucumber.java.en.*;

public class LoginSteps 
{
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Assalamualaikum");
	}

	@When("^user provides username and password$")
	public void user_provides_username_and_password()  throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Assalamualaikum");
	    
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Assalamualaikum");
	    
	    
	}

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Assalamualaikum");
	    
	}	
	
}
