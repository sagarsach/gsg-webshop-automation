Feature: Webshop SignUp

  Scenario Outline: Home page default login
    Given User is on landing page
    And I click on Sign in button
    When I click on Sign up link
    Then Sign up page is populated
    And I enter username <Username> and password <password> on sign up page
    And I click on next button
    Then OTP page is populated

    Examples:
      | Username                     | password |
      | sagar.floydee@testsignup.com | test@001 |