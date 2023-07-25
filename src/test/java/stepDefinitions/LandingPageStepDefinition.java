package stepDefinitions;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.LandingPage;
import utils.TestContextSetup;

import java.io.IOException;

public class StepDefinition {

    TestContextSetup testContextSetup = new TestContextSetup();
    LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
    WebDriver driver;
    WebElement loginButton = driver.findElement(By.xpath("//*[text()='Sign in']"));

    public StepDefinition() throws IOException {
    }


    @Given("User is on landing page")
    public void user_is_on_landing_page()
    {
    }

    @When("User login in to application with username {} and password {}")
    public void userLoginInToApplicationWithUsernameAndPassword(String arg0, String arg1) {
    loginButton.click();
    }
}
