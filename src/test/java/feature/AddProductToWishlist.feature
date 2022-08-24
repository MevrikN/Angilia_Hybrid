Feature: Add product to Wishlist


  Scenario: User should able to add product to wishlist by clicking Quick view
    Given user is on Homepage
    When user hover-over on product
    And user click on Quick view
    Then user should be able to see Add to Wishlist Button
    And user click on Add to Wishlist button
    Then success message should be display

  Scenario: User should able to add product to wishlist by clicking on Item details page
    Given user is on Homepage
    When user click on product name
    Then user should able to navigate to product details page
    And user click on Add to Wishlist button
    Then success message should be display

