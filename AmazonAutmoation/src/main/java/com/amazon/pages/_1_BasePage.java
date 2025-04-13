package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class _1_BasePage {
    private String url;

    public static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        _1_BasePage.driver = driver;
    }

    protected static WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected static void set(By locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected static void click(By locator) {
        find(locator).click();
    }

    public static String getUrl(String q){
        if(q.equals("qa")){
            return "qa.team";
        }
        return "https://www.amazon.eg/?language=en_AE";
    }

    public void wait(int x) {
        try {
            // Wait for a few seconds before closing
            TimeUnit.SECONDS.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}