Feature : Search Products

  Scenario Outline : Registered User should be able to search products by color and category name
    Given user is already logged in
    And user is on Account Dashboard
    When user type product name as “<search items>”
    And Click on Search Button
    Then user should be able to see relevant products available in blue colour
    Examples:
      | search items         |
      | Summer Dress Blue    |
      | blue summer dress    |
      | summer dress in blue |

    Scenario: Non Registered user should be able to search products by color and category name
      Given user is on Homepage
      When user type product name as "summer dress blue"
      And click on search button
      Then user should be able to see relevant products available in blue colour


