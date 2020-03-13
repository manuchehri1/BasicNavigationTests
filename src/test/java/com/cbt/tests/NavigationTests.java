package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import com.cbt.utilities.StringUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTests {
    public static void main(String[] args)  {
        chromeTest();
    }

    public  static void chromeTest() {
       WebDriver driver = BrowserFactory.getDriver("chrome");
       driver.get("http://google.com");
        BrowserUtils.wait(2);
        String google = driver.getTitle();  /// "Google"

        driver.navigate().to("https://etsy.com");
        BrowserUtils.wait(2);
        String etsy = driver.getTitle();

        driver.navigate().back();
        BrowserUtils.wait(2);
        String googleNew =driver.getTitle();

        StringUtility.verifyEquals(google,googleNew);

        driver.navigate().forward();
        BrowserUtils.wait(2);
        String etsyNew = driver.getTitle();


        StringUtility.verifyEquals(etsy,etsyNew);

        driver.quit();




    }
    public static void fireFoxTest(){
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("http://google.com");
        BrowserUtils.wait(2);
        String google = driver.getTitle();  /// "Google"

        driver.navigate().to("https://etsy.com");
        BrowserUtils.wait(2);
        String etsy = driver.getTitle();

        driver.navigate().back();
        BrowserUtils.wait(2);
        String googleNew =driver.getTitle();

        StringUtility.verifyEquals(google,googleNew);

        driver.navigate().forward();
        BrowserUtils.wait(2);
        String etsyNew = driver.getTitle();


        StringUtility.verifyEquals(etsy,etsyNew);

        driver.quit();
    }
    public static void safariTest(){
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("http://google.com");
        BrowserUtils.wait(2);
        String google = driver.getTitle();  /// "Google"

        driver.navigate().to("https://etsy.com");
        BrowserUtils.wait(2);
        String etsy = driver.getTitle();

        driver.navigate().back();
        BrowserUtils.wait(2);
        String googleNew =driver.getTitle();

        StringUtility.verifyEquals(google,googleNew);

        driver.navigate().forward();
        BrowserUtils.wait(2);
        String etsyNew = driver.getTitle();


        StringUtility.verifyEquals(etsy,etsyNew);

        driver.quit();
    }



}
