Feature: To test login fynctionality
@BP
  Scenario Outline: Check login is successful with valid credentials
    Given user is on BP travel login page
    When user enters valid <username> and <password>
    And click on login button of BP travel page
    Then user is able to login in BP

    Examples: 
      | username | password |
      | ABP      | ABP      |
      | BP       | BP       |
      | CBP      | CBP      |