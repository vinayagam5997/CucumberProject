package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class opengoogleDefinitions {

	WebDriver driver;
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.navigate().to("https://www.google.co.in/");
	    
	}

	@When("^user give some text in search box \"([^\"]*)\"$")
	public void user_give_some_text_in_search_box(String searchbox) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.name("q")).sendKeys("yamaha");
	}

	@When("^user press enter key$")
	public void user_press_enter_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^user should see the search results$")
	public void user_should_see_the_search_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	     boolean displayed = driver.findElement(By.partialLinkText("bikes")).isDisplayed();
	     Assert.assertEquals("bikes", "bikes");
	}
}
