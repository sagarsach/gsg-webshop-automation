package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.LandingPage;
import utilsWS.TestContextSetup;

import java.io.IOException;

public class HomePageStepDefinition {

    TestContextSetup testContextSetup = new TestContextSetup();
    HomePage homePage = testContextSetup.pageObjectManager.getHomePage();

    public HomePageStepDefinition() throws IOException {
    }

    @And("I sign out of the application")
    public void iSignOutOfTheApplication() {
        homePage.logoutFromWebApp();
    }
}
