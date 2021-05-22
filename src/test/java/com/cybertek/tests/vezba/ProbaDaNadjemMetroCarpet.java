package com.cybertek.tests.vezba;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ProbaDaNadjemMetroCarpet {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://maps.google.com");
        //searchboxinput
        driver.findElement(By.id("searchboxinput")).sendKeys("carpet cleaning near 22102" + Keys.ENTER);
        //driver.findElement(By.partialLinkText("section-layout")).getAttribute("name");
        //driver.findElement(By.partialLinkText("section-layout")).getAttribute("id");
        //driver.findElement(By.partialLinkText("section-layout")).getAttribute("class");
        //driver.findElement(By.partialLinkText("section-layout")).getAttribute("href");
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        for(WebElement each: listOfLinks){
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
        }

    }
}
