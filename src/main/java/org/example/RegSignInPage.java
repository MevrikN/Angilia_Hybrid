package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegSignInPage extends Utils {



    LoadProp loadProp = new LoadProp();

    By _emailAddressField = By.id("email_create");
    By _errorMessageEmail = By.xpath("//li[contains(text(),'this email address')]");
    By _createAccountBtn = By.id("SubmitCreate");
    By _loginEmail = By.cssSelector("#email");
    By _password = By.name("passwd");
    By _loginBtn = By.id("SubmitLogin");
    By _loginErrorMessg = By.xpath("//div[@class='alert alert-danger']//p[contains(text(),'error')]");


    //Page verification
    public void verify_Registration_Pg_Url() {
        try{
        driverWaitUrlToBe("http://automationpractice.com/index.php?controller=authentication&back=my-account", 5);
    }catch(Exception e){
            driver.navigate().refresh();
        }
    }

    //Get Title of the Page
    public void verify_Login_Pg_Title(String exp_Title) {
        try {
            titleOfPage().equalsIgnoreCase("508 Resource Limit Is Reached");
        } catch (Exception e) {
            driver.navigate().refresh();
            Assert.assertEquals(titleOfPage(), exp_Title, "Title does not matched");
        }
    }

    //Email address
    public void enter_Email_Address(String email) {
        driverSendKeys(_emailAddressField,email);
        System.out.println("Email address Entered: " +email );
    }

    //Error message for registration email
    public void errorMessage_Message_Email_Wrong(){
        driver.findElement(_errorMessageEmail);
    }

    //Click Button
    public void click_Create_Account_Btn() {
        driverWaitsUntilClick(_createAccountBtn, 0);
    }

    //Login Email
    public void login_EmailID(String email){
         driverSendKeys(_loginEmail,email);
        System.out.println("Loged In using :-"+email);
    }

    //Login Password
    public void login_password(String password){
        driverSendKeys(_password,password);
    }

    //Click Login Button
    public void login_Btn(){
        driverClickOnElement(_loginBtn);
    }

    //LoginError
    public void login_error(){
        gettext(_loginErrorMessg);
    }
}