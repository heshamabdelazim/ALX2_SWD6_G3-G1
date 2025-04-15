package com.amazon.base;

import com.amazon.data.DataBase;
import com.amazon.pages.BasePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    //important in Before/after Class
    private static DataBase myData=DataBase.startDataBase();

    protected static WebDriver driver;

    protected static ExtentReports report;
    protected static ExtentTest test;

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


    @BeforeSuite
    public void setupExtent() {
        report = ExtentReportManager.getInstance();
    }

    @AfterSuite
    public void tearDownExtent() {
        if (report != null) {
            report.flush();
        }
    }

    @BeforeMethod
    public void createTestReport(Method method) {
        test = report.createTest(method.getName());
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