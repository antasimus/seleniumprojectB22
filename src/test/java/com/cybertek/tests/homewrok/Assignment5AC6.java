package com.cybertek.tests.homewrok;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment5AC6<WebElements> {

    @BeforeMethod
    public void fleet_vehicle_page() throws InterruptedException {
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        VytrackLogin loginVytrack = new VytrackLogin();

        loginVytrack.inputEmail.sendKeys("user156");
        loginVytrack.inputPassword.sendKeys("UserUser123");
        loginVytrack.signInButton.click();
        Thread.sleep(3);
        Driver.getDriver().findElement(By.xpath("//li[@class='dropdown dropdown-level-1']")).click();
        Thread.sleep(2);
        Driver.getDriver().findElement(By.xpath("//span[.= 'Vehicles']")).click();
    }

    @Test
    public void refresh_button_positiveScenario() {
        int i = 0, counter = 0;
        List<WebElement> buttons = Driver.getDriver().findElements(By.xpath("//div[@class='actions-panel pull-right form-horizontal']//a"));
        for (WebElement each : buttons) {
            if (each.getText().equals("Reset")) {
                counter = i;
            }
            i++;
        }
        String expectedText = "Refresh";
        String actualText = buttons.get(--counter).getText();
        Assert.assertEquals(actualText, expectedText, "Actual text is not as expected.");
    }

    @Test
    public void refresh_button_negativeScenario() {
        int i = 0, counter = 0;
        List<WebElement> buttons = Driver.getDriver().findElements(By.xpath("//div[@class='actions-panel pull-right form-horizontal']//a"));
        for (WebElement each : buttons) {
            if (each.getText().equals("Reset")) {
                counter = i;
            }
            i++;
        }
        String expectedText = "Refresh";
        String actualText = buttons.get(++counter).getText();
        Assert.assertEquals(actualText, expectedText, "Actual text is not as expected.");
    }

    @AfterMethod
    public void teardownClass() throws InterruptedException {
        Thread.sleep(5000);
        Driver.getDriver().quit();
    }
}

/*
    public String ifButtonOnLeft(String buttonOne, String buttonTwo){
        String xpath = "";
        xpath = "//a[@title='"+buttonOne+"']/..//preceding-sibling::a[@title='"+buttonTwo+"']";
        WebElement element = Driver.getDriver().findElement(By.xpath(xpath));
        return element.getText();
    }

    public String ifButtonOnRight(String buttonOne, String buttonTwo){
        String xpath = "";
        xpath = "//a[@title='"+buttonOne+"']/..//following-sibling::a[@title='"+buttonTwo+"']";
        WebElement element = Driver.getDriver().findElement(By.xpath(xpath));
        return element.getText();
    }
 */

/*
    @Test
    public void refresh_button_positive (){
        int i=3;
        String expectedText = "Refresh";
        System.out.println(Driver.getDriver().findElement(By.xpath("//a[@title='Refresh']/..//preceding-sibling::a[@title='Reset']")).getText());
        WebElement resetButton = Driver.getDriver().findElement(By.xpath("//div[@class='actions-panel pull-right form-horizontal']//a ["+i+"]"));
        //System.out.println(resetButton.getText());
        i--;
        WebElement refreshButton = Driver.getDriver().findElement(By.xpath("//div[@class='actions-panel pull-right form-horizontal']//a ["+i+"]"));
        String actualText = refreshButton.getText();
        //System.out.println(ifButtonOnLeft("Refresh","Reset" ));
        //System.out.println(ifButtonOnRight("Refresh","Reset"));
        Assert.assertEquals(actualText, expectedText, "Actual text is not as expected.");
    }

 */
/*
    @Test
    public void Proba(){
        int i=0,counter=0;
        List<WebElement> buttons = Driver.getDriver().findElements(By.xpath("//div[@class='actions-panel pull-right form-horizontal']//a"));
        //System.out.println(buttons.size());
            for(WebElement each:buttons ){
                if(each.getText().equals("Reset")){
                    counter=i;
                }
                i++;
                //System.out.println(each.getText());
            }
        //System.out.println(counter);
        //System.out.println(buttons.get(--counter).getText());
        //System.out.println(buttons.get(--counter).getText());
        }

 */
/*
    @Test
    public void refresh_button_negative (){
        int i=3;
        String expectedText = "Refresh";
        WebElement resetButton = Driver.getDriver().findElement(By.xpath("//div[@class='actions-panel pull-right form-horizontal']//a ["+i+"]"));
        i++;
        WebElement refreshButton = Driver.getDriver().findElement(By.xpath("//div[@class='actions-panel pull-right form-horizontal']//a ["+i+"]"));
        String actualText = refreshButton.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "Actual text is not as expected.");
    }

 */

