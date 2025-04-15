package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LanguagePage extends BasePage {

    public static By languageTitle = By.xpath("(//h3[normalize-space()='Language Settings'])[1]");
    public static By arabicRadiobutton = By.xpath("(//i[@class='a-icon a-icon-radio'])[1]");
    public static By submitButton = By.xpath("(//input[@class='a-button-input'])[1]");

    public static boolean isLanguagePageVisible() {
        return driver.findElement(languageTitle).isDisplayed();
    }

    public static void clickArabicRadioButton(){
        click(arabicRadiobutton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h3[contains(text(),'إعدادات اللغة')])[1]")));
    }

    public static void clickSubmitButton(){
        click(submitButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[contains(text(),'عربة التسوق')])[1]")));
    }
}
