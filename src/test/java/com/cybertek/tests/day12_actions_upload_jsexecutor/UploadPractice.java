package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {
    @Test
    public void upload_test(){
        //1. Go to http://practice.cybertekschool.com/upload
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        //2. Find some small file from your computer, and get the path of it.
        // Windows: shift + right click
        // Mac: right click + press and hold options --> copy as a path name

        String path = "/Users/misha/Desktop/HTML Class/CybertekLogoNoText.jpeg";

        // 3. Upload the file.
        WebElement chooseFile=Driver.getDriver().findElement(By.id("file-upload"));

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

        BrowserUtils.sleep(3);

        //Sending the file path to the chooseFile WebElement
        chooseFile.sendKeys(path);

        //click to upload button
        uploadButton.click();

        //4. Assert:
        //-File uploaded text is displayed on the page
        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadedMessage.isDisplayed());

        Driver.closeDriver();
    }
}
