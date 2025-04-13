package com.amazon.pages;

import org.openqa.selenium.By;


public class _13_LanguagePage extends _1_BasePage {

    public static By languageTitle = By.xpath("(//h3[normalize-space()='Language Settings'])[1]");
    public static By arabicRadiobutton = By.xpath("(//i[@class='a-icon a-icon-radio'])[1]");
    public static By submitButton = By.xpath("(//input[@class='a-button-input'])[1]");

    public static boolean isCartVisible() {
        return driver.findElement(languageTitle).isDisplayed();
    }

    public static void clickArabicRadioButton(){
        click(arabicRadiobutton);
    }

    public static void clickSubmitButton(){
        click(submitButton);
    }
}
