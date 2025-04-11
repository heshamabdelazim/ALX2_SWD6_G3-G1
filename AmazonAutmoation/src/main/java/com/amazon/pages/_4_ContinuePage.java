package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class _4_ContinuePage extends _1_BasePage {

    private static By passwordField = By.id("ap_password");
    private static By signinButton = By.id("signInSubmit");

    public static void setPassword(String password){
        set(passwordField, password);
    }

    public static _2_HomePage clickContinueButton(){
        click(signinButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-logo-sprites")));
        return new _2_HomePage();
    }
}
