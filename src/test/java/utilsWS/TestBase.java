package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
    public static WebDriver driver;

    public WebDriver WebDriverManager()
    {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/sagarsachdev/IdeaProjects/gsg-webshop-automation/src/test/resources/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://webshop-qa.godspeedgames.com/");
        }
        return driver;
    }
}
