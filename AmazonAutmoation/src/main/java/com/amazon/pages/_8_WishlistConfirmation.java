package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class _8_WishlistConfirmation extends _1_BasePage {

    public static By addConfirmation = By.xpath("//span[normalize-space()='1 item added to']");
    public static By viewList = By.xpath("//a[normalize-space()='View your list']");

    public static boolean isProductAdded() {
        return driver.findElement(addConfirmation).isDisplayed();
    }

    public static _9_WishlistPage openViewList() {
        click(viewList);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("//a[@href='/-/en/hz/wishlist/ls/ref=cm_wl_your_lists']")));
        return new _9_WishlistPage();

    }

}
