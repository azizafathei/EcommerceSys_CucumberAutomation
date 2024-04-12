


Feature: Email Product to Friend
  As a user
  I want to be able to email a product to a friend
  So that I can share product details with others

  Scenario Outline: User emails a product to a friend
    Given I am on the product details page to email friend
    When I enter friend's  email "<email>"  and  message "<message>"  click on the send button
    Then the email should be sent successfully

    Examples:
    |   email            |  message                                 |
    | ahmed@gmail.com    | hi ahmed i recommend this product for yo |