package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    By logoutDropdown = By.xpath("//span[@class='logout']");
    By logoutButton = By.xpath("//*[text()='Logout']");

    public void logoutFromWebApp() {
        driver.findElement(logoutDropdown).click();
        driver.findElement(logoutButton).click();
    }
}
