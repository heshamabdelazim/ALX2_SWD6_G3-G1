package com.amazon.pages;

import org.openqa.selenium.By;

public class _3_2_RegisterPage extends _1_BasePage {
//    test
    static private By testIOSign = By.cssSelector("a[data-method:\"post\"]");
    static private By mailField = By.cssSelector("input#code");
    static private By goButton = By.cssSelector("input#submit_code");

    public static void startQA(){
        _1_BasePage.click(testIOSign);
    }
}
