package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WishlistConfirmation extends BasePage {

    public static By addConfirmation = By.xpath("(//h4[normalize-space()='Add to List'])[1]");
    public static By viewList = By.xpath("//a[normalize-space()='View your list']");

    public static boolean isProductAdded() {
        return driver.findElement(addConfirmation).isDisplayed();
    }

    public static WishlistPage openViewList() {
        click(viewList);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("//a[@href='/-/en/hz/wishlist/ls/ref=cm_wl_your_lists']")));
        return new WishlistPage();

    }

}
