package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPage landingPage;
	public HomePage homePage;
	public SignUpPage signUpPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LandingPage getLandingPage()
	{
	 landingPage= new LandingPage(driver);
	 return landingPage;
	}

	public HomePage getHomePage()
	{
		homePage= new HomePage(driver);
		return homePage;
	}

	public SignUpPage getSignUpPage()
	{
		signUpPage= new SignUpPage(driver);
		return signUpPage;
	}
}
