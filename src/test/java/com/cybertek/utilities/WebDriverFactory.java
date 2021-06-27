package com.cybertek.utilities;
//TASK: New Method Creation
//Method name: getDriver
// Static method
//Accept String arg: browserType
//  -  This arg will determine what type of browser is opened
//  -  If "chrome" passed --> it will open chrome
//  -  If "firefox" passed --> it will open firefox
//Return Type: "WebDriver

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver getDriver(String browserType){
        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else{
            System.out.println("Give browser type doesn't exist.Driver = null");
            return null;
        }
    }

}
