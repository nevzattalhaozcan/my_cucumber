@Regression
Feature: Sauce Demo login function

  @Standard
  Scenario: Login as standard user
    Given user is on the login page
    When user enters standard user username
    And user enters password
    And user clicks login button
    Then user sees the home page

  @LockedOut
  Scenario: Login as locked-out user
    Given user is on the login page
    When user enters locked-out user username
    And user enters password
    And user clicks login button
    Then user sees the home page

  @Problem
  Scenario: Login as problem user
    Given user is on the login page
    When user enters problem user username
    And user enters password
    And user clicks login button
    Then user sees the home page

  @PerformanceGlitch
  Scenario: Login as performance glitch user
    Given user is on the login page
    When user enters performance glitch user username
    And user enters password
    And user clicks login button
    Then user sees the home page

