package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectModelPractice {

    @Test
    public void negative_login_to_library_test(){
        //1- Go to library
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");

        /*Create object of the class
        When we create the object of "LibraryLoginPage", constructor will automatically initialize driver
        and object of LibraryLoginPage
        Meaning we will be able to use the slenium method through the object of the class
        */
        LibraryLoginPage loginPage = new LibraryLoginPage();

        //2- Enter incorrect Username
        loginPage.inputEmail.sendKeys("abrakadabra");
        //3- Enter incorrect Password
        loginPage.inputPassword.sendKeys("izesMiGa");
        //4- click to sign in button
        loginPage.signInButton.click();
        //5- Verify error message in display
        Assert.assertTrue(loginPage.incorrectEmailOrPasswordError.isDisplayed());
    }
}
