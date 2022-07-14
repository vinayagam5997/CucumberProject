package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Datatablewithoutheader {

	WebDriver driver;
	@Given("^on login page of website$")
	public void on_login_page_of_website() throws Throwable {
		 WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^entering the  valid credentials$")
	public void entering_the_valid_credentials(DataTable data) throws Throwable {
	   List<String> credentials = data.asList(String.class); 
	   String username = credentials.get(0);
	   String password = credentials.get(1);
	   driver.findElement(By.id("txtUsername")).sendKeys(username);
		 driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^clicking login button$")
	public void clicking_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^moving to the home page$")
	public void moving_to_the_home_page() throws Throwable {
		 boolean stats = driver.findElement(By.id("MP_link")).isDisplayed();
		  Assert.assertTrue(stats);
	}
}
