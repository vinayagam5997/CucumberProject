package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Taggedhooksstep {
	
	
	@Given("^first step$")
	public void first_step() throws Throwable {
	    //System.out.println("this is stepfirst");
	}

	@Given("^second step$")
	public void second_step() throws Throwable {
	   //System.out.println("this is stepSecond");
	}

	@Then("^third step$")
	public void third_step() throws Throwable {
	   // System.out.println("this is stepthird");
	}
}
