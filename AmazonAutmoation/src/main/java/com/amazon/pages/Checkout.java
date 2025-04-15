package com.amazon.pages;

import org.openqa.selenium.By;


public class Checkout extends BasePage {

    public static By checkoutTitle = By.xpath("(//a[normalize-space()='Secure checkout'])[1]");

    public static boolean isCheckoutPageVisible() {
        return driver.findElement(checkoutTitle).isDisplayed();
    }

}
