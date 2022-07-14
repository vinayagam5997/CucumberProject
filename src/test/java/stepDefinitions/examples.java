package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class examples {

	WebDriver driver;
	@Given("^login page of website$")
	public void login_page_of_website() throws Throwable {
		WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^credentials validating \"([^\"]*)\" and \"([^\"]*)\"$")
	public void credentials_validating_and(String username, String password) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		 driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^login button click$")
	public void login_button_click() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}
}
