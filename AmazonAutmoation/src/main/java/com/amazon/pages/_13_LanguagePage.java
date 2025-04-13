package com.amazon.pages;

import org.openqa.selenium.By;


public class _13_LanguagePage extends _1_BasePage {

    public static By checkoutTitle = By.xpath("(//a[normalize-space()='Secure checkout'])[1]");

    public static boolean isCartVisible() {
        return driver.findElement(checkoutTitle).isDisplayed();
    }



}
