package com.amazon.tests.Register;

import com.amazon.base.BaseTest;
import com.amazon.data.DataBase;
import com.amazon.pages.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    private static DataBase myData = DataBase.startDataBase();
//    static String url= _1_BasePage.getUrl("qa");

    @BeforeClass
    public static void setUp(){
        myData.logout();
        myData.setEmail("abcABC.ABC@gmail.com");
        myData.setPassword("Hesh123@#$");
//        **** Resetting DB is done ******
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(myData.url); //open the driver to this URL
        _1_BasePage.setDriver(driver);
    }


    @Test
    public void userRegsiter(){
        _2_HomePage.signinLink();
        _3_1_LoginPage.setUsername(myData.getEmail());
        _3_1_LoginPage.clickRegister();
        _3_2_RegisterPage.clickRegister();
        _3_3_RegisterPage.isCreate();
        _3_3_RegisterPage.addInputs("34324","hesham", myData.getPassword());


//        _3_2_RegisterPage.clickRegister();
//        Assert.assertTrue(_3_2_RegisterPage.isStartHereLink(),"not existed");
//        _2_HomePage.signinLink();
//        _3_1_LoginPage.clickRegister();
////        _3_2_RegisterPage.clickRegister();
//        _3_3_RegisterPage.addInputs("best name", myData.getEmail(), myData.getPassword());
    }

}
