package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Orangelogin {
WebDriver driver;
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user giving valid credentials$")
	public void user_giving_valid_credentials() throws Throwable {
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@And("^user clicking on login button$")
	public void user_clicking_on_login_button() throws Throwable {
	 driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^user navigates to home page$")
	public void user_navigates_to_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  boolean stats = driver.findElement(By.id("MP_link")).isDisplayed();
	  Assert.assertTrue(stats);
	}

}
