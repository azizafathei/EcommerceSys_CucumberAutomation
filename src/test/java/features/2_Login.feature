

Feature: Login Feature

Scenario Outline: Successful Login
Given I navigate to the login page
When I enter valid email "<email>"  and password "<password>"  click login button
Then I should be logged in successfully

Examples:
| email                      | password    |
| azasalim_004@gmail.com         | aza123      |