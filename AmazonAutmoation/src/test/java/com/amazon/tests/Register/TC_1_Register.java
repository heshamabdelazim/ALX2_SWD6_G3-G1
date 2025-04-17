package com.amazon.tests.Register;

import com.amazon.base.BaseTest;
import com.amazon.data.DataBase;
import com.amazon.pages.*;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TC_1_Register extends BaseTest {
    @Test
    public void userRegister() {
        //Open sign page
        HomePage.signinLink();
        //add new email
        LoginPage.setUsername(DataBase.registerMail);
        LoginPage.clickRegister(); //continue button click
        //the continue button is here?
        Assert.assertTrue(RegisterPageContinue.isProceed(), "the continue button not displayed");
        //Click proceed
        RegisterPageContinue.continueAgain();
        // the new page has head "Create Account" ?
        Assert.assertTrue(RegisterPage.isCreate_atHead(), "Create account is not at head");
        // Verify button is here ?
        Assert.assertTrue(RegisterPage.isVerify(), "the Verify button not displayed");
        // Conditions link is here?
        Assert.assertTrue(RegisterPage.isConditionsLink(), "the Conditions link is not displayed");
        // Privacy link is here?
        Assert.assertTrue(RegisterPage.isPrivacyLink(), "the Privacy link is not displayed");
        //add inputs into the form fields
        RegisterPage.addInputs(DataBase.registerPhone, DataBase.registerName, DataBase.registerPassword);

        test.info("Testing registration...");
        test.pass("Registration test passed");
    }
}
