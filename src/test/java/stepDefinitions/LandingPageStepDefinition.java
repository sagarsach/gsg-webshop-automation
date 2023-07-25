package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LandingPage;
import utilsWS.TestContextSetup;

import java.io.IOException;

public class LandingPageStepDefinition {

    TestContextSetup testContextSetup = new TestContextSetup();
    LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();

    public LandingPageStepDefinition() throws IOException {
    }

    @Given("User is on landing page")
    public void user_is_on_landing_page() {
    }

    @When("User login in to application with username {} and password {}")
    public void userLoginInToApplicationWithUsernameAndPassword(String username, String password) throws InterruptedException {
        landingPage.loginToWebApp(username,password);
    }

    @Then("Home page is populated")
    public void homePageIsPopulated() throws InterruptedException {
        Assert.assertTrue(landingPage.verifyHomePageIsPopulated());
    }
}
