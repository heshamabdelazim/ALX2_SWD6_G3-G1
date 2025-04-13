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
        wait(2);

        // Confirm Language Page opened
        Assert.assertTrue(_13_LanguagePage.isLanguagePageVisible(),"Language Page not visible");

        // Step 2: Choose Arabic Language button
        _13_LanguagePage.clickArabicRadioButton();
        wait(2);

        // Step 3: Click submit button
        _13_LanguagePage.clickSubmitButton();
        wait(2);

        // Step 4: Confirm login success
        Assert.assertTrue(_2_HomePage.isArabicCartTitleVisible(), "Language is not arabic");
        wait(1);

    }
}


