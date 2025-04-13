package com.amazon.base;

import com.amazon.pages._1_BasePage;
import com.amazon.pages._2_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    //important in Before/after Class

    protected WebDriver driver;
    public String url = "https://www.amazon.eg/?language=en_AE";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url); //open the driver to this URL
        _1_BasePage.setDriver(driver);
    }

    @AfterClass
    public void tearDown() {
        wait(3);

        // Then quit the browser
        if (driver != null) {
            driver.quit();
        }

    }

    public void wait(int x){
        try {
            // Wait for a few seconds before closing
            TimeUnit.SECONDS.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}