package com.amazon.tests.Register;

import com.amazon.base.BaseTest;
import com.amazon.data.DataBase;
import com.amazon.pages.*;
import org.testng.annotations.Test;

public class TC_1_Register extends BaseTest {

    @Test
    public void userRegister() {
        HomePage.signinLink();
        LoginPage.setUsername(DataBase.registerMail);
        LoginPage.clickRegister();
        RegisterPageContinue.clickRegister();
        RegisterPage.isCreate();
        RegisterPage.addInputs(DataBase.registerPhone, DataBase.registerName, DataBase.registerPassword);

    }
}