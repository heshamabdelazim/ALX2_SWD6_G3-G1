package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class _12_Checkout extends _1_BasePage {

    public static By checkoutTitle = By.xpath("(//a[normalize-space()='Secure checkout'])[1]");

    public static boolean isCheckoutPageVisible() {
        return driver.findElement(checkoutTitle).isDisplayed();
    }

}
