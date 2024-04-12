

Feature: Search Product
  As a user
  I want to search for products
  So that I can find the desired product easily

  Scenario: Search for a product
    Given I am on the home page
    When I search for "Apple MacBook Pro 13-inch"
    Then I should see search results for "Apple MacBook Pro 13-inch"