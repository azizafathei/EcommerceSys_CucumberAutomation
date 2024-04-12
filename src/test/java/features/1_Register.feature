

Feature: User Registration

  Scenario Outline:  user Register with valid credentials
    Given I am on the registration page
    When I register with firstname "<firstname>" and lastname "<lastname>" and email "<email>" and password "<password>"
    Then I should see a successful registration message

    Examples:
      | firstname  | lastname | email                   | password |

      | aza        | salim    | azasalim_004@gmail.com  | aza123  |

      | lamia        | ali    | lamiaali_005@gmail.com  | lamia123  |


