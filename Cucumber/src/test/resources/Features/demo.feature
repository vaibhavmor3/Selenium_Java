@Smoke
Feature: To test login fynctionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters uername and password
    And click on login button
    Then user is navigated to home page
#@Test
  #Scenario Outline: Check login is successful with valid credentials
    #Given user is on login page
    #When user enters <uername> and <password>
    #And click on login button
    #Then user is navigated to home page
#
    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |
