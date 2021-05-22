package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {

        //TC #2: Cybertek practice tool verifications

        // SETUP THE BROWSER DRIVER
        WebDriverManager.chromedriver().setup();

        //1. OpenChromebrowser
        WebDriver driver = new ChromeDriver();
        //maximize the page
        driver.manage().window().maximize();
        //2. Gotohttps://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com/");
        //http://practice.cybertekschool.com/
        //3. VerifyURLcontains
        //Expected: cybertekschool
        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification PASSED!");
        } else{
            System.out.println("URL verification FAILED!");
        }

        //4. Verifytitle:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title verification PASSED!");
        } else{
            System.out.println("Title verification FAILED!");
        }
    }
}
