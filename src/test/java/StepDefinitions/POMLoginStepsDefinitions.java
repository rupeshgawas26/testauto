package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class POMLoginStepsDefinitions {
	WebDriver driver;
	LoginPage login;
	
	@Given("User is on login Page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.saucedemo.com/v1/");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) throws InterruptedException {
		login=new LoginPage(driver);
		login.enterUserName(username);
		login.enterPassword(password);
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		login.clicklogin();
	}

	@Then("User should be navigated to Home Page")
	public void user_should_be_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		login.isLogoDisplayed();
	}

	@And("Close the Browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
}
