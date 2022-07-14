package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepBackground {
	@Given("^student should pass in tenth$")
	public void student_should_pass_in_tenth() throws Throwable {
	   System.out.println("student should pass in tenth");
	}

	@Given("^student should pass in twelveth$")
	public void student_should_pass_in_twelveth() throws Throwable {
	    System.out.println("student should pass in twelveth");
	}


	
	@Given("^student passed with good cutoff$")
	public void student_passed_with_good_cutoff() throws Throwable {
	   System.out.println("student applied for medical");
	}

	@When("^student paased in entrance exam$")
	public void student_paased_in_entrance_exam() throws Throwable {
	    System.out.println("student get good cutoff marks");
	}

	@Then("^student is eligible to medical$")
	public void student_is_eligible_to_medical() throws Throwable {
	     System.out.println("student is eligible to medical");
	}

	@Given("^student applied for enginnering$")
	public void student_applied_for_enginnering() throws Throwable {
	    System.out.println("student applied for enginnering");
	}

	@When("^student get good marks in semester$")
	public void student_get_good_marks_in_semester() throws Throwable {
	    System.out.println("student get good marks in semester");
	}

	@Then("^student get the degree certificate$")
	public void student_get_the_degree_certificate() throws Throwable {
	  System.out.println("student get the degree certificate");
	}
}
