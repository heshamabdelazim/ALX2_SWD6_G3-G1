package com.amazon.tests.login;

import com.amazon.pages._4_ContinuePage;
import com.amazon.pages._2_HomePage;
import com.amazon.pages._3_LoginPage;
import com.amazon.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginPage() {
        // Step 1: Click Sign-in
        HomePage.signinLink();

        // Step 2: Enter username/phone
        _3_LoginPage.setUsername("+201096933795");
        _3_LoginPage.signinButton();

        // Step 3: Enter password
        _4_ContinuePage.setPassword("aA1!testest00");
        _4_ContinuePage.clickContinueButton();

        // Step 4: Confirm login success
        Assert.assertTrue(_2_HomePage.isAccountLinkVisible(), "Login failed: Account link not visible.");

    }
}


