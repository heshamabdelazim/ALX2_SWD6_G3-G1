package com.amazon.tests.Register;

import com.amazon.base.BaseTest;
import com.amazon.data.DataBase;
import com.amazon.pages.*;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TC_1_Register extends BaseTest {

    @Test
    public void userRegister() {
        HomePage.signinLink();
        LoginPage.setUsername(DataBase.registerMail);
        LoginPage.clickRegister();
        RegisterPageContinue.clickRegister();
        RegisterPage.isCreate();
        RegisterPage.addInputs(DataBase.registerPhone, DataBase.registerName, DataBase.registerPassword);


        test.info("Testing registration...");
        test.pass("Registration test passed");

    }
}
