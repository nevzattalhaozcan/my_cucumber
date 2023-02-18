@AddProduct
Feature: Adding products to cart functionality

  @Standard
  Scenario: Login as standard user
    Given user is on the login page
    When user enters standard user username
    And user enters password
    And user clicks login button
    Then user sees the home page

  @AddAllProducts
  Scenario: Add all products to cart
    Given user is on the login page
    When user enters standard user username
    And user enters password
    And user clicks login button
    When user clicks ADD TO CART buttons one by one
    And user clicks cart button
    Then user sees all products in the cart