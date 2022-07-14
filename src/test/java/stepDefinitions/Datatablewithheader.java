package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Datatablewithheader {

	WebDriver driver;
	@Given("^on login page of Orangehrm$")
	public void on_login_page_of_Orangehrm() throws Throwable {
		 WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^entering the credentials$")
	public void entering_the_credentials(DataTable data) throws Throwable {
	 List<Map<String, String>> inputs = data.asMaps(String.class, String.class);
	 String username = inputs.get(0).get("username");
	 String password = inputs.get(0).get("password");
	 driver.findElement(By.id("txtUsername")).sendKeys(username);
	 driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		 driver.findElement(By.id("btnLogin")).click();
	   	}

}
