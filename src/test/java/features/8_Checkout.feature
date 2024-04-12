

Feature: Checkout Product
  As a user
  I want to be able to checkout a product from my shopping cart
  So that I can complete the purchase

  Scenario Outline: User checks out a product from the shopping cart with different payment data
    Given I am on the shopping cart page
    When I proceed to checkout with  "<city>" and "<address>" and "<code>" and "<holder>" and "<phone>" and "<creditnumber>" and "<cardcode>"
    Then   success message after checkout action

    Examples:
      |  city | address       | code | holder   | phone       | creditnumber     | cardcode |
      | cairo |cairo madenty | 741 |  abeer | 01287545474 |  4000000000001000 | 938       |
