package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) {


        List<String> urls = Arrays.asList("https://lulugandgeorgia.com", "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");

        WebDriver driver1 = BrowserFactory.getDriver("chrome");

        driver1.get(urls.get(0));
        BrowserUtils.wait(2);
        String urls1 = driver1.getCurrentUrl();
        String title1 = driver1.getTitle();

        if (urls1.contains(title1.toLowerCase().replace(" ",""))){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
            System.out.println("urls1 = " + urls1);
            System.out.println("title1 = " + title1);
        }
        driver1.quit();

        WebDriver driver2 = BrowserFactory.getDriver("chrome");
        driver2.get(urls.get(1));
        BrowserUtils.wait(2);
        String urls2 = driver2.getCurrentUrl();
        String title2 = driver2.getTitle();

        if (urls2.contains(title2.toLowerCase().replace(" ",""))){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
            System.out.println("urls2 = " + urls2);
            System.out.println("title2 = " + title2);
        }
        driver2.quit();

        WebDriver driver3 = BrowserFactory.getDriver("chrome");
        driver3.get(urls.get(2));
        BrowserUtils.wait(2);
        String urls3 = driver3.getCurrentUrl();
        String title3 = driver3.getTitle();

        if (urls3.contains(title3.toLowerCase().replace(" ",""))){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
            System.out.println("urls3 = " + urls3);
            System.out.println("title3 = " + title3);
        }
        driver3.quit();

        WebDriver driver4 = BrowserFactory.getDriver("chrome");
        driver4.get(urls.get(3));

        BrowserUtils.wait(2);
        String urls4 = driver4.getCurrentUrl();
        String title4 = driver4.getTitle();

        if (urls4.contains(title4.toLowerCase().replace(" ",""))){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
            System.out.println("urls4 = " + urls4);
            System.out.println("title4 = " + title4);
        }

        driver4.quit();

    }
}
