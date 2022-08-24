@Regression @addtocart
Feature: Add to cart
  Background: User logged in and on Account Dashboard page
    Given click on "<category>" on top header
    And click on "<sub_category_name>"
      | Women | T-Shirt      |
      | Women | Summer Dress |
      | Dress | Evening Dress |

    Scenario: User should able to add product into cart without going into product details page
      When user hover over product
      Then user should be able to see Add to cart button
      And user should be able to click on Add to cart button
      Then user should see conformation window on same screen

      Scenario:  User should be able to add product from product details page
        When user click on product name
        Then it should be navigate to relevant product details page
        And user can able to click on Add to cart button
        And should see conformation window

        Scenario: User should be able to add multiple products into cart
          When user hover over product
          Then user should be able to see Add to cart button
          And user should be able to click on Add to cart button
          Then user should see conformation window on same screen
          And user click on close button
          And user click on another products Add to cart button
          Then user should see conformation message

