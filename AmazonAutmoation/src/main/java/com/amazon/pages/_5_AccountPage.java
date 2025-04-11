package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class _5_AccountPage extends _1_BasePage {

    public static By yourAccountConfirm = By.xpath("//h1[normalize-space()='Your Account']");
    public static By yourList = By.xpath("//h2[normalize-space()='Your Lists']");

    public static boolean isYourAccountVisible() {
        return driver.findElement(yourAccountConfirm).isDisplayed();
    }

    public static _9_WishlistPage openWishlistPage() {
        click(yourList);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/-/en/hz/wishlist/ls/ref=cm_wl_your_lists']")));
        return new _9_WishlistPage();

    }

}
