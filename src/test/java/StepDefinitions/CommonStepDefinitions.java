package StepDefinitions;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.democorp.myapp.utils.ReadConfig;
import com.democorp.myapp.utils.Reporting;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.*;


public class CommonStepDefinitions {
	static WebDriver driver;

	@Before
	public static void setup() throws IOException {
		ReadConfig readConfig=new ReadConfig();
//		if(readConfig.getBrowser().equalsIgnoreCase("chrome"))
//	    driver=new ChromeDriver();
//		else
		driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    Reporting report=new Reporting();
	}
	
	public static WebDriver getDriver() {
	    return driver;
	}

	@After
	public static void teardown() throws IOException {
	  driver.quit();
	}
	
	
}
