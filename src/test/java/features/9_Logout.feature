

Feature: Logout Feature

  Scenario: User logs out from the application
    Given User is logged in
    When User clicks on the logout button
    Then User is logged out successfully