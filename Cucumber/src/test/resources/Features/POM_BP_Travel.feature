Feature: POM test login fynctionality

  @PO
  Scenario Outline: POM Check login is successful with valid credentials
    Given POM user is on BP travel login page
    When POM user enters valid <username> and <password>
    And POM click on login button of BP travel page
    Then POM user is able to login in BP

    Examples: 
      | username | password |
      | ABP      | ABP      |
      | BP       | BP       |
      | CBP      | CBP      |
