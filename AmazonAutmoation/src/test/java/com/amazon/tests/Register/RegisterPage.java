package com.amazon.tests.Register;

import com.amazon.base.BaseTest;
import com.amazon.data.DataBase;
import com.amazon.pages._1_BasePage;
import com.amazon.pages._3_2_RegisterPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterPage extends BaseTest {

    private static DataBase myData = DataBase.startDataBase();
//    static String url= _1_BasePage.getUrl("qa");

    @BeforeClass
    public static void setUp(){
        myData.url="https://qa.team/session/new?locale=en";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(myData.url); //open the driver to this URL
        _1_BasePage.setDriver(driver);
    }

    @Test
    public void userRegsiter(){
        _3_2_RegisterPage.startQA();
        //Open URL =>QA.team
        //enter keys with saving this keys
        //click go
        //open URL amazon
        //Header-right, click on start here
        // "Your name" input
        //mobile number or email input
        //password
        //Re-enter password
        //Click Continue
    }
}
