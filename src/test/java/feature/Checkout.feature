@Regression @smoke
Feature: Checkout
  Background : User should be able to checkout successfully
    Given user is on Homepage
    And user should be logged in successfully
    And user should be click on main website log
    And user should be navigate to homepage
    And user should be able to add products into cart


  Scenario:User should be able to checkout successfully
    Given user is on checkout page
    And user should be able to see summery of the cart
    And user should be able to increase quantity of product
    And user should be able to decrease quantity of product
    Then user should see the total price of the cart
    And user should be able to click on Processed to checkout
    Then user should be able to see Address
    And user should be able to add New Address
    And user should be able to update Billing Address
    And user should be able to update Shipping Address
    And user should be able to check Check-Box
    And user should be to click on Proceed to checkout button
    Then user should be able to Shipping options
    And user should be able to see shipping charge
    And user must checked Check-box
    And user click on Proceed to checkout button
    Then user should be navigated to Payment method page
    And user should see Total price
    And user should be able select Wire transfer
    And user should be able to click on I conform my order button
    Then user should be able to see details of account transfer
    And user should be able to Reference number
    Then Items should be removed from cart after successful checkout

