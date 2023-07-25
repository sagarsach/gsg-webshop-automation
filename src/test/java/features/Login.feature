Feature: Webshop Login

  Scenario Outline: Home page default login
    Given User is on landing page
    When User login in to application with username <Username> and password <password>
    Then Home page is populated
    And I sign out of the application

    Examples:
      | Username                        | password  |
      | sagar.floydee@godspeedgames.com | sagar@001 |