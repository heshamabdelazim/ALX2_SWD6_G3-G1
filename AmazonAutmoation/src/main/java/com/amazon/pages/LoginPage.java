package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage extends BasePage {

    private static By usernameField = By.id("ap_email_login");
    private static By continueButton = By.id("continue");
    private static By createButton = By.xpath("//input[@type='submit']");



    public static void setUsername(String username){
        set(usernameField, username);
    }

    public static ContinuePage signinButton(){
        click(continueButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ap_password")));
        return new ContinuePage();
    }


    public static RegisterPageContinue clickRegister(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        click(createButton);
        return new RegisterPageContinue();
    }

}
