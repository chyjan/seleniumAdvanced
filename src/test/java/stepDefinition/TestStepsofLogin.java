package stepDefinition;

import org.openqa.selenium.WebDriver;

import basePackage.BasePage;

import org.testng.Assert;
import factory.PageFactoryOfLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ScreenshotUtility;

public class TestStepsofLogin {
	public WebDriver driver;
	private PageFactoryOfLogin pageFactoryOfLogin;
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		driver = BasePage.getDriver("chrome");
		driver.get("https://practicetestautomation.com/practice-test-login/");
		pageFactoryOfLogin = new PageFactoryOfLogin(driver); 
		
		}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		pageFactoryOfLogin.enterPassword("Password123");
		pageFactoryOfLogin.enterUsername("student");
		
		
	    
	    
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		pageFactoryOfLogin.clickLoginButton();
	    
	    
	}

	@Then("User is navigated to the dashboard page")
	public void user_is_navigated_to_the_dashboard_page() {
	
		String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        String actualUrl = pageFactoryOfLogin.getCurrentUrl();
        try {
            Assert.assertEquals(actualUrl, expectedUrl, "User is not on the expected login page URL.");
        } catch (AssertionError e) {
            ScreenshotUtility.takeScreenshot(driver, "screenshots/failure-screenshot.png");
            throw e;  // Rethrow to allow Cucumber to handle the failure
        } finally {
            driver.quit();
        }
		
	    
	    
	}
}
