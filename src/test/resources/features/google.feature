
Feature: Google home page functionality

  Scenario: Search something on google
    Given user on the google page
    When user sends some keys to the input box and press enter
    Then user sees the search results on the page


  Scenario: Go to the images and search an image
    Given user on the google page
    When user clicks images link
    When user searches an image and presses enter
    Then user sees the page on the screen
