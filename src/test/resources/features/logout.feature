@SYMU-1692
Feature: Logout functionality

  @SYMU-1690
  Scenario: User can log out and ends up in login page
    Given user is on the dashboard
    When user click at the profile in the top right corner
    And user clicks [Log out] button
    Then user should ends up in login page

    @SYMU-1691
    Scenario: User cannot go to home page again by clicking step back button after successfully logged out.
      When user logged out
      And user click step back button
      Then user should not be directed to the home page again



