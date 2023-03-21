@all
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


  @UPGNX10-269
  Scenario: AC2- The user can not go to the home page again by clicking the step back button after successfully logged out.
    When User in on log in page
    Then User enters "salesmanager15@info.com" address
    And user enter "salesmanager"
    Then user clicks on the log in button
    And user should be on the homepage
    Then user click to his own username
    And  user click to Log Out button
    Then User in on log in page
    And User clicks the step backButton after successfully logged out.
    And user can not go to homepage again.

  @UPGNX10-273
  Scenario: AC3- The user must be logged out if the user closes the open tab (all tabs if there are multiple open tabs)
    When User in on log in page
    Then User enters "salesmanager15@info.com" address
    And user enter "salesmanager"
    Then user clicks on the log in button
    And user should be on the homepage
    Then user click to his own username
    And  user click to Log Out button
    Then User in on log in page

