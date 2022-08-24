@login @Regression @smoke
Feature: Login
  Background: Registered user can login successfully with valid credential
    Given user is on Homepage
    And user click on SignIn tab
    Then user should be on login page

    @positive
    Scenario Outline: User can login with valid credential
      Given user must be registered
      And user enter email id "<email>".
      And user enter valid password "<password>"
      And click on log in button
      Then user should be logged in successfully
      Examples:
        | email               | password    |
        | abcdky005@gmail.com | abcdefg@123 |
@negative
  Scenario Outline: User should not login with in-valid credential
    When user enter invalid email id "<email>".
    And user enter invalid valid password "<password>"
    And click on log in button
    Then user should not be logged in and show error message
    Examples:
      | email                | password    |
      | abcdky0000@gmail.com | abcdefg@123 |