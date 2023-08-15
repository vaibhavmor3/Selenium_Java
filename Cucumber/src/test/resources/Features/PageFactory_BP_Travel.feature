Feature: PF test login fynctionality

  @PO
  Scenario Outline: PF Check login is successful with valid credentials
    Given PF user is on BP travel login page
    When PF user enters valid <username> and <password>
    And PF click on login button of BP travel page
    Then PF user is able to login in BP

    Examples: 
      | username | password |
      | ABP      | ABP      |
      | BP       | BP       |
      | CBP      | CBP      |
