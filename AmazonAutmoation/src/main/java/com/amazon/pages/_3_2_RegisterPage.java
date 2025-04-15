package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _3_2_RegisterPage extends _1_BasePage {
//    test
//    static private By startHereLink = By.cssSelector("#nav-flyout-ya-newCust > a");
    static private By proceedButton = By.xpath("//input[@type='submit']");

    public static boolean isStartHereLink(){return driver.findElement(proceedButton).isDisplayed();}


    public static _3_3_RegisterPage clickRegister(){
        click(proceedButton);
        return new _3_3_RegisterPage();
    }


}
