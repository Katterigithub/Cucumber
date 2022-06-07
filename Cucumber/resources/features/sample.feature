#Comment
Feature: Login to Salesforce application

  Scenario: Login with valid username and valid password
    Given User launch the application
    When User enter username
    And User enters password
    Then Click on login button
    Then verify user successfully logged in
    
    
  Scenario: Login with invalid username and invalid password
    Given User launch the application
    When User enter invalid username
    And User enters invalid password
    Then Click on login button
    Then verify user successfully logged in
