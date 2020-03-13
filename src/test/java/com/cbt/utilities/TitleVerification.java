package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/","http://practice.cybertekschool.com/dropdown","http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get(urls.get(0));
        BrowserUtils.wait(2);
        String title1 = driver.getTitle();
        String url1 = driver.getCurrentUrl();


        driver.navigate().to(urls.get(1));
        BrowserUtils.wait(2);
        String title2 = driver.getTitle();
        String url2 = driver.getCurrentUrl();


        driver.navigate().to(urls.get(2));
        BrowserUtils.wait(2);
        String title3 = driver.getTitle();
        String url3 = driver.getCurrentUrl();

        if (title1.equals(title2) && title2.equals(title3)
                && url1.startsWith("http://practice.cybertekschool.com") &&
                url2.startsWith("http://practice.cybertekschool.com")&&
                url3.startsWith("http://practice.cybertekschool.com")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        driver.quit();




    }
}
