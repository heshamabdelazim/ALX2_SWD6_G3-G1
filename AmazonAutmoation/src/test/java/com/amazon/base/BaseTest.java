package com.amazon.base;

import com.amazon.data.DataBase;
import com.amazon.pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    //important in Before/after Class
    private static DataBase myData=DataBase.startDataBase();

    //

    protected static WebDriver driver;
//    public static String url = _1_BasePage.getUrl("any");

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.setProperty("java.util.logging.config.file", "src/main/resources/logging.properties");
        driver.manage().window().maximize();
        driver.get(myData.url); //open the driver to this URL
        BasePage.setDriver(driver);
    }


    @AfterClass
    public void tearDown() {
        wait(3);

        // Then quit the browser
        if (driver != null) {
            driver.quit();
        }

    }
//    public static void setUp(String url){
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get(url); //open the driver to this URL
//        _1_BasePage.setDriver(driver);
//    }
    public void wait(int x){
        try {
            // Wait for a few seconds before closing
            TimeUnit.SECONDS.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}