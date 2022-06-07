Feature: Login to Salesforce application

  Scenario: Login with valid username and valid password
    Given User on "LoginPage"
    When User enter value into textbox "username" "admin123@gmail.com"
    And User enter value into textbox "password" "admin123"
    Then click on "login" button
    Given User on "HomePage"
    When User enter value into textbox "name" "Sushma"
    When User enter value into textbox "fatherName" "Narayanagowda"
    When User click on RadioButton "female"
    When User validates the text "pageHeader" "Student Registration Form"
		