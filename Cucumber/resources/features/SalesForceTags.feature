#Testing tags

Feature: Login to Salesforce application

	@Regression
  Scenario: Login with valid username and valid password
    Given User launch the application
    When User enter username
    And User enters password
    Then Click on login button
    Then verify user successfully logged in
    
    @Smoke
  Scenario: Login with valid username and valid password
    Given User launch the application
    When User enter username
    And User enters password
    Then Click on login button
    Then verify user successfully logged in
