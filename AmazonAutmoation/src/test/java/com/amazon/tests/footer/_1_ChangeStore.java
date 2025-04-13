package com.amazon.tests.footer;

import com.amazon.base.BaseTest;
import com.amazon.pages._2_HomePage;
import com.amazon.pages._3_1_LoginPage;
import com.amazon.pages._4_ContinuePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _1_ChangeStore extends BaseTest {

    @Test
    public void testChangeStore() {
        // Step 1: Click Sign-in
        _2_HomePage.signinLink(); //this return new loginpage()

        // Step 2: Enter username/phone
        _3_1_LoginPage.setUsername("+201096933795");
        _3_1_LoginPage.signinButton();

        // Step 3: Enter password
        _4_ContinuePage.setPassword("aA1!testest00");
        _4_ContinuePage.clickContinueButton();

        // Step 4: Confirm login success
        Assert.assertTrue(_2_HomePage.isAccountLinkVisible(), "Login failed: Account link not visible.");

    }
}


