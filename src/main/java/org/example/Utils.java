package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage{

    //Get Text from elements
    public static String getTextFromElement(By by)
    {
        String name = driver.findElement(by).getText();
        return name;
    }

    //Wait for element to be click-able
    public static void driverWaitsUntilClick(By by, int time)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    //URL contains
    public static void urlContains(String contains,int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlContains(contains));
    }

    //Wait for Element to be visible
    public static void waitForElementVisible(By by,int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //URL to be
    public static void driverWaitUrlToBe(String exUrl , int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlToBe(exUrl));
    }

    //Get text
    public static String gettext(By by)
    {
        return driver.findElement(by).getText();
    }

    //Get Title of the Page
    public static String titleOfPage()
    {
        return driver.getTitle();
    }

    //Send Text Values
    public static void driverSendKeys(By by, String value)
    {
        driver.findElement(by).sendKeys(value);
    }

    //Random Date Time stamp
    public static String rendomdate()
    {
        Date date = new Date();
        SimpleDateFormat formate = new SimpleDateFormat("ddMMyyyyHHmmss");
        return formate.format(date);
    }

    //Wait until Attribute ToBe
    public static void driverAttributeToBe(By by, String attribute, String value, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.attributeToBe(by,attribute,value));
    }

    //Get attribute value from DOM
    public static String getAttributeValue(By by,String name)
    {
        String value= driver.findElement(by).getDomAttribute(name);
        return value;
    }

    //Click on Element
    public static void driverClickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    //Select by Index
    public static void selectByIndex(By by , int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    //Select By Visible Text
    public static void selectByVisibleText(By by,String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //Select by value
    public static void selectByValue(By by ,String value ){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
}
