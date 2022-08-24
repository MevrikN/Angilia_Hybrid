package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    Homepage homepage = new Homepage();
    RegSignInPage regSignInPage = new RegSignInPage();
    RegistartionDetails registartionDetails = new RegistartionDetails();
    RegLoginSuccess regLoginSuccess = new RegLoginSuccess();


    @Given("user is on Homepage")
    public void user_is_on_homepage() {
    }

    @And("user click on SignIn tab")
    public void user_click_on_sign_in_tab() {
        homepage.click_on_Sign_in_btn();
    }

    @And("user should be on Registration page")
    public void user_should_be_on_registration_page() {
        regSignInPage.verify_Registration_Pg_Url();
    }

    @And("user enter email id as {string}.")
    public void userEnterEmailIdAs(String arg0) {
        regSignInPage.enter_Email_Address(arg0);
    }

    @And("Click on Continue Button")
    public void click_on_continue_button() {
        regSignInPage.click_Create_Account_Btn();
    }

    //@@@@@@@@@@@@@@@@@@@

    @When("I enter invalid first name {string}")
    public void i_enter_invalid_first_name(String first_name) {
        registartionDetails.fName(first_name);
    }

    @When("I enter invalid last name {string}")
    public void i_enter_invalid_last_name(String last_name) {
        registartionDetails.lName(last_name);
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        registartionDetails.password(password);
    }

    @Then("I can verify first name error")
    public void iCanVerifyFirstNameError() {
        registartionDetails.fnameError();
    }

    @And("I can verify last name error")
    public void iCanVerifyLastNameError() {
        registartionDetails.lNameError();
    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    @When("I enter valid first name {string}")
    public void i_enter_valid_first_name(String string) {
        registartionDetails.fName(string);
    }

    @When("I enter valid last name {string}")
    public void i_enter_valid_last_name(String string) {
        registartionDetails.lName(string);
    }

    @When("I enter valid password {string}")
    public void i_enter_valid_password(String string) {
        registartionDetails.password(string);
    }

    @And("I enter address {string}")
    public void i_Enter_Address(String string) {
        registartionDetails.address(string);
    }

    @When("I enter city name {string}")
    public void i_enter_city_name(String string) {
        registartionDetails.city(string);
    }

    @When("I select state from dropdown {string}")
    public void i_select_state_from_dropdown(String string) {
        registartionDetails.state(string);
    }

    @And("I select country at index position one")
    public void i_Select_Country_At_Index_Position_One() {
        registartionDetails.country();
    }

    @When("I enter zipcode in numbers only as {string}")
    public void i_enter_zipcode_in_numbers_only_as(String string) {
        registartionDetails.zipCode(string);
    }
    @And("I enter valid numeric mobile number as {string}")
    public void i_Enter_Valid_Numeric_Mobile_Number_As(String string) {
        registartionDetails.mobileNum(string);
    }

    @When("Press Create account button")
    public void press_create_account_button() {
        registartionDetails.click_Register_Btn();
    }

    @Then("I should be navigate to Account dashboard")
    public void i_should_be_navigate_to_account_dashboard() {
        regLoginSuccess.verify_Registration_Success("My account - My Store");
    }

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    @Then("user should be on login page")
    public void user_should_be_on_login_page() {
        regSignInPage.verify_Registration_Pg_Url();
        regSignInPage.verify_Login_Pg_Title("Login - My Store");
    }

    @Given("user must be registered")
    public void user_must_be_registered() {
    }

    @And("user enter email id {string}.")
    public void userEnterEmailId(String string) {
        regSignInPage.login_EmailID(string);
    }

    @Given("user enter valid password {string}")
    public void user_enter_valid_password(String string) {
        regSignInPage.login_password(string);
    }

    @Given("click on log in button")
    public void click_on_log_in_button() {
        regSignInPage.login_Btn();
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        regLoginSuccess.VerifyLogOutBtn();
    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    //Login Fail

    @When("user enter invalid email id {string}.")
    public void user_enter_invalid_email_id(String string) {
        regSignInPage.login_EmailID(string);

    }

    @When("user enter invalid valid password {string}")
    public void user_enter_invalid_valid_password(String string) {
        regSignInPage.login_password(string);
    }

    @Then("user should not be logged in and show error message")
    public void user_should_not_be_logged_in_and_show_error_message() {
        regSignInPage.login_error();
    }

}
