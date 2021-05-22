package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: Facebook title verification
        //1. OPen Chrome browser
        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        //use the 'driver' object created to use selenium methods
        //maximize browser
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //Locating the web element using ID locator and storing it in WebElemnt type.
        WebElement inputUsername = driver.findElement(By.id("email"));

        //3. Enter incorrect username
        inputUsername.sendKeys("something1213@gmail.com");

        //Locate the web element using
        WebElement inputPassword = driver.findElement(By.id("pass"));

        //4 Enter incorrect password
        inputPassword.sendKeys("some wrong password" + Keys.ENTER);

        //5. Verify title changed to:
        //Expected: "Log into Facebook
        String expectedTitle = "Log into Facebook";
        //Freezing the code for 5 seconds so that Chrome can catch up with loading rhe page
        Thread.sleep(5000);
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }

    }
}
