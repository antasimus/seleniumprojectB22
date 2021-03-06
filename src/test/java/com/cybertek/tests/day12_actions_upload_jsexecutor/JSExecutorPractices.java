package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutorPractices {
    @Test
    public void scroll_using_jsExecutor_test1(){

        //Get the page: http://practice.cybertekschool.com/infinite_scroll
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");
        //((JavascriptExecutor) Driver.getDriver()).executeScript("")
        BrowserUtils.sleep(2);
        // Down casting our driver type to JavascriptExecutor so we can reach methods in this interface
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //using js we reach executeScript method so we are allowed to pass JavaScript functions.
        //this method is capable of accepting JavaScript functions and apply that into our Java+Selenium code
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0, 250)");
        }

        BrowserUtils.sleep(2);
        js.executeScript("window.scrollBy(0, -1250)");
    }

    @Test
    public void scroll_using_jsExecutor_test2(){
        //Go to this page: http://practice.cybertekschool.com/large
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //Locating the web elements so we can use in js.executeScript method
        WebElement cybertekSchoolLink= Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink= Driver.getDriver().findElement(By.linkText("Home"));

        BrowserUtils.sleep(2);

        //use js.executor with different scrolling JavaScript function
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);
    }
}
