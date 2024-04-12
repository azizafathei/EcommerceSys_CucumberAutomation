

Feature: Add Product Review
  As a user
  I want to be able to add a review for a product
  So that other users can see my opinion

  Scenario Outline: User adds a review for a product
    Given I am on the product details page and click review link
    When I submit a review with the following details review_title "<review_title>" and review_text "<review_text>"
    Then the review should be successfully added

    Examples:
      | review_title | review_text                |
      | perfect      | product is reallu perfect  |
