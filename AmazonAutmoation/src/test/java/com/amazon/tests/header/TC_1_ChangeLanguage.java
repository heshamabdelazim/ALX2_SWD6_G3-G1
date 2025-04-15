package com.amazon.tests.header;

import com.amazon.base.BaseTest;
import com.amazon.pages.LanguagePage;
import com.amazon.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_1_ChangeLanguage extends BaseTest {

    @Test
    public void testChangeLanguage() {

        // Step 1: Click Language Link
        HomePage.openLanguagePage();
        wait(2);

        // Confirm Language Page opened
        Assert.assertTrue(LanguagePage.isLanguagePageVisible(),"Language Page not visible");

        // Step 2: Choose Arabic Language button
        LanguagePage.clickArabicRadioButton();
        wait(2);

        // Step 3: Click submit button
        LanguagePage.clickSubmitButton();
        wait(2);

        // Step 4: Confirm login success
        Assert.assertTrue(HomePage.isArabicCartTitleVisible(), "Language is not arabic");
        wait(1);

    }
}


