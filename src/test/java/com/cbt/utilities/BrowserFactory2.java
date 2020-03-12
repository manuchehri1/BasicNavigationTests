package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory2 {
    public static WebDriver driverCreator(String str) {
        if (str.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().version("79").setup();
            return new ChromeDriver();
        }else if(str.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }

        else {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }

    }
}