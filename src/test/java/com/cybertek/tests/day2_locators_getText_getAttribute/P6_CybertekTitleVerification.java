package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CybertekTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //TC #6: Practice Cybertek – Class locator practice
        //1. OpenChromebrowser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2. Gotohttp://practice.cybertekschool.com/inputs
        driver.get("http://practice.cybertekschool.com/inputs");
        // 3. Click“Home”button
        //1st locate the web element using class attribute value
        //2nd click
        Thread.sleep(3000);

        driver.findElement(By.className("nav-link")).click();

        //4. Verifytitleasexpected:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }
    }
}
