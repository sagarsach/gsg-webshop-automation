package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    public WebDriver driver;

    public SignUpPage(WebDriver driver)
    {
        this.driver = driver;
    }
    By signUpHeading = By.xpath("//*[text()='Create your Godspeed account']");
    By email = By.xpath("//input[contains(@id,'email')]");
    By password = By.xpath("//input[@type='password']");
    By nextButton = By.xpath("//button[@type='submit']");
    By otpHeading = By.xpath("//*[text()='Provide the 4 digit pin sent to your inbox']");

    public boolean verifySignUpPageIsPopulated() {
        driver.findElement(signUpHeading).isDisplayed();
        return true;
    }

    public void enterUsernameAndPassOnSignUpPage(String username, String pass) {
        driver.findElement(email).sendKeys(username);
        driver.findElement(password).sendKeys(pass);
    }

    public void clickOnNextBtn() {
        driver.findElement(nextButton).click();
    }

    public boolean verifyOTPPageIsPopulated() {
        driver.findElement(otpHeading).isDisplayed();
        return true;
    }
}
