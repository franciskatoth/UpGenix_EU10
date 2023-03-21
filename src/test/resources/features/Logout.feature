Feature: As a user, I should be able to log out.


  @UPGNX10-268
  Scenario: AC1-User can log out and ends up in login page.
    When User in on log in page
    Then User enters "salesmanager15@info.com" address
    And user enter "salesmanager"
    Then user clicks on the log in button
    And user should be on the homepage
    Then user click to his own username
    And  user click to Log Out button
    Then User in on log in page