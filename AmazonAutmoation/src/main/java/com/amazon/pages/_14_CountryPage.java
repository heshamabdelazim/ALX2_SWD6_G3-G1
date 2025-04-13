package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class _14_CountryPage extends _1_BasePage {

    public static By countryTitle = By.xpath("(//h3[normalize-space()='Website (Country/Region)'])[1]");
    public static By countryButton = By.xpath("(//span[@class='a-dropdown-prompt'])[1]");
    public static By canadaCountry = By.xpath("(//a[@id='icp-dropdown_3'])[1]");
    public static By submitButton = By.xpath("(//input[@class='a-button-input'])[1]");

    public static boolean isCountryPageVisible() {
        return driver.findElement(countryTitle).isDisplayed();
    }

    public static void clickCountryButton(){
        click(countryButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@id='icp-dropdown_3'])[1]")));
    }

    public static void clickCanadaCountry(){
        click(canadaCountry);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@class='a-dropdown-prompt'])[1]")));
    }

    public static void clickSubmitButton(){
        click(submitButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
