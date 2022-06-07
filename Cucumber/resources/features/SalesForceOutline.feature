#Testing Scenario Outline with example
Feature: Login to Salesforce application

Background: Run thes before every scenario
Given user print some name

  Scenario Outline: Login with valid username and valid password
    Given User launch the application
    When User enter username "<username>" 
    And User enters password "<password>" 
    Then Click on login button
    Then verify user successfully logged in
    
    Examples:
    |username|password|
    |jnanesh|Testing@123|
    |sushma|Training@123|

 