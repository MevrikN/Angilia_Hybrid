package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class RegLoginSuccess extends Utils{

    By _logoutBtn = By.xpath("//a[contains(text(),'Sign out') and @class='logout']");
    By _searchBox = By.xpath("//input[@id='search_query_top']");
    By _searchBtn = By.xpath("//button[contains(@name,\"submit_search\")]");
    By _womenTab = By.xpath("//a[text()='Women']");
    By _womenTopsTShirts = By.xpath("//li[1]//li/a[@title='Tops']//following-sibling::ul/li[1]/a[@title='T-shirts']");
    By _logoutBtnVerification = By.xpath("//div[@class='header_user_info']//a[@class='logout']");

    //Search items
    public void search_Item(String itemName ){
        driverSendKeys(_searchBox,itemName);
        driverClickOnElement(_searchBtn);
    }

    /** Verify Registration link
    used try catch block to refresh the page when 508 error comes **/

    public void verify_Registration_Success(String expTitleOfPage){

        try {
            titleOfPage().equalsIgnoreCase("508 Resource Limit Is Reached");
        } catch (Exception e) {
            driver.navigate().refresh();
            driverWaitUrlToBe("http://automationpractice.com/index.php?controller=my-account", 5);
            String actitle = titleOfPage();
            Assert.assertEquals(actitle, expTitleOfPage, "Title does not matched");
        }
    }

    //Log out button
    public void click_Logout_Btn(){
        //Logout button
        driverClickOnElement(_logoutBtn);
    }

    //Hover over action on women category
    public void women_category(){
        Actions actions = new Actions(driver);
        Action hoverOverWomenCategory = actions.moveToElement(driver.findElement(_womenTab))
               .moveToElement(driver.findElement(_womenTopsTShirts)).click().build();

        hoverOverWomenCategory.perform();
    }

    //Verify log out button
    public void VerifyLogOutBtn(){
        waitForElementVisible(_logoutBtnVerification,5);
    }

}
