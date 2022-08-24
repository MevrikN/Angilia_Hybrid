@registration @smoke
Feature: registration

  Background:User should be on Registration details Page
    Given user is on Homepage
    And user click on SignIn tab
    And user should be on Registration page
    And user enter email id as "abcdky005@gmail.com".
    And Click on Continue Button

  @Smoke @Regression @registration
  Scenario Outline: I can verify that form only accept valid data and with invalid data gives error message
    When I enter invalid first name "<first_name>"
    And I enter invalid last name "<last_name>"
    And I enter password "<password>"
    And I can verify last name error
    Then I can verify first name error
     Examples:
      | first_name | last_name | password   |
      | ram1       | kumar11   | asd1234    |
      | 123        | 1234      | 1234567890 |

    @registration
    Scenario Outline: I can verify that with valid data , user can register successfully
      When I enter valid first name "<first_name>"
      And I enter valid last name "<last_name>"
      And I enter valid password "<password>"
      And I enter address "<address>"
      And I enter city name "<city_name>"
      And I select state from dropdown "<state>"
      And I enter zipcode in numbers only as "<zipcode>"
      And I select country at index position one
      And I enter valid numeric mobile number as "<mobile_number>"
      And Press Create account button
      Then I should be navigate to Account dashboard
      Examples:
        | first_name | last_name | password    | address         | city_name | state   | zipcode | mobile_number |
        | Nik        | Paul      | abcdefg@123 | Mandeville road | London    | Arizona | 01234   | 0123456789    |