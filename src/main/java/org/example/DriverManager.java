package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static org.example.BasePage.driver;

public class DriverManager extends Utils{

    //TODO:Write Your choice of browser name to run Script (Chrome,Firefox,Edge)
    String browserName = "chrome";

    public void openBrowser(){
        if(browserName.equalsIgnoreCase("Chrome")) {
        System.out.println("Running on Chrome");

        //Open Chrome
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();  // import chrome web-Driver dependency (In 'POM' file)

    }else if(browserName.equalsIgnoreCase("Firefox")) {
        System.out.println("Running on Firefox");

        //Firefox
        System.setProperty("webdriver.gecko.driver","src/test/java/Drivers/geckodriver.exe" );
        driver= new FirefoxDriver();

    }else if(browserName.equalsIgnoreCase("Edge")){
        System.out.println("Running on Edge");

        //Edge
        System.setProperty("webdriver.edge.driver","src/test/java/Drivers/msedgedriver.exe");
        driver = new EdgeDriver();

    }else {
        System.out.println("You Entered un-valid Browser name :" + browserName);

    }

        //Open Chrome
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();  // import chrome web-Driver dependency (In 'POM' file)

        //Duration to be wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Maximize the screen
        driver.manage().window().maximize();

        //Open Web page
        driver.get("http://automationpractice.com/index.php?");
    }

    public void closeBrowser(){
        driver.quit();

    }
}
