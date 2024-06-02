
Feature: Login Functionality
  

  
   Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters valid username and password
    And User clicks on login button
    Then User is navigated to the dashboard page
    

  
  