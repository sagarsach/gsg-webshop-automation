package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.SignUpPage;
import utilsWS.TestContextSetup;

import java.io.IOException;

public class SignUpPageStepDefinition {

    TestContextSetup testContextSetup = new TestContextSetup();
    SignUpPage signUpPage = testContextSetup.pageObjectManager.getSignUpPage();

    public SignUpPageStepDefinition() throws IOException {
    }

    @Then("Sign up page is populated")
    public void signUpPageIsPopulated() throws InterruptedException {
        Assert.assertTrue(signUpPage.verifySignUpPageIsPopulated());
    }

    @And("I enter username {} and password {} on sign up page")
    public void iEnterUsernameAndPasswordOnSignUpPage(String username, String pass) {
        signUpPage.enterUsernameAndPassOnSignUpPage(username, pass);
    }

    @And("I click on next button")
    public void iClickOnNextButton() {
        signUpPage.clickOnNextBtn();
    }

    @Then("OTP page is populated")
    public void otpPageIsPopulated() {
        Assert.assertTrue(signUpPage.verifyOTPPageIsPopulated());
    }
}
