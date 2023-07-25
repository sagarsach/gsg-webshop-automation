package pageObjects;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LandingPage {
    public WebDriver driver;

    public LandingPage(WebDriver driver)
    {
        this.driver = driver;
    }
    By loginButton = By.xpath("//*[text()='Sign in']");
    By email = By.xpath("//input[contains(@id,'email')]");
    By password = By.xpath("//input[@type='password']");
    By signInSubmitBtn = By.xpath("//button[@type='submit']");
    By logoutButton = By.xpath("//span[@class='logout']");
    By signUpLink = By.xpath("//*[text()='Sign Up']");

    public void loginToWebApp(String username, String pass) throws InterruptedException {
        driver.findElement(loginButton).click();
        Thread.sleep(1500);
        driver.findElement(email).sendKeys(username);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(signInSubmitBtn).click();
        Thread.sleep(1000);
    }

    public boolean verifyHomePageIsPopulated() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(logoutButton).isDisplayed();
        return true;
    }

    public void clickSignUpLink() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(signUpLink).click();
        Thread.sleep(2000);
    }

    public void clickSignInLink() {
        driver.findElement(loginButton).click();
    }
}
