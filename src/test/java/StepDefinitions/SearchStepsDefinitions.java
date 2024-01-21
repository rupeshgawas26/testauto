package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.democorp.myapp.Pages.BingHomePage;
import com.democorp.myapp.Pages.BingSearchPage;
import com.democorp.myapp.Pages.GoogleHomePage;
import com.democorp.myapp.Pages.GoogleSearchPage;
import com.democorp.myapp.Pages.LoginPage;
import com.democorp.myapp.Pages.YahooHomePage;
import com.democorp.myapp.Pages.YahooSearchPage;
import com.democorp.myapp.utils.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepsDefinitions extends BaseClass {

	WebDriver driver=CommonStepDefinitions.getDriver();
	ReadConfig readConfig=new ReadConfig();
	LoginPage login;
	GoogleHomePage googleHome=new GoogleHomePage(driver);
	GoogleSearchPage googleSearch=new GoogleSearchPage(driver);
	BingHomePage bingHome=new BingHomePage(driver);
	BingSearchPage bingSearch=new BingSearchPage(driver);
	YahooHomePage yahooHome= new YahooHomePage(driver);
	YahooSearchPage yahooSearch=new YahooSearchPage(driver);
	
	@Given("User is navigated to Google page")
	public void user_is_navigated_to_google_page() {
	    driver.get("https://www.google.com/");
	}

	@When("User searches {string} in search text box of Google")
	public void user_enters_text_in_google(String text) throws InterruptedException {
		googleHome.enterSearchCriteria(text);
	}
	@Then("First Link in Google Search results contains {string}")
	public void google_verify_link(String text) {
		Assert.assertTrue(googleSearch.verifyFirstLink(text));
	}
	
	@Given("User is navigated to Bing page")
	public void user_is_navigated_to_bing_page() {
	    driver.get("https://www.bing.com/");
	}

	@When("User searches {string} in search text box of Bing")
	public void user_enters_text_in_bing(String text) throws InterruptedException {
		bingHome.enterSearchCriteria(text);
	}
	@Then("First Link in Bing Search results contains {string}")
	public void bing_verify_link(String text) {
		Assert.assertTrue(bingSearch.verifyFirstLink(text));
	}
	
	@Given("User is navigated to Yahoo page")
	public void user_is_navigated_to_yahoo_page() {
	    driver.get("https://search.yahoo.com/");
	}

	@When("User searches {string} in search text box of Yahoo")
	public void user_enters_text_in_yahoo(String text) throws InterruptedException {
		yahooHome.enterSearchCriteria(text);
	}
	@Then("First Link in Yahoo Search results contains {string}")
	public void yahoo_verify_link(String text) {
		Assert.assertTrue(yahooSearch.verifyFirstLink(text));
	}


}
