package StepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.democorp.myapp.Pages.LoginPage;
import com.democorp.myapp.utils.ReadConfig;
import com.democorp.myapp.utils.XLUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefinitions extends BaseClass {
	WebDriver driver=CommonStepDefinitions.getDriver();

	ReadConfig readConfig=new ReadConfig();
	LoginPage login;
	
	@Given("User is on login Page")
	public void user_is_on_login_page() {
	    driver.get(readConfig.getApplicationURL());
	    login=new LoginPage(driver);
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) throws InterruptedException, IOException {
		
		login.enterUserName(username);
		login.enterPassword(password);	
	}
	@When("Enter username and password from excel")
	public void enter_excel() throws InterruptedException, IOException {
		XLUtils xlutils =new XLUtils();
		String path=System.getProperty("user.dir")+"/src/test/resources/data/userdata.xlsx";
		String username=XLUtils.getCellData(path, "Sheet1", 1, 0);
		String password=XLUtils.getCellData(path, "Sheet1", 1, 1);
		login.enterUserName(username);
		login.enterPassword(password);
//		String path=System.getProperty("user.dir")+"/src/test/resources/data/userdata.xlsx";
//		XLUtils.setCellData(path,"Sheet1",2,0,readConfig.getApplicationURL());
//		XLUtils.setCellData(path,"Sheet1",2,1,readConfig.getBrowser());	
	}
	

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {
		login.clicklogin();
	}

	@Then("User should be navigated to Home Page")
	public void user_should_be_navigated_to_home_page() {
		Assert.assertTrue(login.isLogoDisplayed());
	}

	@And("Close the Browser")
	public void close_the_browser() {
	    driver.quit();
	}
}
