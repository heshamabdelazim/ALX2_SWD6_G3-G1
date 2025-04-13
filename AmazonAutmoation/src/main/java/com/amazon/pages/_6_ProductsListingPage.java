package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class _6_ProductsListingPage extends _1_BasePage {

    public static By searchResults = By.xpath("(//span[@class='a-dropdown-prompt'])[1]");
    public static By searchProduct = By.xpath("//span[normalize-space()='Men Classic Shirt from White Eagle']");

    public static boolean isPLPVisible() {
        return driver.findElement(searchResults).isDisplayed();
    }


    public static _7_ProductDetailPage productDetails() {
        click(searchProduct);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("productTitle")));
        return new _7_ProductDetailPage();

    }

}
