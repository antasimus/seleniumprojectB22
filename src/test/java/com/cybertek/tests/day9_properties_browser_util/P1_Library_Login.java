package com.cybertek.tests.day9_properties_browser_util;

import com.cybertek.tests.utilities.BrowserUtils;
import com.cybertek.tests.utilities.ConfigurationReader;
import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_Library_Login {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://library2.cybertekschool.com/login.html");
    }

    public void loginToLibrary(){
        //3. Enter username: “”
        WebElement inoutUsername = driver.findElement(By.xpath("//input[@id='inputEmail']"));
        inoutUsername.sendKeys("student11@Library");
        //4. Enter password: “”
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='inputPassword']"));
        inputPassword.sendKeys("tScBPCUr");
        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
        loginButton.click();

    }

    @Test
    public void login_link_count_test(){
        //Task #1: Library software link verification
        //loginMethod calling to login Library app
        loginToLibrary();

        //6. Print out count of all the links on landing page
        BrowserUtils.sleep(3);

        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("allLinks.size() = " + allLinks.size());

        //7. Print out each link text on this page

        for(WebElement each:allLinks){
            System.out.println(each.getText());
        }
    }
}
