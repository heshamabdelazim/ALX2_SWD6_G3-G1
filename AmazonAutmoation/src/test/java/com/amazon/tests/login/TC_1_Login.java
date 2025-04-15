package com.amazon.tests.login;

import com.amazon.data.DataBase;
import com.amazon.pages.ContinuePage;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import com.amazon.base.BaseTest;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TC_1_Login extends BaseTest {

    DataBase myData= DataBase.startDataBase();


    @Test
    public void testLoginPage() {
        // Step 1: Click Sign-in
        HomePage.signinLink(); //this return new login page()

        // Step 2: Enter username/phone
        LoginPage.setUsername(myData.email);
        LoginPage.signinButton();

        // Step 3: Enter password
        ContinuePage.setPassword(myData.password);
        ContinuePage.clickContinueButton();

        // Step 4: Confirm login success
        Assert.assertTrue(HomePage.isAccountLinkVisible(), "Login failed: Account link not visible.");

        test.info("Testing login...");
        test.pass("Login test passed");

    }
}


