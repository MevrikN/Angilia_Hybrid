package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistartionDetails extends Utils {

    By _firstName = By.xpath("//input[@name=\"customer_firstname\"]");
    By _firstNameError = By.xpath("//input[@id='customer_firstname']//parent::div[@class='required form-group form-error']");
    By _firstNameOk = By.xpath("//input[@id='customer_firstname']//parent::div[@class='required form-group form-ok']");
    By _lastNameError = By.xpath("//input[@id='customer_lastname']//parent::div[@class='required form-group form-error']");
    By _lastNameOk = By.xpath("//input[@id='customer_lastname']//parent::div[@class='required form-group form-ok']");
    By _lastName = By.id("customer_lastname");
    By _password = By.id("passwd");
    By _address1 = By.name("address1");
    By _cityName = By.xpath("//p[@class=\"required form-group\"]//following::input[@name='city']");
    By _stateName =By.id("id_state");
    By _zipCode = By.id("postcode");
    By _country = By.id("id_country");
    By _mobileNumber = By.id("phone_mobile");
    By registerBtn = By.xpath("//span[contains(text(),'Register')]");


    //Verify Page URL
    public void verify_Registration_Details_Url() {
        urlContains("account-creation",10);
    }

    //First name
    public void fName(String firstName){
        driverSendKeys(_firstName,firstName);
    }

    //First name error
    public void fnameError(){
      String error = driver.findElement(_firstNameError).getDomAttribute("class");
      Assert.assertTrue(error.contains("error"),"DOM property does not contains error keyword.");
    }

    //First name Ok
    public void fnameOk(){
        String ok = driver.findElement(_firstNameOk).getDomAttribute("class");
        Assert.assertTrue(ok.contains("ok"),"Dom property does not contains ok Keyword.");
    }

    //Last name
    public void lName(String lastName){
        driverSendKeys(_lastName, lastName);
    }

    //Last name Error
    public void lNameError(){
        String error = driver.findElement(_lastNameError).getDomAttribute("class");
        Assert.assertTrue(error.contains("error"),"DOM property does not contains error keyword.");
    }

    //Last name ok
    public void lNameOk(){
        String error = driver.findElement(_lastNameOk).getDomAttribute("class");
        Assert.assertTrue(error.contains("error"),"DOM property does not contains ok keyword.");
    }

    //Password
    public void password(String password){
        driverSendKeys((_password),password);
    }

    //Address
    public void address(String address){
        //Address line
        driverSendKeys(_address1,address);
    }

    //City
    public void city(String cityName){
        driverSendKeys(_cityName,cityName);
    }

    //State
    public void state(String stateName){
        selectByVisibleText(_stateName,stateName);
    }

    //ZipCode
    public void zipCode(String zipCode){
        driverSendKeys(_zipCode,zipCode);
    }

    //Country
    public void country(){
        selectByIndex(_country,1);
    }

    //Mobile Phone
    public void mobileNum(String mobileNumber){
        driverSendKeys(_mobileNumber,mobileNumber);
    }

    //Registration Button
    public void click_Register_Btn(){
        driverWaitsUntilClick(registerBtn,5);
    }


}
