package com.amazon.tests.Register;

import com.amazon.base.BaseTest;
import com.amazon.data.DataBase;
import com.amazon.pages.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    private static DataBase myData = DataBase.startDataBase();
//    static String url= _1_BasePage.getUrl("qa");

    @BeforeClass
    public static void setUp(){
        myData.logout();
        myData.setEmail("heshamabdelazim43@gmail.com");
        myData.setPassword("Hesh34@#");
//        **** Resetting DB is done ******
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(myData.url); //open the driver to this URL
        _1_BasePage.setDriver(driver);
    }

    @Test
    public void userRegsiter(){
        _2_HomePage.signinLink();
        _3_1_LoginPage.clickRegister();
//        _3_2_RegisterPage.clickRegister();
        _3_3_RegisterPage.addInputs("best name", myData.getEmail(), myData.getPassword());

    }
}
