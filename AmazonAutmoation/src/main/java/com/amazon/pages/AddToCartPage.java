package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AddToCartPage extends BasePage {


    public static By goToCart = By.xpath("(//a[@href='/-/en/cart?ref_=sw_gtc'])[1]");
    public static By addedToCart = By.xpath("(//h1[normalize-space()='Added to cart'])[1]");

    public static boolean isAddtoCartVisible() {
        return driver.findElement(addedToCart).isDisplayed();
    }

    public static CartPage openCartPage() {
        click(goToCart);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h2[normalize-space()='Shopping Cart'])[1]")));
        return new CartPage();

    }

}
