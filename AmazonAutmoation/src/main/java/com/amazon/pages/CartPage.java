package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CartPage extends BasePage {

    public static By shoppingCartTitle = By.xpath("(//h2[normalize-space()='Shopping Cart'])[1]");
    public static By proceedToBuy = By.xpath("(//input[@name='proceedToRetailCheckout'])[1]");
    public static By trashIcon = By.xpath("//span[@class='a-icon a-icon-small-trash']");

    public static boolean isCartVisible() {
        return driver.findElement(shoppingCartTitle).isDisplayed();
    }

    public static void deleteProduct() {
        click(trashIcon);
    }

    public static Checkout openCheckoutPage() {
        click(proceedToBuy);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[normalize-space()='Secure checkout'])[1]")));
        return new Checkout();

    }

}
