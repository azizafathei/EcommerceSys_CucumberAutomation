
Feature: Add Product to Cart
  As a user
  I want to be able to add a product to my shopping cart
  So that I can purchase it later

  Scenario: User adds a product to the shopping cart
    Given I am on the product details page to add prod to cart
    When I click on the add to cart button
    Then the product should be added to the shopping cart