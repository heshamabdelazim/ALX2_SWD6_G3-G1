package com.amazon.pages;

import org.openqa.selenium.By;

public class _3_3_RegisterPage extends _1_BasePage {
    static private By nameField = By.name("customerName");
    static private By emailField = By.name("email");
    static private By passField = By.name("password");
    static private By rePassField = By.name("passwordCheck");
    static private By continueButton = By.cssSelector("#continue");


    public static void addInputs(String firstName, String email, String pass){
        set(nameField, firstName);
        set(emailField, email);
        set(passField,pass);
        set(rePassField, pass);
    }
}
