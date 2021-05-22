package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttributeValueVerification {
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

        //3. Verify "Create a page" link href value contains text:
        //Locating the "Create a page" Link
        WebElement createPageLink = driver.findElement(By.linkText("Create a Page"));

        //Expected: "registration_form"
        String expectedInHref = "registration_form";
        Thread.sleep(5000);
        String actualHrefValue = createPageLink.getAttribute("href");

        System.out.println("actualHrefValue = " + actualHrefValue);

        if(actualHrefValue.equals(expectedInHref)){
            System.out.println("HREF value verification PASSED!");
        }else {
            System.out.println("HREF value verification FAILED!");
        }

    }
}
