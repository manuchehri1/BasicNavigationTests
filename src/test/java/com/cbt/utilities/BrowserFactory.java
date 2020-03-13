package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().version("79").setup();
            return new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("edge")){
            return null;
        } else if (browserName.equalsIgnoreCase("safari")){

            return new SafariDriver();
        }
        else{
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
    }
}
