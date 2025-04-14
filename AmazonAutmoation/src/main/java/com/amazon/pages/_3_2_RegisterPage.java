package com.amazon.pages;

import org.openqa.selenium.By;

public class _3_2_RegisterPage extends _1_BasePage {
//    test
    static private By startHereLink = By.cssSelector("div#nav-flyout-ya-newCust > a");


    public static _3_3_RegisterPage clickRegister(){
        _1_BasePage.click(startHereLink);
        return new _3_3_RegisterPage();
    }
}
