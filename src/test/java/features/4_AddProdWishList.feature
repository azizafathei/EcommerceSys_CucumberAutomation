

Feature: Add Product to Wishlist
  As a user
  I want to add a product to my wishlist
  So that I can save it for later

  Scenario: Add a product to wishlist
    Given I am on the product details page
    When I click on the Add to Wishlist button
    Then the product should be added to my wishlist