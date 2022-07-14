package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginParameter {
	WebDriver driver;
	@Given("^user is on login page of website$")
	public void user_is_on_login_page_of_website() throws Throwable {
		 WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user giving valid credentials\"([^\"]*)\"and \"([^\"]*)\"$")
	public void user_giving_valid_credentials_and(String username, String password)  {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		 driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@And("^user click login button$")
	public void user_click_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^user will see the home page$")
	public void user_will_see_the_home_page() throws Throwable {
		 boolean stats = driver.findElement(By.id("MP_link")).isDisplayed();
		  Assert.assertTrue(stats);
	}
}
