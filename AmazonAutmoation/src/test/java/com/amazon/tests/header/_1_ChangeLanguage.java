package com.amazon.tests.header;

import com.amazon.base.BaseTest;
import com.amazon.pages._13_LanguagePage;
import com.amazon.pages._2_HomePage;
import com.amazon.pages._3_1_LoginPage;
import com.amazon.pages._4_ContinuePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _1_ChangeLanguage extends BaseTest {

    @Test
    public void testChangeLanguage() {

        // Step 1: Click Language Link
        _2_HomePage.openLanguagePage();

        // Step 2: Choose Arabic Language button
        _13_LanguagePage.clickArabicRadioButton();

        // Step 3: Click submit button
        _13_LanguagePage.clickSubmitButton();

        // Step 4: Confirm login success
        Assert.assertTrue(_2_HomePage.isAccountLinkVisible(), "Homepage is not visible");

    }
}


