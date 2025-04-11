package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class _7_ProductDetailPage extends _1_BasePage {

    public static By confirmPDP = By.xpath("//span[@id='productTitle']");
    public static By addToList = By.xpath("//input[@id='add-to-wishlist-button-submit']");

    public static boolean isPDPVisible() {
        return driver.findElement(confirmPDP).isDisplayed();
    }


    public static _8_WishlistConfirmation openWishConfirmation() {
        click(addToList);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='View your list']")));
        return new _8_WishlistConfirmation();

    }
}
