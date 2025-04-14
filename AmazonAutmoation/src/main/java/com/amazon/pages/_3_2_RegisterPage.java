package com.amazon.pages;

import org.openqa.selenium.By;

public class _3_2_RegisterPage extends _1_BasePage {
//    test
    static private By testIOSign = By.cssSelector("a[data-method:\"post\"]");


    public static _3_3_RegisterPage startQA(){
        _1_BasePage.click(testIOSign);
        return new _3_3_RegisterPage();
    }
}
